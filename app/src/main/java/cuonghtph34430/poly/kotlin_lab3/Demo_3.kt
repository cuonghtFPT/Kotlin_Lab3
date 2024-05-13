package cuonghtph34430.poly.kotlin_lab3

fun main() {
    val soA = 5
    var soB = 10

    val luyThuaBac3 = soA.let{it*it*it}

    val title = "Buoi 3 - Android Kotlin"
    val lengh = title.let{
        if(it == null) {
            0
        }else {
            it.length
        }
    }

    with(soB) {
        soB = this.inc()
        println("So b: $soB")
    }
    println("Tong cua $soA va $soB = ${tinhTong(soA,soB)}")
    println("Phep nhan cua $soA va $soB = ${phepNhan(soA,soB)}")
    println("Phep chia $soA va $soB = ${phepChia(soA.toFloat(),soB.toFloat()) ()}")
    println("Luy thua cua $soA = ${luyThua(soA)}")
    println("Luy thua bac 3: "+luyThuaBac3)
    println("Do dai chuoi $title = $lengh")

}

val tinhTong = {soA : Int, soB : Int -> (soA + soB)}

val phepNhan : (Int,Int) -> Int = {soA : Int, soB : Int -> (soA * soB)}

val phepChia = {soA : Float, soB : Float ->{
    if(soB == 0f) {
        "so bi chia phai khac 0"
    }else {
        val kq = soA / soB
        kq
    }
}}

val luyThua : (Int) -> Int = {it * it}