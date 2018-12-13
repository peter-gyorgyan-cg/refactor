object Utils {
  // 0, 0 -> false
  // 0, 1 -> true
  // 1, 0 -> true
  // 1, 1 -> false
  def f(i1: Int, i2: Int) = {
    require(i1 <=1 && i1 >=0)
    require(i2 <=1 && i2 >=0)
    i1 + i2 - 2 * i1 * i2
  }
}

object Exercise01 extends App {

  var i1 = true
  var i2 = false

  if(Utils.f(if(i1==true) 1 else 0,if(i2==true) 1 else 0) match {
    case 1 => true
    case _ => false
  }) {
    println("Well done!")
  } else {
    println("Keep refactoring!")
  }

}
