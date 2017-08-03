package com.yoyo.hallokotlin

import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        val a: Int = 1 //立即初始化
        val b = 2 //推导出Int类型
        val c: Int //当没有初始化时必须声明类型
        c = 3 //赋值

        var d = 1
        //使用变量名作为模板
        val s1 = "d is $d"
        d = 2
        //使用表达式作为模板
        val s2 = "${s1.replace("is", "was")},but now is $d"


        //把if表达式
        fun minof(e: Int, f: Int) = if (e > f) e else f


        textView2.setText("${getStringLength(21.3)}\n ${getStringLength("dfjidif")}")

        toast("nihao", Toast.LENGTH_SHORT)

    }

    fun maxof(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    //下列函数是当str中不是整数时返回空
    //使用一个可返回空值的函数
    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            //obj将会在这个分支中自动转换为String 类型
            return obj.length
        }
        //obj 在种类检查外依然是Any类型
        return null
    }
}
