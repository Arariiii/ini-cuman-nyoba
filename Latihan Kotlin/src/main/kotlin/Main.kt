fun main() {
    //in
    print("MASUKAN ANGKA PERTAMA: ")
    val angka1 = readLine()!!.toInt()
    print("MASUKAN ANGKA KEDUA: ")
    val angka2 = readLine()!!.toInt()

    //out
    println("$angka1 + $angka2 = " + (angka1 + angka2))
    println("$angka1 - $angka2 = " + (angka1 - angka2))
    println("$angka1 * $angka2 = " + (angka1 * angka2))
    println("$angka1 / $angka2 = " + (angka1 / angka2))
    println("$angka1 % $angka2 = " + (angka1 % angka2))
}

