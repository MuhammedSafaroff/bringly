package com.muhammedsafaroff.bringly.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.muhammedsafaroff.bringly.R

class RegisterFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View =inflater.inflate(R.layout.activity_register2,container,false)

        var backbtn: ImageButton = view.findViewById(R.id.RegisterBackBtn2);
        backbtn.setOnClickListener {
            val fragment1:RegisterFragment1 = RegisterFragment1()
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.RegisterContainer,fragment1,"fragment1").commit()
        }
        return view
    }

}