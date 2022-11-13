package com.example.myrecipe

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var search : Button
    lateinit var newRecipe : Button
    lateinit var myRecipes : Button
    lateinit var logoutBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        search = findViewById(R.id.searchActivityButton)
        search.setOnClickListener() {
            changeActivityToSearch(it)
        }
        newRecipe = findViewById(R.id.createRecipeButton)
        newRecipe.setOnClickListener() {
            changeActivityToNewRecipe(it)
        }
        myRecipes = findViewById(R.id.myRecipesButton)
        myRecipes.setOnClickListener() {
            changeActivityToMyRecipes(it)
        }

        logoutBtn = findViewById(R.id.logoutbtn)
        logoutBtn.setOnClickListener() {
            logout()
        }

    }
    private fun changeActivityToSearch(button: View) {
        val intent = Intent(this, SearchActivity::class.java)
        startActivity(intent)
    }
    private fun changeActivityToNewRecipe(button: View) {
        val intent = Intent(this, NewRecipeActivity::class.java)
        startActivity(intent)
    }
    private fun changeActivityToMyRecipes(button: View) {
        val intent = Intent(this, MyRecipes::class.java)
        startActivity(intent)
    }

    private fun logout(){
        val intent = Intent(this, LoginActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
        finish()

    }
    }


