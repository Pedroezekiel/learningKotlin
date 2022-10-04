fun main() {
    print("enter hour: ")
    var  userInputHour = readLine()?.toInt()
    print("enter minutes: ")
    var  userInputMinutes = readLine()?.toInt()
    print("enter second: ")
    var userInputSecond = readLine()?.toInt()

    val display_hour = if(userInputHour!! > 12) userInputHour % 12 else userInputHour
    println("$display_hour : $userInputMinutes :  $userInputSecond")
    }