/*
 * Copyright (c) 2023. aaron.
 *
 * This program is under the GPL-3.0 license.
 * if you have not received it or the program has a bug, please let me know:
 * <communicate_aaron@outlook.com>.
 */

package com

fun regexInitialize() {/*
     * Since regular expression pattern strings often contain special characters,
     * it is best to use Kotlin raw characters
     * */
    val pattern =
        """^(\+86)?0?1([3-57-9]\d|6[1-79])\d{8}${'$'}""" // Source: web: https://regexr-cn.com/ author: ToviLau title: 大陆手机号

    val phoneNumber = arrayOf(
        "17112345678",
        "1711234567",
        "171123456789",
        "13612345678",
        "1361234567",
        "136123456789",
        "+8613612345678",
        "+861361234567",
        "+86136123456789",
        "+86013612345678",
        "+8601361234567",
        "+860136123456789"
    )

    /* 1. default constructor */
    val regex1 = Regex(pattern)
    println("Correct phone number:")
    for (i in phoneNumber) if (regex1.matches(i)) // String matching, the Regex class member function
        println("\t\t\t\t\t$i")
}

fun regexMatch() {
    val pattern = """\d+""" // full of numbers

    val text1 = "1234"
    val text2 = "$1234"

    println("Strict matching of text1, and the results is: ${Regex(pattern).matches(text1)}")
    println("Strict matching of text2, and the results is: ${Regex(pattern).matches(text2)}")

    println("text1 is partially matched, and the result is： ${Regex(pattern).containsMatchIn(text1)}")
    println("text2 is partially matched, and the result is： ${Regex(pattern).containsMatchIn(text2)}")
}

fun regexFind() {
    val pattern = """\d+"""
    val text = "This dress is 100$, and this shoes is 30$."

    println("This dress is: ${Regex(pattern).find(text)?.value}")
    println("All prices are:")
    Regex(pattern).findAll(text).forEach { e -> println("\t\t\t\t${e.value}") }
}

fun regexReplace() {
    val pattern = """\d+"""
    val text = "This dress is 100\$, and this shoes is 30\$."

    println("Everything is free!\n${Regex(pattern).replace(text, "0")}")
}

fun regexSplit() {
    val pattern = """\d+"""
    val text = "dress100shoes30null"

    println("All commodity is: ${Regex(pattern).split(text)}")
}

fun testRegex() {
    // regexInitialize()
    // regexMatch()
    // regexFind()
    // regexReplace()
    regexSplit()
}
