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

        //Double Float
        println("---------------------DOUBLE&FLOAT")
        val pi = 3.141529
        println(pi * 2) //double
        println(5/2)// int
        println(5.0/2.0) //double

        val sampleDouble=3.0
        val resultDouble= pi * sampleDouble

        val sampleFloat: Float= 2.25f
        println(sampleFloat *2)

        //String
        println("---------------------String")
        val firstString= "First "
        println(firstString)
        val name= "Mehmet"
        println(name.uppercase())

        val lastName= "Güler"
        println("$name $lastName")

        //init
        val myStr: String
        myStr = "myStr" // init


        //convert
        val age="15"

        val ageInt= age.toInt()

        println(ageInt)

        //Boolean
        println("---------------------Boolean")

        var myBoolean : Boolean= true
        myBoolean=false

        println("$myBoolean")
        println(3>5)
        println(3<5)
        println(3==5)
        println(3!=5)


        //Veri Yapıları
        //Diziler
        println("---------------------Arrays")

        val nameArray= arrayOf("mehmet","ad","yeni")

        println(nameArray.toString())

        nameArray[1]="memo"

        println(nameArray[1])

        val genericArray= arrayOf("mehmet","ad","yeni")

        println(genericArray.toString())

        println("---------------------ArrayLists")

        val nameList= arrayListOf("First","Second","Third")

        println(nameList.first())
        nameList.add("Mahmut")
        println(nameList.get(3))
        nameList.removeAt(3)


        val numberList = arrayListOf<Int>(
            1,
            2,
            3
        )
        val numberList2=ArrayList<Int>()

        numberList2.add(1)
        numberList2.add(2)
        numberList2.add(3)

        val dynamicList = ArrayList<Any>()
        dynamicList.add(10)
        dynamicList.add("a")
        dynamicList.add(true)

        println("---------------------Sets")

        val numberSet = setOf<Int>(1, 2, 3, 4, 4, 5)

        println(numberSet.size)

        numberSet.forEach {
            println(it)
        }

        val hashSetExample = HashSet<String>()

        hashSetExample.add("1")

        println("---------------------Maps")

        val foodMap = hashMapOf<String, Int>()
        foodMap.put("Elma", 100)
        foodMap.put("Armut", 150)
        println(foodMap.get("Elma"))

        val intMap = HashMap<Int, Int>()
        intMap.put(1, 2)

        println("---------------------If Statements")

        var number = 10

        if (number < 9)
            println("küçük")
        else if (number == 10)
            println("eşit")
        else
            println("Büyük")


        when (number) {
            0 -> println("küçük")
            1 -> println("küçük")
            10 -> println("Eşit")
            11 -> println("büyük")
            else -> println("Diğer")
        }

        println("---------------------While")
        var j = 0
        while (j < 10) {
            j += 1
            println(j)
        }

        println("---------------------For")
        val anotherArray = arrayOf(1, 2, 3, 4, 5, 6, 7)

        for (number in anotherArray) {
            println(number)
        }
        //numberRange
        for (number in 0..3) {
            println(number)
        }


    }

}