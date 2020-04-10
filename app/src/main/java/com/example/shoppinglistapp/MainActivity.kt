package com.example.shoppinglistapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private val images = intArrayOf(R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,
            R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9,
            R.drawable.image10, R.drawable.image13, R.drawable.image12)
    private var adapter: RecyclerAdapter? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        layoutManager = GridLayoutManager(this, 1)
        recycler_view.setHasFixedSize(true)
        recycler_view.setLayoutManager(layoutManager)
        adapter = RecyclerAdapter(images)
        recycler_view.setAdapter(adapter)
    }
}