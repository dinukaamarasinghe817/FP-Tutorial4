object tutorial4{
    def main(args: Array[String])={
        args(0) match{
            case "q1" => def interest(x:Double):Double = x match{
                            case x if x<= 20000 => x*0.02
                            case x if x<= 200000 => x*0.04
                            case x if x<= 2000000 => x*0.035
                            case x if x> 2000000 => x*0.065
                        }
                        print("Enter the number of amount : ")
                        var amount = scala.io.StdIn.readDouble()
                        print("Interest : "+interest(amount))

            case "q2" => {  print("Enter a number : ")
                            var input = scala.io.StdIn.readInt()
                            def PatternMatching(x:Int):Any = x match{
                                case x if x<=0 => println("The number is Negative/Zero")
                                case x if x%2==0 => println("The number is even")
                                case x => println("The number is odd")
                            }
                            PatternMatching(input)
                        }

            case "q3" => {
                            def toUpper(x: String): String = {
                                x.toUpperCase()
                            }
                            def toLower(x: String): String = {
                                x.toLowerCase()
                            }

                            def formatNames(name: String, func: (String) => String): String = {
                                func(name)
                            }

                            println(formatNames("Benny",toUpper(_)))
                            print(formatNames("Ni",toUpper(_))+formatNames("roshan",toLower(_)))
                            println("")
                            println(formatNames("Saman",toLower(_)))
                            println(formatNames("K",toUpper(_))+formatNames("umar",toLower(_))+formatNames("a",toUpper(_)))
                        }
        }
    }
}
