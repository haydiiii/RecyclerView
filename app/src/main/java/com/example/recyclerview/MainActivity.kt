package com.example.recyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val users = mutableListOf(
            User("Ahmed Mohamed", "Ahmed@gmail.com"),
            User("Mahmoud Mohamed", "Mahmoud@gmail.com"),
            User("Mona Ahmed", "Mona@gmail.com"),
            User("Menna Ali", "Menna@gmail.com"),
            User("Youssef Mohamed", "Youssef@gmail.com"),
            User("Ahmed Mohamed", "Ahmed@gmail.com"),
            User("Mahmoud Ahmed", "Mahmoud@gmail.com"),
            User("Yasmine Ahmed", "Mona@gmail.com"),
            User("Mohamed Ali", "Menna@gmail.com"),
            User("Farida Mohamed", "Youssef@gmail.com")
        )
        val userAdapter = UserAdapter(users)
        binding.rvStudents.adapter = userAdapter
        binding.toolbarLayout.toolbar.setNavigationOnClickListener {
            binding.drawerLayout.open()
        }
        binding.navigationView.setNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.home -> {
                    Toast.makeText(this,R.string.Home,Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }
                R.id.gallery -> {
                    Toast.makeText(this,R.string.Gallery,Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }
                R.id.slideShow -> {
                    Toast.makeText(this,R.string.SlideShow,Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }
                else -> false
            }
        }
        binding.toolbarLayout.toolbar.setOnMenuItemClickListener() { item ->
            when(item.itemId){
                R.id.pprofile -> {
                    Toast.makeText(this,R.string.Profile,Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }
                R.id.setting -> {
                    Toast.makeText(this,R.string.Setting,Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }
                R.id.change -> {
                    Toast.makeText(this,R.string.chang_language,Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }
                else -> false
            }
        }


    }
}

