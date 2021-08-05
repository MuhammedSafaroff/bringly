package com.muhammedsafaroff.bringly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        Login.setOnClickListener {
            val i = Intent(this,LoginPageActivity::class.java)
            startActivity(i)
            finish()
        }

        Register.setOnClickListener {
            val i = Intent(this,RegisterActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}
