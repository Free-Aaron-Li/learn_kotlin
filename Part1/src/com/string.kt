/*
 * Copyright (c) 2023-2024. aaron.
 *
 * This program is under the GPL-3.0 license.
 * if you have not received it or the program has a bug, please let me know:
 * <communicate_aaron@outlook.com>.
 */

package com

fun stringBasic() {
    val v1 = "hello\t world \n" // general string
    val v2 = """hello\t world \n""" // raw string
    println(v1 + v2)
}


fun string() {

    /* I.Get String */
    println("I:")
    // 1. string literal assignment
    val v1 = "hello world"

    println(v1) // hello world
    // 2. using conversion function
    // 2.1 byte array conversion to string
    val bytes = byteArrayOf(
        0x68.toByte(),
        0x65.toByte(),
        0x6c.toByte(),
        0x6c.toByte(),
        0x6f.toByte(),
        0x20.toByte(),
        0x77.toByte(),
        0x6f.toByte(),
        0x72.toByte(),
        0x6c.toByte(),
        0x64.toByte()
    )
    println(String(bytes)) // hello world
    // 2.2 character array conversion to string
    val chars = charArrayOf('h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd')
    println(String(chars)) // hello world
    // 2.3 variable string conversion to string
    val variableString = StringBuilder("hello world")
    println(String(variableString)) // hello world

    /* ------------------------------ */

    /* II. String splicing */
    println("II:")
    val v2 = "! welcome to China!"
    // 1. using + operator
    println(v1 + v2) // hello world! welcome to China!
    // 2. using += operator
    var v3 = v1
    v3 += v2
    println(v3) // hello world! welcome to China!

    /* ------------------------------ */

    /* III. String template */
    println("III:")
    val v4 = "\t"
    // 1. using $Variable or $Constant way
    println("wuhu, $v3, hello$v4.") // wuhu, hello world! welcome to China!, hello	.
    // 2. using ${expression} way
    println("wuhu, ${v3}, hello${v4}.") // wuhu, hello world! welcome to China!, hello	.

    /* ------------------------------ */


    /* IV. String lookup */
    println("IV:")
    println("The object to search for are: \"$v3\"")
    // 1. positive order search
    // 1.1 search character
    println(v3.indexOf('h')) // 0
    println(v3.indexOf('l', 1)) // 2
    // 1.2 search string
    println(v3.indexOf("he")) // 0
    println(v3.indexOf("ee", 1)) // -1

    // 2. reverse order search
    // 1.1 search character
    println(v3.lastIndexOf('h')) // 25
    println(v3.lastIndexOf('l', 1)) // -1
    // 1.2 search string
    println(v3.lastIndexOf("he")) // 0
    println(v3.lastIndexOf("ee", 1)) // -1

    /* ------------------------------ */

    /* V. String comparison */
    println("V:")
    val cmp1 = "hello"
    val cmp2 = "Hello"

    // 1. compare equal
    println(cmp1 == cmp2) // false
    println(cmp1.equals(cmp2, ignoreCase = true)) // true

    // 2. compare size
    println(cmp1.compareTo(cmp2)) // 32 cmp2 is located after cmp1
    println(cmp1.compareTo(cmp2, ignoreCase = true)) // 0 cmp1 is equal to cmp2

    // 3. compare prefix and suffix
    println(cmp1.startsWith("he")) // true
    println(cmp2.startsWith("he", ignoreCase = true)) // true
    println(cmp1.endsWith("d")) // false

    /* ------------------------------ */

    /* VI. String interception */
    println("VI:")
    println("target string is: \"${v3}\", and the length is: ${v3.length}")
    // 1. specified range
    println(v3.substring(13..29))

    // 2. startIndex to end of string
    println(v3.substring(13))

    // 3. startIndex to endIndex
    println(v3.substring(13, 30))

    /* ------------------------------ */

}

fun stringBuilder() {

    /* get empty StringBuilder */
    val v1 = StringBuilder()
    println("The empty StringBuilder length is: ${v1.length}") // 0
    println("The empty StringBuilder capacity is: ${v1.capacity()}") // 16

    /* Initialize StringBuilder with a string object */
    val v2 = StringBuilder("hello")
    println("The v2 length is: ${v2.length}") // 5
    println("The v2 capacity is: ${v2.capacity()}") // 21

    /* The initial capacity of the string buffer is 16, If it exceeds the limit, it will be expanded */
    val v3 = StringBuilder()
    for (i in 0..16)
        v3.append("a") // append thing(str, char, bool, obj, escape, num ...), this object member function
    println("The v3 length is: ${v3.length}") // 17
    println("The v3 capacity is: ${v3.capacity()}") // 34

    /*
     *  The StringBuilder container in Kotlin scales somewhat like a vector in C++
     *
     *  In C++, the default strategy for vector expansion is to double the current container
     *  each time a new memory space needs to be allocated
     *  */

    /* add string,character */
    v2.append(" ").append("world!")
    println("When added, v2 becomes: \"$v2\"")

    /* insert escape character */
    v2.insert(0, "\t") // insert before the offset number
    println("When inserted, v2 becomes: \"$v2\"")

    /* delete string */
    // The first parameter determines to start deleting the index,
    // the second parameter determines to end the index,
    // and the deletion range is [i,j).
    v2.delete(0, 1)
    println("When deleted, v2 becomes: \"$v2\"")

    /* replace string */
    v2.replace(0, 5, "welcome") // like delete, the replaced range is [start,end)
    println("When replaced, v2 becomes: \"$v2\"")
}

fun testString() {
    // stringBasic()
    // string()
    stringBuilder()
}

