name := """RabHome"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "com.etaty.rediscala" %% "rediscala" % "1.5.0",
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc41",
  "com.typesafe.play" %% "anorm" % "2.5.0"
)
resolvers += "rediscala" at "http://dl.bintray.com/etaty/maven"
resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator


fork in run := true