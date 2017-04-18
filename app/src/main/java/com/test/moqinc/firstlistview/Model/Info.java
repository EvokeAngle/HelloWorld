package com.test.moqinc.firstlistview.Model;

import android.text.Html;

/**
 * Created by Moqinc on 2017/4/15.
 * 模仿图片的内容    图片的名称  图片路径
 *
 * 轮播图的实现： Url->本地文件（图片）->通过piascoo模仿从当地中添加显示的图片
 *  轮播图 需要什么图
 */

public class Info {
    private String url;
    private String title;
    public  Info(String title,String url){
        this.url = url;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
