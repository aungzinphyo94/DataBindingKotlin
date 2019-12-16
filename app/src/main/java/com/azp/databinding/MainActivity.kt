package com.azp.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.azp.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var person: Person = Person("John", "Developer")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        /*
//        setContentView(R.layout.activity_main)
//
//        var status = true
//
//        txtName = findViewById(R.id.text_view_name)
//        txtOccupation = findViewById(R.id.text_view_occupation)
//
//        btnShow = findViewById(R.id.btnShow)
//
//        btnShow.setOnClickListener {
//
//        }
//
//        when(status){
//            true -> {
//                txtName.text = "John"
//                txtOccupation.text = "Developer"
//            }
//
//            false -> {
//                txtName.text = ""
//                txtOccupation.text = ""
//            }
//        }

         */

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = person

        binding.btnShow.setOnClickListener {

            //TODO: 1.1: Add the EditText view to Layout and bind the string from EditText to binding

            person = Person("James", "Android Developer")
            binding.myName = person

        }
    }
}
