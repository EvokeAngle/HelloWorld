package com.test.moqinc.firstlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    /**
     * 如何使用脚本注入
     * gradle 的工作方式是什么？
     * Lint是为了检查版本不和的问题
     *
     * 怎么知道As 的编译过程  配置文件是怎样通过构建的过程发现没有正确配置的地方
     *
     *怎么知道熟悉一下插件的使用
     *
     *
     * @param savedInstanceState
     * goal:添加列表
     * 1：先在要用的活动中添加listview
     * 2：编写适配器
     * 3：设置适配器
     * 注意事项：适配器可以是泛型   泛型就是自定义的数据类型
     *
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] data={"苗苗","王铮铮","林允儿","卫莉丽","林华华","林华华","陆亦可","金泰贤"};
        ListView listView= (ListView) findViewById(R.id.list_view);
        //参数意义：上下文   库中自定义的一个只能添加文本 的下拉列表  要添加的数据
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,data);
        //为当前列表添加适配器  自定义泛型可以考虑
        listView.setAdapter(adapter);


    }
}
