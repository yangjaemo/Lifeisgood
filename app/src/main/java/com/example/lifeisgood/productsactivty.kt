//package com.example.lifeisgood
//
//import android.os.Bundle
//import android.widget.AdapterView
//import android.widget.ListView
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//
//class productsactivty : AppCompatActivity(){
//
//    var productsList = arrayListOf<Products>(
//        Products(R.drawable.chocolate, "초콜렛상품1", "1000원", "구매하기"),
//        Products(R.drawable.chocolate, "초콜렛상품2", "2000원", "구매하기"),
//        Products(R.drawable.chocolate, "초콜렛상품3", "3000원", "구매하기"),
//        Products(R.drawable.chocolate, "초콜렛상품4", "4000원", "구매하기"),
//        Products(R.drawable.chocolate, "초콜렛상품5", "5000원", "구매하기"),
//        Products(R.drawable.chocolate, "초콜렛상품6", "6000원", "구매하기"),
//        Products(R.drawable.chocolate, "초콜렛상품7", "7000원", "구매하기"),
//        Products(R.drawable.chocolate, "초콜렛상품8", "8000원", "구매하기"),
//        Products(R.drawable.chocolate, "초콜렛상품9", "9000원", "구매하기"),
//        Products(R.drawable.chocolate, "초콜렛상품10", "10000원", "구매하기")
//    )
//
//    override fun onCreate(savedInstanceState: Bundle?){
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_products_list)
//
//        val Adapter = Productsadapter(this,productsList)
//        ListView.adapter = Adapter
//
//        ListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
//                val selectItem = parent.getItemAtPosition(position) as Products
//                Toast.makeText(this, selectItem.productsname, Toast.LENGTH_SHORT).show()
//            }
//
//    }
//}
