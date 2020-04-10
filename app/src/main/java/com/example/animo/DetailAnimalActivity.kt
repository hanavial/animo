package com.example.animo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailAnimalActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_animal)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Hewan"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tImage = intent.getIntExtra(EXTRA_PHOTO, 0)

        tvName.text = tName
        Glide.with(this)
            .load(tImage)
            .apply(RequestOptions())
            .into(imgPhoto)
        tvDetail.text = tDetail
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
