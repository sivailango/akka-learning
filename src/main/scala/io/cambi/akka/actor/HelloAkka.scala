/**
 *
 */
package io.cambi.akka.actor

import akka.actor.{Actor, ActorSystem, Props}

/**
 * @author valore
 *
 */
case class WhoToGreet(name: String)

class Greeter extends Actor {
  def receive = {
    case WhoToGreet(who) => println(s"Hello $who")
  }
}

object HelloAkka extends App {

  val system = ActorSystem("Hello-Akka")
  val greeter = system.actorOf(Props[Greeter], "greeter")
  
  greeter ! WhoToGreet("Akka")
  
}