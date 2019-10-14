package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //onCreate = main function
        super.onCreate(savedInstanceState)
        //Display the UI. R = resources(manage anything that added into the res folder)
        setContentView(R.layout.activity_main)

        //val = value(constant,fixed), var = variables
        val buttonShowName: Button = findViewById(R.id.buttonShowName)
        buttonShowName.setOnClickListener{showName()}
    }

    private fun showName() {
        textViewName.setText("Rachel Wong")

    }
}
