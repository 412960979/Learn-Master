package com.example.ijkvedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.ijkvedio.adapter.ListAdapter
import com.example.ijkvedio.model.getVideoList
import kotlinx.android.synthetic.main.activity_ijk_live.*

class IjkLiveActivity : AppCompatActivity() {
    private lateinit var adapter: ListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ijk_live)

        adapter = ListAdapter(getVideoList())
        rlVideo.adapter = adapter

        /*PageSnapHelper 25.1.0sdk提供的
        可以使RecyclerView像ViewPager一样的效果，一次只能滑一页，而且居中显示*/
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(rlVideo)

        setScrollListener()
    }

    /**
     * RecyclerView滑动的时候播放当前选中页的视频，其他的视频暂停
     */
    private fun setScrollListener() {
        rlVideo.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)

                when (newState) {
                    RecyclerView.SCROLL_STATE_IDLE -> {
                        //停止滚动, 释放上一个播放，打开当前位置的播放
                    }
                    RecyclerView.SCROLL_STATE_DRAGGING -> {
                        // 拖动
                    }
                    RecyclerView.SCROLL_STATE_SETTLING -> {
                        // 惯性滑动
                    }
                }
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
            }
        })
    }

    override fun onPause() {
        super.onPause()

        // 页面不可见暂停视频播放
    }

    override fun onDestroy() {
        super.onDestroy()

        // 页面销毁的时候关闭所有播放的资源
    }
}