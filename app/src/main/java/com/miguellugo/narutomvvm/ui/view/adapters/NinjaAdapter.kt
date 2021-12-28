package com.miguellugo.narutomvvm.ui.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.miguellugo.narutomvvm.data.model.NinjaItem
import com.miguellugo.narutomvvm.databinding.ItemListNinjasBinding
import com.miguellugo.narutomvvm.util.extension.load

class NinjaAdapter : RecyclerView.Adapter<NinjaAdapter.MyViewHolder>()
{
    private var itemList = emptyList<NinjaItem>()
    class MyViewHolder(val binding: ItemListNinjasBinding) : RecyclerView.ViewHolder(binding.root)
    {
        fun bindView(ninja: NinjaItem){
            val name = ninja.name
            val image = ninja.images[0]

            binding.nameNinjaTextView.text = name
            binding.photoNinjaImageView.load(image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ItemListNinjasBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.bindView(currentItem)
    }

    override fun getItemCount(): Int = itemList.size

    fun setData(itemList : List<NinjaItem>){
        this.itemList = itemList
        notifyDataSetChanged()
    }

}