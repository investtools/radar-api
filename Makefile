all: js node rb

js: js/node_modules js/generated/*_pb.*

js/node_modules: js/package.json
	cd js && npm install
	touch js/node_modules

js/generated/*_pb.*: js/node_modules *.proto
	rm -rf js/generated/*
	cd js && npm run build

node: node/package-lock.json node/node_modules node/*_pb.*

node/node_modules: node/package.json
	cd node && npm install
	touch node/node_modules

node/package-lock.json: version.txt
	cd node && npm run sync-version

node/*_pb.*: node/node_modules *.proto
	rm -rf node/*_pb.*
	cd node && npm run build

rb: rb/Gemfile.lock rb/gen

rb/gen: *.proto
	rm -rf rb/gen/*
	cd rb && bundle install && bundle exec rake compile

rb/Gemfile.lock: version.txt
	cd rb && bundle install
	touch rb/Gemfile.lock

release: release-rb release-node

release-rb: rb
	cd rb && bundle exec rake release

release-node: node
	cd node && npm run sync-version && npm publish
