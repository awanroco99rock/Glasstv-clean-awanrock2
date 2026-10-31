package com.glasstv.clean

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "GlassTV Bekasi - 3 Varian OK"
        tv.textSize = 24f
        tv.setPadding(50, 50, 50, 50)
        setContentView(tv)
    }
}
