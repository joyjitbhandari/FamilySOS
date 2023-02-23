package com.example.familysos.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.familysos.Fragments.DashboardFragment
import com.example.familysos.Fragments.GuardFragment
import com.example.familysos.Fragments.HomeFragment
import com.example.familysos.Fragments.ProfileFragment
import com.example.familysos.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)
        bottomBar.setOnItemSelectedListener {

            when(it.itemId){
                R.id.nav_home -> inflateFragment(HomeFragment.newInstance())
                R.id.nav_dashboard -> inflateFragment(DashboardFragment.newInstance())
                R.id.nav_guard -> inflateFragment(GuardFragment.newInstance())
                R.id.nav_profile -> inflateFragment(ProfileFragment.newInstance())
            }
            true
        }
    }

    private fun inflateFragment(newInstance: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,newInstance)
        transaction.commit()
    }

}