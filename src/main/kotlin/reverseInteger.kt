fun main(){
    println(reverseInteger(120))
    println(reverseInteger(12021))
    println(reverseInteger(12230))
}

fun reverseInteger(num: Int): Int{
    var number = num
    var reversed = 0

    while (number != 0){
        val digit = number % 10
        reversed = reversed * 10 + digit
        number /= 10
    }
    return reversed
}