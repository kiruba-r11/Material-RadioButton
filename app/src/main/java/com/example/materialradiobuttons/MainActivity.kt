package com.example.materialradiobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId) {
                radioButton1.id -> Toast.makeText(this , "Radio Button - 1", Toast.LENGTH_SHORT).show()
                radioButton2.id -> Toast.makeText(this , "Radio Button - 2", Toast.LENGTH_SHORT).show()
                radioButton3.id -> Toast.makeText(this , "Radio Button - 3", Toast.LENGTH_SHORT).show()
                radioButton4.id -> Toast.makeText(this , "Radio Button - 4", Toast.LENGTH_SHORT).show()
                radioButton5.id -> Toast.makeText(this , "Radio Button - 5", Toast.LENGTH_SHORT).show()
            }
        }
    }
}