fun main(){
    println(lcm(8, 4))
    println(lcm(3, 9))
    println(lcm(1, 15))
    println(lcm(6, 7))
}

fun lcm(num1: Int, num2: Int): Int{
    var lcm = if (num1 > num2) num1 else num2

    while (true){
        if (lcm % num1 == 0 && lcm % num2 == 0){
            break
        }
        ++lcm
    }
    return lcm
}