package com.sashakhyzhun.mytestlibrary

import android.content.Context
import android.widget.Toast

/**
 * @author SashaKhyzhun
 * Created on 11/12/18.
 */
object TestLib {

    fun Context.toastIt(string: String) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show()
    }

}