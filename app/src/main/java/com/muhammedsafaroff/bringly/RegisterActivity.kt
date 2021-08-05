package com.muhammedsafaroff.bringly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.muhammedsafaroff.bringly.fragment.RegisterFragment1


class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        val fragment1:RegisterFragment1 = RegisterFragment1()


        supportFragmentManager.beginTransaction().add(R.id.RegisterContainer,fragment1,"fragment1").commit()

    }
}
