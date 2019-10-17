package com.example.naufalalf.hitunggajiuts

class Staff(nama:String, nip:String,alamat:String):Pegawai(nama, nip,alamat) {
    override var nama:String? = super.nama
    override var nip:String?=super.nip
    override var alamat:String?=super.alamat

    var kehadiran:Int
        get() {
            return kehadiran
        }
        set(value) {kehadiran=value}
    var gaji:Double=1500000.0
        get() {
            return gaji+(kehadiran*(gaji*0.1))
        }
}