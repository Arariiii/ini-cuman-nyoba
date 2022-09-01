#in
def hitungkecepatan():
    jarak = int(input("Masukan jarak: "))
    waktu = int(input("Masukan waktu: "))
    kecepatan = int(jarak * waktu)
    print(jarak, "x", waktu, " = ", kecepatan)

def hitungluassegitiga():
    alas = int(input("Masukan alas: "))
    tinggi = int(input("Masukan tinggi: "))
    luassegitiga = 0.5 * alas * tinggi
    print("0.5 x", alas, "x", tinggi, "=",luassegitiga)

def hitungluasbalok():
    panjang = int(input("Masukan panjang: "))
    lebar = int(input("Masukan lebar: "))
    tinggi = int(input("Masukan tinggi: "))
    luasbalok = 2 * (panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)
    print("2 x","(",panjang,"x",lebar,") + (",panjang,"x",tinggi,") + (",lebar,"x",tinggi,") =",luasbalok)

def hitungluasbola():
    jari = int(input("Masukan jari - jari: "))
    luasbola = 4 * 3.14 * (jari**2)
    print("4 x 3.14 x",jari,"^2 =",luasbola)

#out
print("Pilih rumus yang akan dipakai\n\n[1] Hitung kecepatan\n[2] Luas segitiga\n[3] Luas balok\n[4] Luas bola\n\n[0] Terminate Program")

while True:
    userInput = int(input("\n-------------------\nMasukan angka sesuai perhitungan yang ingin kamu lakukan: "))
    print("-------------------\n")
    if(userInput == 1):
        hitungkecepatan()
    elif(userInput == 2):
        hitungluassegitiga()
    elif(userInput == 3):
        hitungluasbalok()
    elif(userInput == 4):
        hitungluasbola()
    elif(userInput == 0):
        print("Bye - bye")
        break
    else:
        print("Mohon masukan angka sesuai petunjuk yang tersedia")