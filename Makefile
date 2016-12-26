#THRIFT=thrift
THRIFT=docker run --rm -t -i -w /radar-api -v `pwd`:/radar-api thrift thrift
SOURCE=radar.thrift

all: js/lib csharp/src rb/gen java/src html

js/lib: *.thrift
	rm -rf js/lib/*
	$(THRIFT) -r --gen js:node                             -out js/lib     $(SOURCE)

csharp/src: *.thrift
	rm -rf csharp/src/*
	$(THRIFT) -r --gen csharp                              -out csharp/src $(SOURCE)

rb/gen: *.thrift 
	rm -rf rb/gen/*
	$(THRIFT) -r --gen rb:namespaced                       -out rb/gen     $(SOURCE)

java/src: *.thrift 
	rm -rf java/src/*
	$(THRIFT) -r --gen java:generated_annotations=suppress -out java/src   $(SOURCE)

html: *.thrift 
	rm -rf html/*
	$(THRIFT) -r --gen html                                -out html       $(SOURCE)

release: js/lib
	#git diff --exit-code
	#git diff --cached --exit-code
	cd js && npm publish
