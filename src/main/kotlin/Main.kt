fun main(args: Array<String>) {
    println("Hello World!")
    var language ="french"
    val  score =95
    language = "spanish"


    var age : Int =12
    val day : String = "Monday"

    println("Today is : $day")
    println("addition of $score and $age is ${score+age}")
    println("subtraction of $score and $age is ${score-age}")
    println("multiplication of $score and $age is ${score*age}")
    println("division of $score and $age is ${score/age}")
    println("modulus of $score and $age is ${score%age}")


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}