package com.example.uts

class utama {

    fun main(args: Array<String>){
        var s1: staf
        s1.setNm("Alma")
        s1.setKehadiran(20)

        var s2: dosen
        s2.setNm("Frdiyana")
        s2.setSKS(25)

        var p1: pegawai
        p1.setNm("Ana")

        var gaji: daftargaji
        gaji.addPegawai(s1)
        gaji.addPegawai(s2)
        gaji.addPegawai(p1)
        gaji.printSemua()
    }
}