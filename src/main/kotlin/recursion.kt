fun main(){

    println(sumEvenNumbers(2, 100).toString())
    println(sumEvenNumbers(1, 100).toString())
}

fun sumEvenNumbers(start: Int, end: Int): Int {
    if (start > end) {
        return 0
    }

    return if (start % 2 == 0) {
        start + sumEvenNumbers(start + 2, end)
    } else {
        sumEvenNumbers(start + 1, end)
    }
}