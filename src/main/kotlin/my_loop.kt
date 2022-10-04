fun main() {

//
//    var num1 = 1..100
//    var sum =0
//    for (y in num1){
//        sum += y
//    }
////       while (y in num1){
////           sum += y
////       }
//    println(sum)

//    var sum2 = 0
//    var number: Int
//    while (true) {
//     print("Enter a number")
//        number = readLine()!!.toInt()
//        if (number == 0)
//            break
//            sum2 += number
//    }
//    print("sum = $sum2")

    first@for(i in 1..4){
        second@for(j in 1..2){
            println("I = $i; j = $j")
            if (i == 3)
                break@first
        }
    }
}
