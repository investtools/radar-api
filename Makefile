THRIFT=thrift
SOURCE=radar.thrift

all: js/lib rb/lib/radar/api java/src html

js/lib: $(SOURCE)
	rm -rf js/lib/*
	$(THRIFT) --gen js:node  -out js/lib           $(SOURCE)

rb/lib/radar/api: $(SOURCE)
	rm -rf rb/lib/radar/api/*
	$(THRIFT) --gen rb       -out rb/lib/radar/api $(SOURCE)

java/src: $(SOURCE)
	rm -rf java/src/*
	$(THRIFT) --gen java     -out java/src         $(SOURCE)

html: $(SOURCE)
	rm -rf html/*
	$(THRIFT) --gen html     -out html             $(SOURCE)
