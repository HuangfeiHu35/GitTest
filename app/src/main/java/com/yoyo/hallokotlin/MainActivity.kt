package com.yoyo.hallokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 一个类继承父类和实现接口的方式 ：class 类名:超类名() ，接口
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(p0: View?) {
        Toast.makeText(this, "我是谁", Toast.LENGTH_SHORT).show()
    }

    /**
     * override用于覆写继承父类或者实现接口中方法。
     *
     * fun 用于标识方法
     *
     * 参数形式： 参数名： 类型
     *
     *  ? 是用于指定可以为空对象
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setText("你愁啥")
        button.setText("不要点")
        button.setOnClickListener {
            Toast.makeText(this, "抽你乍地", Toast.LENGTH_SHORT).show()
        }

        //如果函数是空函数，比如Android 开发中TextWatcher接口通常只用到一个方法，但是必须把所有的方法都重写一遍，就可以通过这种方式来简写:
        //Unit表示的是一个值的类型。这种类型对应Java中的void
        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) = Unit

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) = Unit

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) = Unit

        })
        //1、创建对象没有了new关键字
        //2、构造器第二个参数就算不传递 也可以使用默认的
        //3、每局代码都没有;
        var s1 = Student("我是")
        var s2 = Student("我是", 250)
        //4、如果一个对象不想马上创建 可以引用null 但是声明必须加? 表示该对象可以为null
        var s3: Student? = null
        //5、如下添加了?表示 如果s3对象为null 则不调用
        s3?.printf()

        //调用内部的setter
        s2.height = 180.0
        //调用getter
        val height: Double = s2.height
        //打印某个变量
        Log.i("yoyo", "$height")
    }
}
