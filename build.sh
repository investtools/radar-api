rm -rf java/src
mkdir -p java/src
thrift --gen rb -out rb/lib/radar/api radar.thrift &&
thrift --gen java -out java/src radar.thrift &&
thrift --gen html -out html radar.thrift