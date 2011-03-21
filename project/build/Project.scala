import sbt._

class Project(info: ProjectInfo) extends DefaultWebProject(info) {
  val liftVersion = "2.3-RC3"

  override def ivyRepositories =
    Seq(Resolver.defaultLocal(None)) ++
    Seq(DefaultMavenRepository, ScalaToolsReleases) ++ repositories

  override def libraryDependencies = Set(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile->default",
    "org.mortbay.jetty" % "jetty" % "6.1.24" % "test->default",
    "junit" % "junit" % "4.5" % "test->default",
    "ch.qos.logback" % "logback-classic" % "0.9.26",
    "org.scala-tools.testing" %% "specs" % "1.6.6" % "test->default"
  ) ++ super.libraryDependencies
}
