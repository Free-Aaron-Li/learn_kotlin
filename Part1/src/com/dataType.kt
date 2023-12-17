/*
 * Copyright (c) 2023. aaron.
 *
 * This program is under the GPL-3.0 license.
 * if you have not received it or the program has a bug, please let me know:
 * <communicate_aaron@outlook.com>.
 */

package com

/**
 * Integer
 * */
public fun integer() {
    val v1: Byte = 1
    val v2: Short = 2
    val v3 = 3 // default type
    val v4 = 4L // long type
    val v5 = 100_000_000L // kotlin allows constants to be underlined for greater readability
    println("Byte: $v1") // $ is string template
    println("Byte: $v2")
    println("Byte: $v3")
    println("Byte: $v4")
    println("Byte: $v5")

    val v6 = 0b11100 // binary representation
    val v7 = 0x1c // hexadecimal notation
    println("Binary : $v6")
    println("Hexadecimal : $v7")
}


/**
 * Floating point type
 */
public fun floatingPointNumber() {
    val v1 = 1.0 // double type
    val v2 = 2.0f // float type
    val v3 = 3.0e2 // exponential representation, the result is 300.0

    println("double : $v1")
    println("float : $v2")
    println("exponential number : $v3")
}

/**
 * Character
 */
public fun character() {
    val v1: Char = '\u0065' // e
    println(v1)

    val v2 = "hello\tworld"
    val v3 = "hello\nworld"
    val v4 =
        "hello\rworld" // The character of \r is to return to the beginning of the line, overwriting the text that precedes \r
    val v5 = "hello\"world\""
    val v6 = "hello\'world\'"
    val v7 = "hello\$world"
    val v8 = "hello\bworld"

    println(v1)
    println(v2)
    println(v3)
    println(v4)
    println(v5)
    println(v6)
    println(v7)
    println(v8)
}

/**
 * Numeric type conversion
 */
public fun typeConversion() {
    val v1: Byte = 1
    println(v1.toInt()) // Byte -> Int

    val v2: Double = 1.0
    println(v2.toFloat()) // wide -> small range, Double -> Float

    val v3: Char = '4'
    println(v3.code) // Char -> Int

    val v4: Double = 13.45
    println(v4.toInt()) // wide -> small range, cut the decimal part

    val v5 = 12345678e5
    println("v5 is: $v5") // 1.2345678E12
    println("After conversion to Int: " + v5.toInt()) // 2147483647, loss of precision

    println(v1 + v2) // double
    println(v1 + 1) // int
    println(v1.toShort() + v3.code) // int
}

/**
 * Determines element parity
 */
public fun parity(value: Int): Int? {
    return if (value % 2 == 1) null  // odd number
    else 1 // even number
}

/**
 * nullable Type
 */
public fun nullableType() {
    val v1 = 10;
    val v2 = 13;/* Security call operator */
    // plus is addition function, Same as the + operator
    println(parity(v1)?.plus(100)) // 101
    println(parity(v2)?.plus(100)) // null

    /* Elvis operator */
    println(parity(v1)?.plus(100) ?: 0) // 101
    println(parity(v2)?.plus(100) ?: 0) // 0

    /* Assertion operator */
    println(parity(v1)!!.plus(100)) // 101
    println(parity(v2)!!.plus(100)) // NullPointerException
}

public fun testDataType() {
    // integer()
    // character()
    // typeConversion()
    nullableType()
}