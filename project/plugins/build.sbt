resolvers += "Web plugin repo" at "http://siasia.github.com/maven2"

resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

resolvers += Resolver.url("Typesafe repository", new java.net.URL("http://typesafe.artifactoryonline.com/typesafe/ivy-releases/"))(Resolver.defaultIvyPatterns)

//Following means libraryDependencies += "com.github.siasia" %% "xsbt-web-plugin" % "0.1.0-<sbt version>""
libraryDependencies <+= sbtVersion(v => "com.github.siasia" %% "xsbt-web-plugin" % ("0.1.0-"+v))

libraryDependencies += "com.github.mpeltonen" %% "sbt-idea" % "0.10.0-SNAPSHOT"

