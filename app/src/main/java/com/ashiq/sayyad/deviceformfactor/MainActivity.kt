package com.ashiq.sayyad.deviceformfactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ashiq.sayyad.deviceformfactor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //http://tips.androidgig.com/concat-two-strings-in-textview-using-databinding/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
       // setContentView(R.layout.activity_main)
    }
}
