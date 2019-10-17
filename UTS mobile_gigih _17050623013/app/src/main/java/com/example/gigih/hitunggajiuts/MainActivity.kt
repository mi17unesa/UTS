package com.example.gigih.hitunggajiuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_dosen.*
import kotlinx.android.synthetic.main.activity_staff.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_hitungdosen.setOnClickListener { View.OnClickListener {
            var DosenIntent: Intent = Intent(this,Staff_Activity::class.java)
            startActivity(DosenIntent)
            this.finish()
        } }
        btn_hitungstaff.setOnClickListener { View.OnClickListener {
            var stafIntent: Intent = Intent(this,Staff_Activity::class.java)
            startActivity(stafIntent)
            this.finish()
        } }
    }
}
