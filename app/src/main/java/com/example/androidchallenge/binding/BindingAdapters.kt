package com.example.androidchallenge.binding

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.api.load
import com.example.androidchallenge.R
import com.example.androidchallenge.model.heroes.Thumbnail

@BindingAdapter("imageThumbnail")
fun setImage(view: ImageView, thumbnail: Thumbnail) {
    val url = "${thumbnail.path}.${thumbnail.extension}".replace("http", "https")
    view.load(url)
}

@BindingAdapter("android:isVisible")
fun View.setIsVisible(visible: Boolean?) {
    visibility = if (visible != null && visible) View.VISIBLE else View.GONE
}