package com.example.firstapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        println("First App")


        //Variables
        println("-----------------------------INT------------------------------")
        var x=10
        println(x)
        println(x*20)

        x = 30
        println(x)

        var y=5
        println(x+y)

        //like flutter final
        val z= 20
        println(z*50)

        val example: Long = 10
        println(example * 10)
        val exampleShort: Short=10
        val exampleByte: Byte=10
        val exampleInt: Int=10


    }

}