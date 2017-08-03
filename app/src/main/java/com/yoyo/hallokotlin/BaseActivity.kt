package com.yoyo.hallokotlin

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by lenovo on 2017/5/31.
 */
open class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    /**
     * 扩展方法
     * 首先是一个fun关键字，紧接着是要扩展哪个类的类名，点方法名，然后是方法的声明和返回值以及方法体。
     */
    fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }
}