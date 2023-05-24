fun main(){

    var pembuka : String = "----------------Input Nilai----------------"
    var penutup : String = "---------------Tampilan Data---------------"

    println(pembuka)
    print("Masukkan nilai matematika  : ")
    val matematika = readLine()
    print("Masukkan nilai kimia       : ")
    val kimia = readLine()
    print("Masukkan nilai fisika      : ")
    val fisika = readLine()

    var math = Integer.valueOf(matematika)
    var phys = Integer.valueOf(fisika)
    var chem = Integer.valueOf(kimia)

    var total : Int = math + chem + phys
    var rerata : Int = total/3
    var reratad : Double = rerata.toDouble()

    println(penutup)
    println("Total nilai                : $total")
    println("Rata-rata nilai            : %.4f".format(reratad))

}