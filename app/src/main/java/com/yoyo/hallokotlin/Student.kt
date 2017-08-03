package com.yoyo.hallokotlin

import android.util.Log

/**
 *  这里可以看出Student类继承Person并继承Person的无参构造器
 *  1、在构造器创建的参数也会让该类内部自动为属性创建setter+getter方法
 *  2、因为name在父类中已经声明过了，这里不需要var 关键字
 */
class Student(name: String, var courses: Int = 3) : Person() {


    //默认每个学生身高1.70
    var height: Double = 1.70
            //默认情况下属性会自动生成setter/getter方法 这类似于OC的做法。
            // 但是我们也可以重写这两个方法，只需要在属性后面声明即可，而field指向的就是该属性，因为kotlin不运行直接方法该对象。
        get() = field
        set(value) {
            field = value + 1.0
        }

    var weight: Double = 150.0
        get() = field

    /**
     * 1、fun代表创建一个study函数 传入课程名返回成绩数 类型为Int
     * 2、每个语句都没有;做结尾，这是他的特点
     */
    fun study(coursesNmae: String): Int {
        if (coursesNmae.equals("语文")) {
            return 99
        }
        return 80
    }

    //如果一个方法返回一个数据并只用了一行代码 那么可使用如下写法
    fun printf(): String {
        return "$name 的身高是 $height"
    }

    //如果一个方法不返回数据 可以用Unit代替 你可以认为是void 当然Unit也可以不写
    fun play(): Unit {
        Log.d("yoyo", "你家啊")
    }

    /**
     * 类的静态变量
     */
    companion object
    //该模块下的代码在大部分其他类中都可以调用
    {
        public val MATH: Int = 3
        public val CHINESE = 2
        public val ENGLISH = 1
    }

}

/**
 * 在一个类中创建多个构造器
 * 主构造器
 */
//class Student1(name: String,var courses: Int=3) :Person(){
//    var height:Double =1.80
//
//    /**
//     * 次构造器
//     * 1、这里的构造器必须使用constructor关键字 必须重写主构造器
//     * 2、主构造器不传递coureses就使用默认的3
//     * 3、次构造器默认不创建setter+getter方法，也不能有val/var关键字，他不会在该类中创建属性
//     * 4、如果该构造器不用赋值，你完全可以去掉方法体{}
//     *
//     */
//    constructor(nameValue:String,ageValue:String):this(nameValue)
//}