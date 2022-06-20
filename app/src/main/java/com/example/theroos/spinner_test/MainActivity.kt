package com.example.theroos.spinner_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.theroos.spinner_test.R

class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {

    //var months = arrayOf("January", "February", "March", "April", "May")
    var spinner: Spinner? = null
    var txt_msg: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val months = resources.getStringArray(R.array.Months)

        spinner = findViewById<Spinner>(R.id.spinner_test)

        if (spinner != null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, months)
            spinner!!.adapter = adapter

            spinner!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, p3: Long) {
                    Toast.makeText(this@MainActivity,getString(R.string.selected_item) + " " + "" + months[position], Toast.LENGTH_SHORT).show()
                    var txt_msg: TextView = findViewById<TextView>(R.id.spinner_msg)
                    var mnth: String = months[position].toString()
                    txt_msg.setText(mnth)
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }
        }


    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet implemented")
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

}