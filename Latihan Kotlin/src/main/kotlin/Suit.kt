import kotlin.random.Random

//welcome
fun main() {
    println("Selamat datang di permainan SUIT!")
    val navigasi =
        "Kamu dapat bermain dengan navigasi sebagai berikut:\n[1] Gunting\n[2] Batu\n[3] Kertas\n[0] Close Program"
    println(navigasi)
    inp1()
}

//input
fun inp1() {
    while (true) {
        print("\nMohon masukan pilihan kamu: ")
        val player = readLine()!!.toInt()
        val list = listOf("BATU", "GUNTING", "KERTAS")
        val randomIndex = Random.nextInt(list.size)
        val randomcomp = list[randomIndex]
        //output
        println("________________________")
        if (player == 1) {
            println("Kamu memilih GUNTING")
            println("Komputer memilih $randomcomp")
            when (randomcomp) {
                "GUNTING" -> {
                    println("Hasil : DRAW!!!")
                }

                "BATU" -> {
                    println("Kamu KALAH!!!")
                }

                else -> println("Kamu MENANG!!!")
            }
        }
        if (player == 2) {
            println("Kamu memilih BATU")
            println("Komputer memilih $randomcomp")
            when (randomcomp) {
                "GUNTING" -> {
                    println("Hasil: Kamu MENANG!!!")
                }

                "BATU" -> {
                    println("Hasil: DRAW!!!")
                }

                else -> println("Hasil: Kamu KALAH!!!")
            }
        }
        if (player == 3) {
            println("Kamu memilih KERTAS")
            println("Komputer memilih $randomcomp")
            when (randomcomp) {
                "BATU" -> {
                    println("Hasil: kamu MENANG!!!")
                }

                "KERTAS" -> {
                    println("Hasil: DRAW!!!")
                }

                else -> println("Hasil: Kamu KALAH!!!")
            }
        }
        if (player == 4) {
            print("[1] Gunting\n[2] Batu\n[3] Kertas\n[0] Close Program\n")
        } else if (player == 0) {
            break
        } else if (player > 4) println("Mohon masukan angka sesuai navigasi yang sudah diberikan! atau ketik [4] untuk melihat navigasi")
    }
}