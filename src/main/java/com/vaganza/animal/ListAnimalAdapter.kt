package com.vaganza.animal

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ListAnimalAdapter(private val listAnimal: ArrayList<Animal>) : RecyclerView.Adapter<ListAnimalAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback : OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_animal, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val animal = listAnimal[position]
        Glide.with(holder.itemView.context)
            .load(animal.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.tvAnimalPhoto)
        holder.tvAnimalName.text = animal.name
        holder.tvLatinName.text = animal.latin
	    holder.tvAnimalFamili.text = animal.famili
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listAnimal[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listAnimal.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Animal)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvAnimalName : TextView = itemView.findViewById(R.id.tv_animalName)
        var tvLatinName : TextView = itemView.findViewById(R.id.tv_latinName)
        var tvAnimalFamili : TextView = itemView.findViewById(R.id.tv_animalFamili)
        var tvAnimalPhoto : ImageView = itemView.findViewById(R.id.tv_animalPhoto)
    }
}