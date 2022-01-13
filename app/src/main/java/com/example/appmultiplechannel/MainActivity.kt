package com.example.appmultiplechannel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.appmultiplechannel.databinding.ActivityMainBinding
import com.example.library.LibraryHelper

//import com.example.librarystage.LibraryHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil
            .setContentView<ActivityMainBinding>(this,R.layout.activity_main)

        val buffer = StringBuffer("\n \n")
        buffer.run {
//            resValue "string", "app_name_custom", "stage_myapp"
//            resValue "bool", "isrRank", 'true'
//            buildConfigField "String", "ENVIRONMENT", '"stage"'
            append("app_name_custom = ${resources.getString(R.string.app_name_custom)}")
            append("\n\n")
            append("isrRank = ${resources.getBoolean(R.bool.isrRank)}")
            append("\n\n")
            append("ENVIRONMENT = ${BuildConfig.ENVIRONMENT}")
            append("\n\n")
            append("msg = ${LibraryHelper.getmsg()}")
        }

        binding.tv.append(buffer)
    }
}