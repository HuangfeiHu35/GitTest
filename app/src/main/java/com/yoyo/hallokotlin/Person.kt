package com.yoyo.hallokotlin

/**
 *这里有一点要主要的，默认如果一个类被别的类继承，那么他必须添加open关键字
 */
open class Person {

    //1.声明了2个变量 他们的类型分别是String和Kootlin中的Int
    //2.在Kotlin中，基本类型已经不能使用 只能使用kotlin支持的Int Double Long 等
    //3.var和val都代表声明一个对象 val声明的对象是无法重新赋值
    //4.声明的属性必须默认先赋一个默认的值
    //5.内部自动为属性创建setter+getter方法

    val name: String = ""
    var age: Int = 0

}