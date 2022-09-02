import kotlin.random.Random

fun main() {
    val list = listOf(1, 2, 3)
    val randomIndex = Random.nextInt(list.size)
    val randomElement = list[randomIndex]
while(true)
    // here we can use the selected element to print it for example
    println(randomElement)
}