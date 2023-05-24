fun main(){
    val nasiGoreng : Int = 25000
    val mieGoreng : Int = 22000
    val capCay : Int = 32000
    val total : Int = nasiGoreng + mieGoreng + capCay
    val diskon : String = "10%"
    val bayar : Int = 100000

    val diskoon : Int = total *  10/100

    val hargaBayar : Int = total - diskoon
    val kembalian : Int = bayar - hargaBayar

    println("Harga Nasi Goreng      = Rp.$nasiGoreng")
    println("Harga Mie Goreng       = Rp.$mieGoreng")
    println("Harga CapCay           = Rp.$capCay")
    println("Harga Total            = Rp.$total")
    println("Diskon                 = $diskon")
    println("Harga yang Dibayar     = Rp.$hargaBayar")
    println("Pembayaran             = Rp.$bayar")
    println("Kembalian              = Rp.$kembalian")
}