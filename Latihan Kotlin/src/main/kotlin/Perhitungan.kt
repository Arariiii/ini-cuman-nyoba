import kotlin.math.pow

fun main() {
    print("[1] Menghitung kecepatan \n[2] Menghitung luas segitiga \n[3] Menghitung luas balok \n[4] Menghitung luas lingkaran \n\n[0] Close Program")

    while (true) {
        print("\n -----------------------\nPilih rumus yang ingin dipakai: ")
        val pilihan = readLine()!!.toInt()
        if (pilihan == 1) {
            kecepatan()
        } else if (pilihan == 2) {
            segitiga()
        } else if (pilihan == 3) {
            balok()
        } else if (pilihan == 4) {
            lingkaran()
        } else if (pilihan == 0) {
            print("Terima kasih!")
            break
        } else {
            print("Angka tidak sesuai pilihan, mohon input lagi")
        }
    }
}

fun kecepatan() {
    print("Masukan jarak: ")
    val jarak = readLine()!!.toInt()
    print("Masukan waktu: ")
    val waktu = readLine()!!.toInt()
    print("\n\n\n\n\n\nJAWABAN: $jarak x $waktu = " + (jarak * waktu))
}

fun segitiga() {
    print("Masukan alas: ")
    val alas = readLine()!!.toInt()
    print("Masukan tinggi: ")
    val tinggi = readLine()!!.toInt()
    print("\n\n\n\n\n\nJAWABAN: 1/2 x $alas x $tinggi = " + (0.5 * alas * tinggi))
}

fun balok() {
    print("Masukan panjang: ")
    val panjang = readLine()!!.toInt()
    print("Masukan tinggi: ")
    val tinggi = readLine()!!.toInt()
    print("Masukan lebar: ")
    val lebar = readLine()!!.toInt()
    val pl = panjang * lebar
    val pt = panjang * tinggi
    val lt = lebar * tinggi
    print("\n\n\n\n\n\nJAWABAN: 2 x ($pl + $pt + $lt) = " + (2 * (pl + pt + lt)))
}

fun lingkaran() {
    print("Masukan jari - jari: ")
    val jari = readLine()!!.toDouble()
    val r2 = jari.pow(2.0)
    val luaslingkaran = 3.17 * r2
    print("\n\n\n\n\n\nJAWABAN: 3.17 x $r2 = $luaslingkaran")
}