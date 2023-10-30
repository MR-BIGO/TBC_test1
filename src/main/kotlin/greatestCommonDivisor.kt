import java.lang.Integer.min

fun main(){
    println(gcd(15, 5))
    println(gcd(7, 3))
    println(gcd(16, 2))
    println(gcd(43, 23))
}

fun gcd(num1: Int, num2: Int): Int{

    var gcd = 1
    if (num1 % num2 == 0) gcd = num2
    else if (num2 % num1 == 0) gcd = num1

    val i = 2
    (i .. min(num1, num2) / 2).forEach {
        if (num1 % it == 0 && num2 % it == 0) gcd = it
    }
    return gcd
}