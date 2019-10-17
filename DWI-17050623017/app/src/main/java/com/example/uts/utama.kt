package com.example.uts

class utama {

    fun main(args: Array<String>){
        var s1: staf
        s1.setNm("Ana")
        s1.setKehadiran(15)

        var s2: dosen
        s2.setNm("Susi")
        s2.setSKS(10)

        var p1: pegawai
        p1.setNm("Wati")

        var gaji: daftargaji
        gaji.addPegawai(s1)
        gaji.addPegawai(s2)
        gaji.addPegawai(p1)
        gaji.printSemua()
    }
}