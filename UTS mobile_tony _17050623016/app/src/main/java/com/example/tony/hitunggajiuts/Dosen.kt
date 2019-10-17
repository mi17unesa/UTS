package com.example.tony.hitunggajiuts

class Dosen(nama:String,nip:String,alamat:String):Pegawai(nip,nama, alamat) {
    override var nama:String? = super.nama
    override var nip:String?=super.nip
    override var alamat:String?=super.alamat
    var sks:Int
        get() {
            return sks
        }
        set(value) {sks=value}
    var gaji:Double=1500000.0
        get() {
            return gaji+(sks*(gaji*0.1))
        }


}