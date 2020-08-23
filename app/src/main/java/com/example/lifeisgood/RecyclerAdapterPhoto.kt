//package com.example.lifeisgood
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.fragment.app.FragmentActivity
//import androidx.recyclerview.widget.RecyclerView
//
//class RecyclerAdapterPhoto(val context: FragmentActivity?, var list: List<thumbnailData>, var num: Int, val itemClick: (thumbnailData, Int) -> Unit) :
//RecyclerView.Adapter<RecyclerAdapterPhoto.Holder>()
//{
//    private var size : Int = 200
//    private var padding_size = 200
//
//    inner class Holder(itemView: View?, itemClick: (thumbnailData, Int) -> Unit) : RecyclerView.ViewHolder(itemView!!) {
//
//        var thumbnail: ImageView = itemView!!.findViewById<ImageView>(R.id.thumbnail_img)
//        var text = itemView?.findViewById<TextView>(R.id.thumbnail_img_text)
//
//        fun bind(data : thumbnailData, num: Int) {
//            val layoutParam = thumbnail.layoutParams as ViewGroup.MarginLayoutParams
//            thumbnail.layoutParams.width = size
//            thumbnail.layoutParams.height = size
//            layoutParam.setMargins(padding_size, padding_size, padding_size, padding_size)
//            text!!.text = data.data
//            itemView.setOnClickListener { itemClick(data, num) }
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
//        val view = LayoutInflater.from(context).inflate(R.layout.thumbnail_imgview, parent, false)
//        return Holder(view, itemClick)
//    }
//
//    override fun getItemCount(): Int {
//        return list.size
//    }
//
//    override fun onBindViewHolder(holder: Holder, position: Int) {
//        holder.bind(list[position], position)
//
//    }
//
//    fun setPhotoSize(size : Int, padding_size : Int) {
//        this.size = size
//        this.padding_size = padding_size
//        notifyDataSetChanged()
//    }
//
//    fun setThumbnailList(list : List<thumbnailData>) {
//        this.list = list
//        notifyDataSetChanged()
//    }
//}