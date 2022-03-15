package com.vaganza.animal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class AnimalDetail : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_LATIN = "extra_latin"
        const val EXTRA_FAMILI = "extra_famili"
	    const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_detail)

        val tvName : TextView = findViewById(R.id.tv_animalName)
        val tvLatin : TextView = findViewById(R.id.tv_latinName)
        val tvFamili : TextView = findViewById(R.id.tv_animalFamili)
	    val tvDetail : TextView = findViewById(R.id.tv_animalDetail)
        val ivPhoto : ImageView = findViewById(R.id.iv_animalPhoto)
        val actionBar = supportActionBar
        val name = intent.getStringExtra(EXTRA_NAME)
	    val latin = intent.getStringExtra(EXTRA_LATIN)
        val famili = intent.getStringExtra(EXTRA_FAMILI)
	    val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)
	
	    val txtLatin = "nama latin:\n$latin"
        val txtFamili = "famili:\n$famili"

        tvName.text = name
        tvLatin.text = txtLatin
	    tvFamili.text = txtFamili
        tvDetail.text = detail
        ivPhoto.setImageResource(photo)

        actionBar!!.title = name
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}