package com.example.kotlin_binary_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nav = findViewById<Button>(R.id.bc)
        val txt_disp = findViewById<TextView>(R.id.txt_disp)
        val btn_no0 = findViewById<Button>(R.id.btn_no0)
        val btn_no1 = findViewById<Button>(R.id.btn_no1)
        val btn_no2 = findViewById<Button>(R.id.btn_no2)
        val btn_no3 = findViewById<Button>(R.id.btn_no3)
        val btn_no4 = findViewById<Button>(R.id.btn_no4)
        val btn_no5 = findViewById<Button>(R.id.btn_no5)
        val btn_no6 = findViewById<Button>(R.id.btn_no6)
        val btn_no7 = findViewById<Button>(R.id.btn_no7)
        val btn_no8 = findViewById<Button>(R.id.btn_no8)
        val btn_no9 = findViewById<Button>(R.id.btn_no9)
        val btn_eql = findViewById<Button>(R.id.btn_eql)
        val btn_del = findViewById<Button>(R.id.btn_del)
        val btn_cls = findViewById<Button>(R.id.btn_cls)

        var num : String = ""
        var obj = CalculatorLogic()

        btn_no0.setOnClickListener {
            num += "0"
            txt_disp.setText(num)
        }

        btn_no1.setOnClickListener {
            num += "1"
            txt_disp.setText(num)
        }

        btn_no2.setOnClickListener {
            num += "2"
            txt_disp.setText(num)
        }

        btn_no3.setOnClickListener {
            num += "3"
            txt_disp.setText(num)
        }

        btn_no4.setOnClickListener {
            num += "4"
            txt_disp.setText(num)
        }

        btn_no5.setOnClickListener {
            num += "5"
            txt_disp.setText(num)
        }

        btn_no6.setOnClickListener {
            num += "6"
            txt_disp.setText(num)
        }

        btn_no7.setOnClickListener {
            num += "7"
            txt_disp.setText(num)
        }

        btn_no8.setOnClickListener {
            num += "8"
            txt_disp.setText(num)
        }

        btn_no9.setOnClickListener {
            num += "9"
            txt_disp.setText(num)
        }

        btn_eql.setOnClickListener {
            if(num.length>10) {
                Toast.makeText(this, "Cannot Convert More Than 10 Numbers", Toast.LENGTH_SHORT).show()
            }
            else {
                num = obj.toBinary(num)
            }
            txt_disp.setText(num)
        }

        btn_del.setOnClickListener {
            num = num.dropLast(1)
            txt_disp.setText(num)
        }

        btn_cls.setOnClickListener {
            num = ""
            txt_disp.setText(num)
        }

        nav.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}