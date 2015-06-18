THRIFT=thrift
SOURCE=radar.thrift

all: js/lib rb/lib/radar/api java/src html

js/lib: *.thrift
	rm -rf js/lib/*
	$(THRIFT) -r --gen js:node  -out js/lib           $(SOURCE)

rb/lib/radar/api: *.thrift 
	rm -rf rb/lib/radar/api/*
	$(THRIFT) -r --gen rb       -out rb/lib/radar/api $(SOURCE)

java/src: *.thrift 
	rm -rf java/src/*
	$(THRIFT) -r --gen java     -out java/src         $(SOURCE)

html: *.thrift 
	rm -rf html/*
	$(THRIFT) -r --gen html     -out html             $(SOURCE)

release: js/lib
	#git diff --exit-code
	#git diff --cached --exit-code
	cd js && npm publish
