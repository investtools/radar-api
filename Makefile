all: js rb


js: js/package-lock.json js/node_modules js/*_pb.*

js/node_modules: js/package.json
	cd js && npm install
	touch js/node_modules

js/package-lock.json: version.txt
	cd js && npm run sync-version

js/*_pb.*: js/node_modules *.proto
	rm -rf js/*_pb.*
	cd js && npm run build

rb: rb/Gemfile.lock rb/gen

rb/gen: *.proto
	rm -rf rb/gen/*
	cd rb && bundle install && bundle exec rake compile

rb/Gemfile.lock: version.txt
	cd rb && bundle install
	touch rb/Gemfile.lock

release: release-rb release-js

release-rb: rb
	cd rb && bundle exec rake release

release-js: js
	cd js && npm run sync-version && npm publish
