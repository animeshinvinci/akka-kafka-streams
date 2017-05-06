import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl._
import scala.concurrent.duration._

/**
  *
  *
  *
  *
  *
  * Created by animesh on 5/6/17.
  *
  *
  *
  *
  *
  */

object MyFirstStream {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("MyActorSystem")
    implicit val materializer = ActorMaterializer()

    // stream definition and execution code goes here
    // A perfectly useless stream
    val stream1 = Source.maybe.to(Sink.ignore)
    //stream1.run()

    // A stream of a repeating element to standard output using tick
    val stream4 = Source.tick(0 seconds, 2 seconds, "Hello World!").to(Sink.foreach(println))
    stream4.run()

  }

}
