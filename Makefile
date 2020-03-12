all: js/*_pb.js rb/gen

js/node_modules: js/package.json
	cd js && npm install
	touch js/node_modules

js/*_pb.*: js/node_modules *.proto
	rm -rf js/*_pb.*
	cd js && npm run build

rb/gen: *.proto
	rm -rf rb/gen/*
	cd rb && bundle install && bundle exec rake compile

release: release-rb release-js

release-rb: rb/gen
	cd rb && bundle exec rake release

release-js: js/*_pb.*
	cd js && npm run sync-version && npm publish
