
  Pod::Spec.new do |s|
    s.name = 'CapacitorIntentResolver'
    s.version = '1.0.0'
    s.summary = 'Run if there is an executable app'
    s.license = 'MIT'
    s.homepage = 'https://github.com/2skydev/capacitor-intent-resolver.git'
    s.author = '2sky'
    s.source = { :git => 'https://github.com/2skydev/capacitor-intent-resolver.git', :tag => s.version.to_s }
    s.source_files = 'ios/Plugin/**/*.{swift,h,m,c,cc,mm,cpp}'
    s.ios.deployment_target  = '11.0'
    s.dependency 'Capacitor'
  end