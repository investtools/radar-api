# coding: utf-8
lib = File.expand_path('../lib', __FILE__)
$LOAD_PATH.unshift(lib) unless $LOAD_PATH.include?(lib)

Gem::Specification.new do |spec|
  spec.name          = "radar-api-legacy"
  spec.version       = File.read(File.expand_path('../../version.txt', __FILE__))
  spec.authors       = ["André Aizim Kelmanson"]
  spec.email         = ["andre@investtools.com.br"]
  spec.summary       = %q{Radar API}
  spec.description   = %q{Radar API}
  spec.homepage      = "http://www.investtools.com.br/"
  spec.license       = "MIT"

  spec.files         = `git ls-files`.split($/)
  spec.executables   = spec.files.grep(%r{^bin/}) { |f| File.basename(f) }
  spec.test_files    = spec.files.grep(%r{^(test|spec|features)/})
  spec.require_paths = ["lib", "gen"]

  spec.add_development_dependency "bundler", "~> 1.5"
  spec.add_development_dependency "guard-rake", "0.0.9"
  spec.add_dependency "thrift", "~> 0.9.0"
end
