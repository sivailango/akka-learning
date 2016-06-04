name := "akka-learning"

version := "1.0"

scalaVersion := "2.11.8"

EclipseKeys.projectFlavor := EclipseProjectFlavor.Scala
EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

libraryDependencies ++= Seq(
	"com.typesafe" % "config" % "1.2.1",
	"com.typesafe.akka" % "akka-actor_2.11" % "2.4.6"
)
