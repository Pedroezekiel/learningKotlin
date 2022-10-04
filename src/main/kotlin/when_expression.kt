fun main() {
    print("Enter something: ")
    var ch = readLine()?.uppercase()
    
    when(ch){
        "A"-> println("A is a Vowel")
        "E" -> println("E is a Vowel")
        "I" -> println("I is a Vowel")
        "O" -> println("O is a Vowel")
        "U" -> println("U is a Vowel")
        else -> println("$ch is consonant")
    }

    when(ch){
        "A","E","I","O","U" -> println("$ch is a vowel")
        else  ->  println("$ch is a Consonant")
    }
}