package com.example.lastone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.btnopen
import kotlinx.android.synthetic.main.activity_scecondactivity.chchill
import kotlinx.android.synthetic.main.activity_scecondactivity.chsalad
import kotlinx.android.synthetic.main.activity_scecondactivity.chtomat
import kotlinx.android.synthetic.main.activity_scecondactivity.rditem
import kotlinx.android.synthetic.main.activity_scecondactivity.tvorder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      btnopen.setOnClickListener(){
          Intent(this ,scecondactivity::class.java).also {
              startActivity(it)
          }
      }


    }
}