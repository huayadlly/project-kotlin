package cn.taike.kotlin

/**
 * Created by huayadlly on 2017/7/22.
 */

fun main(args: Array<String>) {

//    strings()

//    println("两个数中的较大者是:${maxOf(55, 99)}")
//    println("两个数中的较大者是2:${maxOf2(55, 101)}")

    //循环
//    loops()

    //使用when
//    println("hello: ${describe("hello")}")
//    println("1: ${describe(1)}")
//    println("12:${describe(12)}")  //WHY?  12:this is not String type
//    println("1234L: ${describe(220L)}")
//    println("other: ${describe("other232323")}")
//    println("13.6: ${describe(13.6)}")


    //range
//    isRange(12)

    //迭代
//    iterationItems()
//    iterationCollection()

    //循环map
    printMap()
}

// 字符串模板
fun strings() {

    var a = 2
    var s1 = "a is $a"

    a = 999
    var s2 = "${s1.replace("is", "are")},but now is $a"

    println(s2)
}

// 条件判断
fun maxOf(a: Int, b: Int): Int {

    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

//使用循环
fun loops() {
    val items = listOf("apple", "orange", "banana", "tomato")
//    for (item in items) {
//        println(item)
//    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    var index: Int = 0
    while (index < items.size) {
        println("(while loop)item at $index is ${items[index]}")
        index++
    }
}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "parameter is Int 1"                   //输入类型为数组 1
            "hello" -> "parameter is String of hello"   //输入类型为字符串
            is Long -> "this is long type"
            !is String -> "this is not String type"
            else -> "nothing"
        }

//使用range:检查数值是否在某个范围内
fun isRange(a: Int) {
    val b = 10
    if (a in 1..b) {
        println("a: $a is in the range!")
    } else {
        println("a: $a is't in the range!")
    }
}

//在范围内迭代
fun iterationItems() {

    //迭代 使用step 每次迭代都加上step值
    for (x in 1..10 step 2) {
        println(x)
    }

    for (x in 9 downTo 0 step 2) {
        println("downTo: $x")
    }

}

//集合迭代 TODO why?
fun iterationCollection() {
    val list = listOf("apple", "orange", "tomato")
    when {
        "orange" in list -> println("i like eat orange~")
        "apple123" in list -> println("my iPhone is design by apple")
        "tomato33" in list -> println("i don't like tomato!")
        else -> println("nothing")
    }
}

//定义map: 其中“a” 为key，1为value
fun printMap(){
    val mapValue = mapOf("a" to 1,"b" to 2,"c" to 3)

    for((k,v) in mapValue){
        println("$k --> $v")
    }
}
