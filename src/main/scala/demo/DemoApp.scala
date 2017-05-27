package demo

import scala.scalajs.js
import cats._

object DemoApp extends js.JSApp {
  override def main(): Unit = {
    val order = new Eq[Int] {
      override def eqv(x: Int, y: Int): Boolean =
        x == y
    }
  }
}
