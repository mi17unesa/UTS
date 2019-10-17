package com.example.tony.hitunggajiuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_dosen.*

class Dosen_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosen)
btn_hitungdosen.setOnClickListener { View.OnClickListener {
            var aDosen:Pegawai= Pegawai(
                et_namadosen.text.toString().trim(),
                et_nipdosen.text.toString().trim(),
                et_alamatdosen.text.toString().trim())
            var dosen:Dosen= aDosen as Dosen
    dosen.sks=et_kehadirandosen.text.toString().trim() as Int

            tv_hasildosen.text=dosen.gaji as String
        } }
    }
}
