package com.example.uts

class utama {

    fun main(args: Array<String>){
        var s1: staf
        s1.setNm("Rena")
        s1.setKehadiran(25)

        var s2: dosen
        s2.setNm("Agus")
        s2.setSKS(10)

        var p1: pegawai
        p1.setNm("Tina")

        var gaji: daftargaji
        gaji.addPegawai(s1)
        gaji.addPegawai(s2)
        gaji.addPegawai(p1)
        gaji.printSemua()
    }
}