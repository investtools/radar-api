guard :shell do
  watch(%r{\.thrift$}) do |m|
    success = system 'make all'
    n 'Build failed!', 'radar.thrift', :failed unless success
    nil
  end
end
