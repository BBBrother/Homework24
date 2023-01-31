package com.example.homework24.ui

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.homework24.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

   private val vm by viewModels<PictureViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm.liveData.observe(this){
           val pict = findViewById<ImageView>(R.id.tvPicture)
            Glide
                .with(this)
                .load(it.picture)
                .into(pict)
        }

        vm.getPicture()
    }
}