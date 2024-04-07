package com.example.lastone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_scecondactivity.btnconfirm
import kotlinx.android.synthetic.main.activity_scecondactivity.btnorder
import kotlinx.android.synthetic.main.activity_scecondactivity.chchill
import kotlinx.android.synthetic.main.activity_scecondactivity.chsalad
import kotlinx.android.synthetic.main.activity_scecondactivity.chtomat
import kotlinx.android.synthetic.main.activity_scecondactivity.rditem
import kotlinx.android.synthetic.main.activity_scecondactivity.tvorder

class scecondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scecondactivity)
       btnorder.setOnClickListener(){
           val cheackedmeat = rditem.checkedRadioButtonId
           val meat = findViewById<RadioButton>(cheackedmeat)
           val salad = chsalad.isChecked
           val tomat = chtomat.isChecked
           val chilli = chchill.isChecked
           val orderstring = "you ordered the ${meat.text} with" +
                   (if (salad) "\nsalad" else "") +
                   (if (tomat) "\ntomato sause" else "") +
                   (if (chilli) "\nchilli sause" else "")

           tvorder.text = orderstring
       }

        btnconfirm.setOnClickListener(){
            val next = tvorder.text.toString()
            Intent(this,thirdactivity::class.java).also {
                it.putExtra("EXTRA_NEXT",next)
                startActivity(it)
            }
        }
    }
}