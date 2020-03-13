guard :shell do
  watch(%r{\.proto$}) do |m|
    success = system 'make all'
    n 'Build failed!', 'radar-api', :failed unless success
    nil
  end
end
