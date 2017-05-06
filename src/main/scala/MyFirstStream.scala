import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl._

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
  }

}
