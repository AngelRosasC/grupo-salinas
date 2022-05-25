package com.arcode.eamovies.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.arcode.eamovies.R
import com.arcode.eamovies.databinding.ActivityMainBinding
import com.arcode.eamovies.utils.constants.Constants.TIME_TO_EXIT
import com.arcode.eamovies.utils.constants.extensions.showToast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var backPressedTime: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(binding.navView, navHostFragment.navController)
    }

    override fun onBackPressed() {
        if (backPressedTime + TIME_TO_EXIT > System.currentTimeMillis()) {
            super.onBackPressed()
            finish()
            return
        } else {
            this.showToast(getString(R.string.press_back_again_to_exit))
        }
        backPressedTime = System.currentTimeMillis()
    }
}