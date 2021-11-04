package com.android.myvideo.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import com.android.myvideo.R
import com.android.myvideo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var filmButton: Button
//    private val filmButton: Button by lazy {findViewById(R.id.bottom_navigation)}
//    private val searchButton: Button by lazy {findViewById(R.id.navigation_search)}
//    private val settingshButton: Button by lazy {findViewById(R.id.navigation_settings)}

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            bottomNavigation.setOnClickListener {
                val toastMessage =
                    showPopup(bottomNavigation)
            }
        }
//        if (showPopup(filmButton)){
//            Toast.LENGTH_SHORT
//        }else{
//            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
//        }
    }


    private fun showPopup(view: View) {
        val popup = PopupMenu(this, view)
        popup.inflate(R.menu.bottom_navigate_menu)
        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item: MenuItem? ->
            when (item!!.itemId) {
                R.id.navigation_main -> {
                    Toast.makeText(this@MainActivity, item.title, Toast.LENGTH_SHORT).show()
                }
                R.id.navigation_favorite -> {
                    Toast.makeText(this@MainActivity, item.title, Toast.LENGTH_SHORT).show()
                }
                R.id.navigation_search -> {
                    Toast.makeText(this@MainActivity, item.title, Toast.LENGTH_SHORT).show()
                }
                R.id.navigation_settings -> {
                    Toast.makeText(this@MainActivity, item.title, Toast.LENGTH_SHORT).show()
                }
            }
            true
        })
        popup.show()

    }


    //    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.bottom_navigate_menu, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle action bar item clicks here.
//        val id = item.getItemId()
//
//        if (id == R.id.navigation_main) {
//            Toast.makeText(this, "Item One Clicked", Toast.LENGTH_LONG).show()
//            return true
//        }
//        if (id == R.id.navigation_favorite) {
//            Toast.makeText(this, "Item Two Clicked", Toast.LENGTH_LONG).show()
//            return true
//        }
//        if (id == R.id.navigation_search) {
//            Toast.makeText(this, "Item Three Clicked", Toast.LENGTH_LONG).show()
//            return true
//        }
//        if (id == R.id.navigation_settings) {
//            Toast.makeText(this, "Item Three Clicked", Toast.LENGTH_LONG).show()
//            return true
//        }
//
//        return super.onOptionsItemSelected(item)
//
//    }
//

//    fun onClick(itemId: Int) {
//        supportFragmentManager
//            .beginTransaction()
//            .replace(R.id.fragment_placeholder, FragmentFilmSelected.newInstance(itemId))
//            .addToBackStack("")
//            .commit()
//    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.bottom_navigate_menu, menu)
        return true
    }

}