rm -rf java/src/*
rm -rf js/lib/*
rm -rf rb/lib/radar/api/*
thrift --gen rb       -out rb/lib/radar/api radar.thrift &&
thrift --gen java     -out java/src         radar.thrift &&
thrift --gen js:node  -out js/lib           radar.thrift &&
thrift --gen html     -out html             radar.thrift