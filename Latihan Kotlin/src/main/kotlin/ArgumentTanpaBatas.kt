fun main() {
    println(coba(1.5, 2.0))
    println(coba(1.5, 2.0, 3.5, 4.0, 5.8, 6.2))
    println(
        coba(
            1.5,
            2.0,
            3.5,
            4.0,
            5.8,
            6.2,
            3.5,
            4.0,
            5.8,
            6.2,
            3.5,
            4.0,
            5.8,
            6.2,
            3.5,
            4.0,
            5.8,
            6.2,
            3.5,
            4.0,
            5.8,
            6.2,
            3.5,
            4.0,
            5.8,
            6.2,
            3.5,
            4.0,
            5.8,
            6.2
        )
    )
}

fun coba(vararg numbers: Double): Double {
    var sum = 0.0
    for (number in numbers)
        sum += number
    return sum
}
