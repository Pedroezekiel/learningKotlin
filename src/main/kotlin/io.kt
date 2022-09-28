import java.util.Scanner
fun main() {
//    print("Enter text: ")
//        val stringInput = readLine()!!
//        println("You entered: $stringInput")
//      val reader = Scanner(System.`in`)
//    print("Enter a number: ")
//    var number:Int = reader.nextInt()
//    println("You entered: $number")
        val input = Scanner(System.`in`)
        print("Enter first number: ")
        val firstNumber:Int=input.nextInt()
        print("Enter second number: ")
        val secondNumber:Int=input.nextInt()
        println("$firstNumber + $secondNumber = ${firstNumber + secondNumber}")
        var max = 0
        var comparing = if (firstNumber > secondNumber ){
                max = firstNumber
                "max between $firstNumber and $secondNumber = $max"
        }else if (firstNumber == secondNumber){
            "$firstNumber and $secondNumber are the same "
        }
        else{
                max = secondNumber
                "max between $firstNumber and $secondNumber = $max"
        }
        println(comparing)
}
