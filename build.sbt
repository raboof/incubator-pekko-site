enablePlugins(ParadoxPlugin, PekkoParadoxPlugin)

resolvers += "Apache Nexus Snapshots".at("https://repository.apache.org/content/repositories/snapshots/")

pekkoParadoxGithub := Some("https://github.com/apache/incubator-pekko-site")