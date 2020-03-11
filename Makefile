all: js/*_pb.js rb/gen html

js/node_modules: js/package.json
	cd js && npm install
	touch js/node_modules

js/*_pb.*: js/node_modules *.proto
	rm -rf js/*_pb.*
	cd js && npm run build

rb/gen: *.proto
	rm -rf rb/gen/*
	cd rb && bundle install && bundle exec rake compile

release: js/lib
	cd js && npm run sync-version && npm publish
  cd rb && bundle exec rake release