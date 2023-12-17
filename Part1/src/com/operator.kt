/*
 * Copyright (c) 2023. aaron.
 *
 * This program is under the GPL-3.0 license.
 * if you have not received it or the program has a bug, please let me know:
 * <communicate_aaron@outlook.com>.
 */

package com

fun arithmeticOperator() {
    var a = 10

    println(-a) // -10
    println(++a) // 11
    println(--a) // 10


    println("The original value a is: $a")
    println("a+a, ${a + a}")
    println("a-1, ${a - 1}")
    println("a*2, ${a * 2}")
    println("a/2, ${a / 2}")
    println("a%2, ${a % 2}")
    println("-----------------------------")

    /* if 'a' is floating pointer number */
    val b = 10.0
    println("The original value b is: $b")
    println("b+b, ${b + b}")
    println("b-1, ${b - 1}")
    println("b*2, ${b * 2}")
    println("b/2, ${b / 2}")
    /* Note: that floating point numbers cannot be complementary operation in C++ and Java */
    println("b%2, ${b % 2}")

    val c = 2
    println("The original value c is: $c")
    a += c
    println("a+=c, $a")
    a -= c
    println("a-=c, $a")
    a *= c
    println("a*=c, $a")
    a /= c
    println("a/=c, $a")
    a %= c
    println("a%=c, $a")

}

fun logicalOperator() {
    val a: Boolean = true
    val b: Boolean = false

    println("a is $a, b is $b")
    println("a&&b: ${a && b}")
    println("a||b: ${a || b}") // Logic short circuit
    println("b&&a: ${b && a}") // Logic short circuit
}

fun bitOperator() {
    val a = 0b0000_0101
    val b = 0b0000_0100

    println("a is: $a, b is $b")
    /*
    * 0000 0101(2's) -> 1111 1010(inv) -> [ 1000 0101(1's) -> 1000 0110(2's or sign) ](gain True-Form)
    *  */
    println("'a' performs the inversion to get: ${a.inv()}")

    /*
    * 0000 0101 and 0000 0100 = 0000 0100(4[d])
    *  */
    println("a and b is: ${a and b}")

    /*
    * 0000 0101 or 0000 0100 = 0000 0101(5[d])
    *  */
    println("a or b is: ${a or b}")

    /*
    * 0000 0101 xor 0000 0100 = 0000 0001(1[d])
    *  */
    println("a xor b is: ${a xor b}")

    /*
    * 0000 0101 shr 0000 0100 = 0000 0101 ->4 = 0000 0000(0[d])
    *  */
    println("a shr b is: ${a shr b}")

    /*
    * 0000 0101 shl 0000 0100 = 0000 0101 <-4 = 0101 0000(80[d])
    *  */
    println("a shl b is: ${a shl b}")

    /*
    * 0000 0101 ushr 0000 0100 = 0000 0101 ->4 = 0000 0000(0[d])
    *  */
    println("a ushr b is: ${a ushr b}")
}

fun testOperator() {
    // arithmeticOperator()
    // logicalOperator()
    bitOperator()
}

