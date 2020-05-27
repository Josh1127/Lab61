package com.aho.lab61

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var itemList : MutableList<Item> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       addItemlist()

        listview.adapter= MyAdapter(itemList)
    }

    private fun addItemlist(){
        itemList.add(Item("Apple", 20, R.drawable.frut_apple))
        itemList.add(Item("Banana", 10, R.drawable.frut_banana))
        itemList.add(Item("Cherry", 25, R.drawable.frut_cherry))
        itemList.add(Item("Grapes", 30, R.drawable.frut_grapes))
        itemList.add(Item("Lemon", 20, R.drawable.frut_lemon))
        itemList.add(Item("Orange", 25, R.drawable.frut_orange))
        itemList.add(Item("Pear", 15, R.drawable.frut_pear))
        itemList.add(Item("Pineapple", 25, R.drawable.frut_pineapple))
        itemList.add(Item("Tomato", 30, R.drawable.frut_tomato))
        itemList.add(Item("Watermelon", 20, R.drawable.frut_watermelon))
    }
}
