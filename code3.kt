// Ini adalah fungsi untuk tambah, didalamnya terdapat variabel
// angka1 dan 2 yang bersifat integer.
fun tambah(angka1: Int, angka2: Int): Int {
    // ini akan mengembalikan nilai angka yang diinoutkan di dalam fungsi main
    return angka1 + angka2
}

// Ini adalah fungsi utama dari kotlin yang memanggil fungsi tambah
fun main() {
    //Hasil adalah variabel yang akan menginputkan value dari angka1 dan 2
    val hasil = tambah(5, 3)
    println("Hasil penjumlahan: $hasil")
}
