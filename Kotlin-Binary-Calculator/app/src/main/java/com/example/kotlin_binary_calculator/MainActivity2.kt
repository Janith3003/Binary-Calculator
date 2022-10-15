package com.example.kotlin_binary_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nav = this.findViewById<Button>(R.id.nav)
        val txt_disp = this.findViewById<TextView>(R.id.txt_disp)
        val btn_no0 = this.findViewById<Button>(R.id.btn_no0)
        val btn_no1 = this.findViewById<Button>(R.id.btn_no1)
        val btn_eql = this.findViewById<Button>(R.id.btn_eql)
        val btn_cls = this.findViewById<Button>(R.id.btn_cls)
        val btn_del = this.findViewById<Button>(R.id.btn_del)

        var number : String = ""
        var obj = CalculatorLogic()

        btn_no0.setOnClickListener{
            number += "0"
            txt_disp.setText(number)
        }

        btn_no1.setOnClickListener {
            number += "1"
            txt_disp.setText(number)
        }

        btn_eql.setOnClickListener {
            if(!checkRealNumInBinary(number)) {
                number = obj.binaryToDecimal(number)
            }
            txt_disp.setText(number)
        }

        btn_cls.setOnClickListener {
            number = ""
            txt_disp.setText(number)
        }
        btn_del.setOnClickListener {
            number = number.dropLast(1)
            txt_disp.setText(number)
        }
        nav.setOnClickListener {
            startActivity(Intent (this, MainActivity::class.java))
        }
    }

    fun checkRealNumInBinary(num : String) : Boolean{
        var status : Boolean = false
        for(i in 0..num.length-1){
            if(num.get(i) != '0' && num.get(i) != '1') {
                status = true
            }
        }
        if(status){
            Toast.makeText(
                this,
                "Binary Number Cannot Be Contained Real Number",
                Toast.LENGTH_SHORT
            ).show()
        }

        return status
    }
}