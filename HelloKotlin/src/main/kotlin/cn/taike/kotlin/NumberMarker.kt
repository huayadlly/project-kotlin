package cn.taike.kotlin


/**
 * Created by huayadlly on 2017/7/22.
 */

fun numberTest() {
    var a = 1000

    println(a == a)
//    println(a === a) //true

    var boxedA: Int? = a
    var anotherBoxedA: Int? = a

    println(boxedA == anotherBoxedA)
    println(boxedA === anotherBoxedA)


}

fun stringText() {
    var s1 = """abd dgag jviev
        vbsmvk  bbb f
        vmsvkmskv
        vmsvm
        """

//    println(s1.trimMargin())

    var a = 10
    var b = 20

    //if分支可以作为块，最后一个表达式是该块的值
    var max = if (a > b) {
        print("choose a")
        a
    } else {
        println("choose b")
        b
    }

    println("The max number is $max")

}

fun main(args: Array<String>) {
//    numberTest()

    stringText()
}