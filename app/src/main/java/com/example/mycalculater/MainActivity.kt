package com.example.mycalculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.ReturnThis
import kotlinx.android.synthetic.main.activity_main.btnAdd
import kotlinx.android.synthetic.main.activity_main.btnDiv
import kotlinx.android.synthetic.main.activity_main.btnMul
import kotlinx.android.synthetic.main.activity_main.btnSub
import kotlinx.android.synthetic.main.activity_main.edtNo1
import kotlinx.android.synthetic.main.activity_main.edtNo2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        Made by Muhammad Noman
//
//        If you need my service or you have any question then you can contact with me.
//
//        WhatsApp number :  +923104881573
//
//        LinkedIn account :  https://www.linkedin.com/in/muhammad-noman59
//
//        Facebook account :  https://www.linkedin.com/in/muhammad-noman59





        btnAdd.setOnClickListener {
            if (edtNo1.text.toString() != "" && edtNo2.text.toString() != "") {

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()
                val sum = no1 + no2
                Toast.makeText(this, "The sum is $sum", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "Please Fill all the Required Blank.", Toast.LENGTH_LONG).show()

            }
        }
        btnSub.setOnClickListener {

            if (edtNo1.text.toString() != "" && edtNo2.text.toString() != "") {

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                var sub: Int

                sub = if (no1 > no2) {
                    no1 - no2
                } else {
                    no2 - no1
                }

                Toast.makeText(this, "The Diffrence is $sub", Toast.LENGTH_LONG).show()
            }else {
            Toast.makeText(this, "Please Fill all the Required Blank.", Toast.LENGTH_LONG).show()

        }

        }
        btnMul.setOnClickListener {
            if (edtNo1.text.toString() != "" && edtNo2.text.toString() != "") {

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val mul=no1*no2

                Toast.makeText(this, "The Product is $mul", Toast.LENGTH_LONG).show()
            }else {
                Toast.makeText(this, "Please Fill all the Required Blank.", Toast.LENGTH_LONG).show()

            }

        }
        btnDiv.setOnClickListener{
            if (edtNo1.text.toString() != "" && edtNo2.text.toString() != "") {

                val no1 = edtNo1.text.toString().toFloat()
                val no2 = edtNo2.text.toString().toFloat()

                var div:Float
                if (no2==0f){
                    div=0.0f
                    Toast.makeText(this, "A number can't be divided by zero as produces infinite solutinons", Toast.LENGTH_LONG).show()
                }else {
                    div = no1 / no2
                }
                Toast.makeText(this, "The Division is $div", Toast.LENGTH_LONG).show()
            }else {
                Toast.makeText(this, "Please Fill all the Required Blank.", Toast.LENGTH_LONG).show()

            }

        }
    }
}


