fun main(){
    println(isPalindrome("aiaiaia"))
    println(isPalindrome("fsdfsf"))
    println(isPalindrome("laial"))
}

fun isPalindrome(text: String): Boolean{
    val revText = text.reversed()

    return text == revText
}