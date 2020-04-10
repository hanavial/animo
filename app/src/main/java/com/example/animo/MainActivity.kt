package com.example.animo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvAnimals: RecyclerView
    private var list: ArrayList<Animal> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAnimals = findViewById(R.id.rv_animal)
        rvAnimals.setHasFixedSize(true)
        showRecyclerCardView()

        list.addAll(AnimalData.listData)

    }

    private fun showRecyclerCardView(){
        rvAnimals.layoutManager = LinearLayoutManager(this)
        val cardViewAnimalAdapter = CardviewAnimalAdapter(list)
        rvAnimals.adapter = cardViewAnimalAdapter


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_item -> {
                val eAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(eAbout)
            }
        }
    }


}
