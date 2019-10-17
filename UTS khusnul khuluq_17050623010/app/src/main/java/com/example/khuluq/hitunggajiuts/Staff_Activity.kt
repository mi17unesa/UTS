package com.example.khuluq.hitunggajiuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_staff.*

class Staff_Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff)
        btn_hitungstaff.setOnClickListener { View.OnClickListener {
            var aStaff:Pegawai= Pegawai(
                et_namastaff.text.toString().trim(),
                et_nipstaff.text.toString().trim(),
                et_alamatstaff.text.toString().trim())
            var staff:Staff= aStaff as Staff
            staff.kehadiran=et_kehadiranstaff.text.toString().trim() as Int

            tv_hasilStaff.text=staff.gaji as String
        } }

    }
}
