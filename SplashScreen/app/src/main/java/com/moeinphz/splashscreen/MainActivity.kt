package com.moeinphz.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        var textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener(
            View.OnClickListener {
//                Toast.makeText(this, "CLicked On the Button", Toast.LENGTH_LONG).show()
//                val intent = Intent(this, MainActivity2::class.java)
//                startActivity(intent)
//                finish()
                textView.setText("Hello Niko Bellic")
            })
//        window.setFlags(
//            WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAGS_CHANGED
//        )

//        Handler(Looper.getMainLooper()).postDelayed({
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
//            finish()
//        }, 3000)
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Destroyed", Toast.LENGTH_LONG).show()
    }
}