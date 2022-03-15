package com.vaganza.animal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    private lateinit var rvAnimal: RecyclerView
    private var list: ArrayList<Animal> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvAnimal = findViewById(R.id.rv_animal)
        rvAnimal.setHasFixedSize(true)
        list.addAll(AnimalData.animalData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAnimal.layoutManager = LinearLayoutManager(this)
        val listAnimalAdapter = ListAnimalAdapter(list)
        rvAnimal.adapter = listAnimalAdapter
        listAnimalAdapter.setOnItemClickCallback(object : ListAnimalAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Animal) {
                detailAnimal(data)
            }
        })
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.about -> {
            val about_me = Intent(this@MainActivity, About::class.java)
            startActivity(about_me)
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
    private fun detailAnimal(animal: Animal) {
        val detailAnimal = Intent(this@MainActivity, AnimalDetail::class.java)
        detailAnimal.putExtra(AnimalDetail.EXTRA_NAME, animal.name)
        detailAnimal.putExtra(AnimalDetail.EXTRA_LATIN, animal.latin)
	detailAnimal.putExtra(AnimalDetail.EXTRA_FAMILI, animal.famili)
        detailAnimal.putExtra(AnimalDetail.EXTRA_DETAIL, animal.detail)
        detailAnimal.putExtra(AnimalDetail.EXTRA_PHOTO, animal.photo)
        startActivity(detailAnimal)
    }
}