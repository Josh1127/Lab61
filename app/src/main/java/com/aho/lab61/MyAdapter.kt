package com.aho.lab61

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_list.view.*



class MyAdapter(var itemList: MutableList<Item>) : BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val view = View.inflate(parent?.context, R.layout.item_list, null)
            view.name.text= itemList[position].name_fruit
            view.price.text=itemList[position].price.toString()
            view.imageView.setImageResource(itemList[position].img)

        return view
    }

    override fun getItem(position: Int): Any {
        return itemList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0L
    }

    override fun getCount(): Int {
        return itemList.size
    }
}