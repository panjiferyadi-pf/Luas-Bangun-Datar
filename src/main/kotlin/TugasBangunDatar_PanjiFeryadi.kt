fun main(){
    var garisPersegi : String = "------------MENGHITUNG LUAS & KELILING PERSEGI--------------"
    var garisPersegiPanjang : String = "------------MENGHITUNG LUAS & KELILING PERSEGI PANJANG--------------"
    var garisLingkaran : String = "------------MENGHITUNG LUAS & KELILING LINGKARAN--------------"
    var garisSegitiga : String = "------------MENGHITUNG LUAS & KELILING SEGITIGA--------------"

    println(garisPersegi)
        print("Masukkan nilai sisi: ")
        val persegi = readLine()
            var persegii : Int = Integer.valueOf(persegi)
                var persegiii : Double = persegii.toDouble()

        var luasPersegi : Double = persegiii * persegiii
        var kelilingPersegi : Double = 4 * persegiii
    println("Luas persegi dengan sisi $persegiii adalah = $luasPersegi")
    println("Keliling persegi dengan sisi $persegiii adalah = $kelilingPersegi")

    println(garisPersegiPanjang)
        print("Masukkan nilai panjang   : ")
        val pppanjang = readLine()
            var panjangg  : Int = Integer.valueOf(pppanjang)
                var panjanggd : Double = panjangg.toDouble()

        print("Masukkan nilai lebar     : ")
        val pplebar = readLine()
            var lebarr : Int = Integer.valueOf(pplebar)
                var lebarrd : Double = lebarr.toDouble()

        var luaspp : Double = panjanggd * lebarrd
        var kelilingpp : Double = (2 * panjanggd) + (2 * lebarrd)
    println("Luas persegi dengan panjang $panjanggd dan lebar $lebarrd adalah = $luaspp")
    println("Keliling persegi dengan sisi $panjanggd dan lebar $lebarrd adalah = $kelilingpp")

    println(garisLingkaran)
        print("Masukkan nilai jari-jari: ")
        val jari2 = readLine()
            var jari2l : Int = Integer.valueOf(jari2)
                var jari2ld : Double = jari2l.toDouble()

        var luasling : Double = 3.14 * jari2ld * jari2ld
        var kelilingling : Double = 2 * 3.14 * jari2ld
    println("Luas lingkarang dengan jari-jari $jari2ld adalah = $luasling")
    println("Keliling lingkaran dengan jari-jari $jari2ld adalah = $kelilingling")

    println(garisSegitiga)
        print("Masukkan nilai alas      : ")
        val alas = readLine()
            var alass : Int = Integer.valueOf(alas)
                var alassd : Double = alass.toDouble()

        print("Masukkan nilai tinggi    : ")
        val tinggi = readLine()
            var tinggii : Int = Integer.valueOf(tinggi)
                var tinggiid : Double = tinggii.toDouble()

        print("Masukkan nilai sisi      : ")
        val sisi = readLine()
            var sisii : Int = Integer.valueOf(sisi)
                var sisiid : Double = sisii.toDouble()

        var luassegitiga : Double = 0.5 * alassd * tinggiid
        var kelilingsegitiga : Double = 3 * sisiid
    println("Luas segitiga dengan alas $alassd dan tinggi $tinggiid adalah = $luassegitiga")
    println("Keliling segitiga dengan sisi $sisiid adalah = $kelilingsegitiga")

}