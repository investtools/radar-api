guard :shell do
  watch('radar.thrift') do |m|
    `./build.sh #{m[0]}`
    n 'Build failed!', 'radar.thrift', :failed if $?.exitstatus != 0
  end
end
