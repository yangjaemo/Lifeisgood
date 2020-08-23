//package com.example.lifeisgood
//
//import android.content.Intent
//import android.os.Bundle
//import android.util.DisplayMetrics
//import android.view.View
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.GridLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//
//class Main_PhotoView: AppCompatActivity() {
//    private var recyclerAdapter : RecyclerAdapterPhoto?= null
//    private var thumbnailList = listOf<thumbnailData>()
//    private var num: Int = 3
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.main_photoview)
//        val view: View = findViewById(R.id.photo_recyclerView)
//        setView(view)
//        SetHeader()
//        setPhotoSize(3, 10)
//        // Inflate the layout for this fragment
//        var vm = ViewModelProviders.of(this).get(PhotoViewModel::class.java)
//        vm.getNameDir().observe(this,
//            Observer<List<thumbnailData>> { t -> recyclerAdapter?.setThumbnailList(t) })
//
//    }
//
//    private fun setView(view : View) {
//        val recyclerView = view.findViewById<RecyclerView>(R.id.photo_recyclerView)
//        recyclerAdapter =
//            RecyclerAdapterPhoto(this, thumbnailList, num) {
//                    thumbnailData, num ->  Toast.makeText(this,"인덱스: ${num} 이름: ${thumbnailData.data}",Toast.LENGTH_SHORT).show()
//                val intent = Intent(this, com.example.lifeisgood.PhotoViewPager::class.java)
//                intent.putExtra("photo_num", num)
//                intent.putExtra("photo_name", thumbnailData.data)
//                startActivity(intent)
//            }
//        recyclerView?.adapter = recyclerAdapter
//
//        val lm = GridLayoutManager(MainActivity(), 3)
//        recyclerView?.layoutManager = lm as RecyclerView.LayoutManager?
//    }
//
//    private fun setPhotoSize(row : Int, padding : Int) {
//        val displayMetrics = DisplayMetrics()
//        this.windowManager.defaultDisplay.getMetrics(displayMetrics)
//
//        var width = displayMetrics.widthPixels
//        var size = width / row - 2*padding
//
//        recyclerAdapter!!.setPhotoSize(size, padding)
//    }
//
//    private fun SetHeader() {
//        val toolbar = findViewById<Toolbar>(R.id.photo_toolbar)
//        toolbar.bringToFront()
//        setSupportActionBar(toolbar)
//        supportActionBar?.setTitle(null)
//    }
//}