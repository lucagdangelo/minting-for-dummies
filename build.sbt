lazy val root = project
  .in(file("."))
  .settings(
    name := "minting-for-dummies",

    version := "4.0.0",

    scalaVersion := "2.12.15",

    libraryDependencies ++= Seq(
      "org.ergoplatform" %% "ergo-appkit" % "5.0.1",
    ),

    assembly / assemblyJarName := s"${name.value}-${version.value}.jar",
    assembly / assemblyOutputPath := file(s"./${name.value}-${version.value}.jar/")

  )
