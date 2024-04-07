package com.example.lastone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_thirdactivity.btnplace
import kotlinx.android.synthetic.main.activity_thirdactivity.textView2
import kotlinx.android.synthetic.main.custome.toast

class thirdactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdactivity)

        val next = intent.getStringExtra("EXTRA_NEXT")
        textView2.text=next

        btnplace.setOnClickListener(){
            Toast(this).apply {
                duration = Toast.LENGTH_SHORT
                view = layoutInflater.inflate(R.layout.custome,toast)
                show()
            }
        }
    }
}