package com.muhammedsafaroff.bringly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_login_page.*

class LoginPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        LoginBackBtn.setOnClickListener {
            val i = Intent(this,LoginActivity::class.java)
            startActivity(i)
            finish()
        }

        Login_enter_btn.setOnClickListener {
            val i = Intent(this,Main2Activity::class.java)
            startActivity(i)
            finish()
        }
    }
}
