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

                            def formatNames(name: String, index: Array[Int], func: (String) => String): String = {
                                if(index.isEmpty){
                                    func(name)
                                }else{
                                    var str = ""
                                    var i = 0
                                    while(i < name.length()){
                                        if(index.contains(i)) str=str+func(name.charAt(i).toString())
                                        else str=str+name.charAt(i).toString()

                                        i+=1
                                    }
                                    str
                                }
                            }

                            println(formatNames("Benny",Array(),toUpper(_)))
                            println(formatNames("Niroshan",Array(0,1),toUpper(_)))
                            println(formatNames("Saman",Array(),toLower(_)))
                            println(formatNames("Kumara",Array(5),toUpper(_)))
                        }
        }
    }
}