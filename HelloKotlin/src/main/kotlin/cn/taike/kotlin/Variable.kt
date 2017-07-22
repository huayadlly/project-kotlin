package cn.taike.kotlin

/**
 * Created by huayadlly on 2017/7/22.
 */

//定义函数
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b


//定义局部变量
/**
 * val : 定义的是只读变量，相当于java中的final变量，一个val变量创建的时候必须初始化，因为以后不能改变；
 * var : 定义的是可变变量，可以通过重新分配来更改为另一个值得变量，这种变量的声明方式和java中变量声明方式一样；
 */
fun localVariable() {
    val a: Int = 1   //定义局部变量及类型，立即初始化
    val b: Int = 3   //同上

    val c = 5        //推导出 Int 类型

    val d: Int
    d = 9            //定义变量及类型，赋值

    var e: Int = 7
    e += 1

    println("a = $a, b = $b, c = $c, d = $d, e = $e.")

}


fun main(args: Array<String>) {

//    println("sum is :" + sum(3, 5))
//    print("两个数的和是:${sum2(33, 99)}")

    localVariable()

}