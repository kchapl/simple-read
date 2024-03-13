package simpleread

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple:
  val run = SimplereadServer.run[IO]
