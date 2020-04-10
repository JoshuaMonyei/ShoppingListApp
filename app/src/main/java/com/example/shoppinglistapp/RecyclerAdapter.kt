package com.example.shoppinglistapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.shoppinglistapp.RecyclerAdapter.ImageViewHolder

class RecyclerAdapter(private val images: IntArray) : RecyclerView.Adapter<ImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.images_layout, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val image_id = images[position]
        holder.image.setImageResource(image_id)
        holder.imageTitle.text = "Image: $position"
    }

    override fun getItemCount(): Int {
        return images.size
    }

    class ImageViewHolder(itemView: View) : ViewHolder(itemView) {
        var image: ImageView
        var imageTitle: TextView

        init {
            image = itemView.findViewById(R.id.item_images)
            imageTitle = itemView.findViewById(R.id.images_title)
        }
    }

}