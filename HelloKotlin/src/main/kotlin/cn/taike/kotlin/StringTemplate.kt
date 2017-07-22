package cn.taike.kotlin

/**
 * Created by huayadlly on 2017/7/22.
 */

fun main(args: Array<String>) {

    strings()

}

// 字符串模板
fun strings() {

    var a = 2
    var s1 = "a is $a"

    a = 999
    var s2 = "${s1.replace("is", "are")},but now is $a"

    print(s2)
}