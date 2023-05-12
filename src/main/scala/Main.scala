import zio.{App, ExitCode, URIO, ZIO}

object Main extends App {

  def run(args: List[String]): URIO[zio.ZEnv, ExitCode] =
    myAppLogic.exitCode

  val myAppLogic: ZIO[zio.ZEnv, Nothing, Unit] =
    for {
      _ <- ZIO.effectTotal(println("Hello, ZIO!"))
    } yield ()
}
