package com.example.railwayfood
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
class SplashActivity : AppCompatActivity() {
    private val splashScreen =4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
     startActivity(intent)
val intent = Intent( this@SplashActivity, PostActivity::class.java)
       startActivity(intent)
       finish()
   },splashScreen.toLong())



    }
}