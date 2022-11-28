package langgen

implicit def toByte(i: Int): Byte = i.toByte

@main def main(args: String*): Unit = 

  if args.forall(_.forall(_.isDigit)) then
    println(
      Words().down(args.map(_.toInt)*).toWord
      // Words().down(1, 2, 3).up(1)
    )
  else
    println("Args Parameters are invalid")