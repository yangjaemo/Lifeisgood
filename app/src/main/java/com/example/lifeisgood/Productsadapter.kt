package com.example.lifeisgood

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Productsadapter(val context: Context, val productsList: ArrayList<Products>) : BaseAdapter()
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View = LayoutInflater.from(context).inflate(R.layout.activity_products_list, null)

        val profile = view.findViewById<ImageView>(R.id.id_profile)
        val productsname = view.findViewById<TextView>(R.id.id_products_name)
        val price = view.findViewById<TextView>(R.id.id_price)
        val buy = view.findViewById<TextView>(R.id.id_buy1)

        val products = productsList[position]

        profile.setImageResource(products.profile)
        productsname.text = products.productsname
        price.text = products.price
        buy.text = products.buy

        return view
    }

    override fun getItem(position: Int): Any {
        return productsList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return productsList.size
    }






}