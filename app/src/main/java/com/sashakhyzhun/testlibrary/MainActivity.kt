package com.sashakhyzhun.testlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sashakhyzhun.mytestlibrary.TestLib.toastIt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ...

        toastIt("bla-bla")
    }
}
