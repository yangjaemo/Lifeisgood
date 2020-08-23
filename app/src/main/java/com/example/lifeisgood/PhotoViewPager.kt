//package com.example.lifeisgood
//
//import android.os.Bundle
//import android.view.View
//import android.widget.ImageView
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import androidx.appcompat.widget.AppCompatTextView
//import androidx.recyclerview.widget.RecyclerView
//import androidx.viewpager.widget.ViewPager
//
//class PhotoViewPager : AppCompatActivity() {
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        /*getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        val uiOptions = getWindow().getDecorView().getSystemUiVisibility();
//        var newUiOptions = uiOptions;*/
//        getExtra()
//        setContentView(R.layout.photoview_frame)
//        subimg = findViewById(R.id.sub_img) as ImageView
//        subimg!!.setImageResource(R.drawable.loding_image)
//        super.onEnterAnimationComplete()
//        var vm = ViewModelProviders.of(this).get(PhotoViewModel::class.java)
//        vm.getNameDir().observe(this,
//            Observer<List<thumbnailData>> { t -> recyclerAdapter?.setThumbnailList(t)
//            })
//
//        val view: View = findViewById(R.id.imgViewPager)
//        val text_name = findViewById<AppCompatTextView>(R.id.imgView_text)
//        val tb = findViewById<View>(R.id.mainphoto_toolbar)
//        val bt = findViewById<View>(R.id.bottom_photo_menu)
//
//        setView(view, tb, bt)
//        toolbar_text(index, text_name)
//
//        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
//
//            override fun onPageScrollStateChanged(state: Int) { }
//            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
//                if(check == false ) {
//                    viewPager.setCurrentItem(index, false)
//                    check = true
//                }
//                subimg!!.setImageResource(0)    // 애니메이션
//                tb.visibility = View.VISIBLE
//                bt.visibility = View.VISIBLE
//            }
//            override fun onPageSelected(position: Int) {
//                check_index = position
//                text_name.setText(photoList[position].data)
//            }
//        })
//
//    }
//
//    private fun setView(view: View, toolbar: View, bottombar: View) {
//
//        viewPager = view.findViewById<RecyclerView>(R.id.imgViewPager) as ViewPager
//        recyclerAdapter =
//            PagerRecyclerAdapter(
//                this,
//                thumbnailList, toolbar, bottombar
//            )
//
//        //Log.d("asd",recyclerAdapter?.getThumbnailList())
//        viewPager?.adapter = recyclerAdapter
//
//    }
//
//
//    fun toolbar_text(position: Int, name: AppCompatTextView){
//        name.setText(photoList[position].data)
//    }
//
//    fun getExtra(){
//        if (intent.hasExtra("photo_num") && intent.hasExtra("photo_list")) {
//            index = intent.getIntExtra("photo_num", 0)
//            photoList = intent.getSerializableExtra("photo_list") as ArrayList<thumbnailData>
//        }
//        else {
//            Toast.makeText(this, "전달된 이름이 없습니다", Toast.LENGTH_SHORT).show()
//        }
//    }
//}