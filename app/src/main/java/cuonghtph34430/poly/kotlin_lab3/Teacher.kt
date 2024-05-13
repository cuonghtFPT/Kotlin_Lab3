package cuonghtph34430.poly.kotlin_lab3

import java.lang.reflect.Constructor

class Teacher(
    var hoTen: String,
    var tuoi: Int,
    var queQuan: String,
    var maGV: String,
    var luongCung: Float,
    var luongThuong: Float,
    var tienPhat: Float
)
{
    constructor(hoTen: String, tuoi: Int, queQuan: String, maGV: String, luongCung: Float, luongThuong: Float, tienPhat: Float, daTotNghiep: Boolean, diemTB: Float) : this(hoTen, tuoi, queQuan, maGV, luongCung, luongThuong, tienPhat) {
        // Khởi tạo thuộc tính của constructor mới
        this.hoTen=hoTen
        this.tuoi=tuoi
        this.queQuan=queQuan
        this.maGV=maGV
        this.luongCung=luongCung
        this.luongThuong=luongThuong
        this.tienPhat=tienPhat
    }



    fun tinhLuongThucLinh(): Float {
        val luongThucLinh = luongCung + luongThuong - tienPhat
        return luongThucLinh
    }

    fun getThongTin(): String {
        return "Họ tên: $hoTen, Tuổi: $tuoi, Quê quán: $queQuan, Mã số giáo viên: $maGV, " +
                "Lương cứng: $luongCung, Lương thưởng: $luongThuong, Tiền phạt: $tienPhat, " +
                "Lương thực lĩnh: ${tinhLuongThucLinh()}"
    }

    override fun toString(): String {
        return "Teacher(hoTen='$hoTen', tuoi=$tuoi, queQuan='$queQuan', maGV='$maGV', luongCung=$luongCung, luongThuong=$luongThuong, tienPhat=$tienPhat)"
    }
}
