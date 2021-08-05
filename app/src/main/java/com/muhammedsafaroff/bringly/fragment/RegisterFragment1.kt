package com.muhammedsafaroff.bringly.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.muhammedsafaroff.bringly.LoginActivity
import com.muhammedsafaroff.bringly.R

class RegisterFragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View =inflater.inflate(R.layout.activity_register1,container,false)

       var backbtn:ImageButton = view.findViewById(R.id.RegisterBackBtn1);
       var next: Button = view.findViewById(R.id.register_next_btn);

        backbtn.setOnClickListener {
            val i = Intent(activity, LoginActivity::class.java)
            startActivity(i)
            activity?.finish()
        }

        next.setOnClickListener {
            val fragment2:RegisterFragment2 = RegisterFragment2()
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.RegisterContainer,fragment2,"fragment2").commit()
        }
        return view
    }

}