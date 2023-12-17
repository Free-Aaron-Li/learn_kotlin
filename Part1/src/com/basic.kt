/*
 * Copyright (c) 2023. aaron.
 *
 * This program is under the GPL-3.0 license.
 * if you have not received it or the program has a bug, please let me know:
 * <communicate_aaron@outlook.com>.
 */

package com

import java.util.*

/**
 * Keywords and identifier
 */
public fun keywords() {
    val `class` = "class" // class is Hard Keywords
    val `π` = "π" // unicode encode, so you can also write the expression as: val π ="π"
    val 你好 = "你好" // unicode encode
    val public = "public" // public is Modifier Keywords

    println(`class` + "\n" + `π` + "\n" + 你好 + "\n" + public + "\n")

    val it = 1 // it is general identifier
    val array = arrayListOf<String>("A", "B", "C")
    array.forEach { println(it) } // it is specific identifier

}

var _hello = "Hello" // declare top-level variable
const val MAX_NUMBER = 100 // declare top-level constant

object USER {
    const val USER_NUMBER = 10 // declare object constant
}

/**
 * Variables and Constants
 * */
public fun variablesAndConstants() {
    _hello = "Hello World!"
    var floatValue: Float = 0.1f
    var intValue = 1
    println(_hello + "\n" + floatValue + "\n" + intValue)
    // intValue=false // error, intValue is int type
    // MAX_NUMBER=10 // error, constant isn't edit
    val MIN_NUMBER = 1
    // MIN_NUMBER=2 // error
}

/**
 * expression
 * */
public fun expression() {
    val score1 = 80
    val score2 = 50

    // 1. if control expression
    val result = if (score1 < 60) "Below standard" else "Up to standard"
    println(result)

    // 2. try expression
    val result2 = try {
        // ...
    } catch (e: Exception) {
        result
    }

    println("sum is:" + sum(score1, score2))
}


// 3. expression function body
fun sum(x: Int, y: Int): Int = x + y

public fun packageTest() {
    // function 1:
    val date1 = Date()
    println(date1)

    // function 2:
    val date2 = java.util.Date()
    println(date2)

    // introduce sum function
    val sumResult = com.sum(100, 100)
    println(sumResult)
}

public fun testBasic() {
    // keywords()
    // variablesAndConstants()
    // expression()
    packageTest()
}