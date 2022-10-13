package example

import akka.actor.ActorSystem

object MyClass extends App {
  println("Step 1: create an actor system")
  val system = ActorSystem("DonutStoreActorSystem")
  println("\nStep 2: close the actor system")
  val isTerminated = system.terminate()

}
