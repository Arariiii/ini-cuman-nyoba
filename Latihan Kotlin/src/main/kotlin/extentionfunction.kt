fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)

fun main() {
    val myString = "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("First and last character is gone : $result")
}