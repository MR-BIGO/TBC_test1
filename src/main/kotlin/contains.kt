fun main(){
    println(check("fgdsfsd$321fds"))
    println(check("fgdsfsdf321fds"))
    println(check("fgdsfsd312321fds"))
    println(check("fgdsfsd$321fds$"))
}

fun check(text: String): Boolean{

    return text.contains("$")
}