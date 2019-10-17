package com.example.uts

class utama {

    fun main(args: Array<String>){
        var s1: staf
        s1.setNm("Jelita")
        s1.setKehadiran(10)

        var s2: dosen
        s2.setNm("Setyo")
        s2.setSKS(35)

        var p1: pegawai
        p1.setNm("Agus")

        var gaji: daftargaji
        gaji.addPegawai(s1)
        gaji.addPegawai(s2)
        gaji.addPegawai(p1)
        gaji.printSemua()
    }
}