guard :shell do
  watch('radar.thrift') do |m|
    success = system 'make'
    n 'Build failed!', 'radar.thrift', :failed unless success
    nil
  end
end
