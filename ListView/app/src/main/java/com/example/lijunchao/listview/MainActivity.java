package com.example.lijunchao.listview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<Fruit> fruitList=new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();//初始化水果数据
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruit_layout,fruitList);
        ListView listView=(ListView)findViewById(R.id.lsit_view);
        listView.setAdapter(adapter);

        //ListView中的子项设置点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit=fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });


    }
    private void initFruits(){
        Fruit apple=new Fruit("Apple",R.drawable.apple);
        fruitList.add(apple);
        Fruit tomato=new Fruit("Tomato",R.drawable.tomato);
        fruitList.add(tomato);
        Fruit pear=new Fruit("Pear",R.drawable.pear);
        fruitList.add(pear);
        Fruit apricot=new Fruit("Apricot",R.drawable.apricot);
        fruitList.add(apricot);
        Fruit banana=new Fruit("Banana",R.drawable.banana);
        fruitList.add(banana);
        Fruit cherry=new Fruit("Cherry",R.drawable.cherry);
        fruitList.add(cherry);
        Fruit kiwi=new Fruit("Kiwi",R.drawable.kiwi);
        fruitList.add(kiwi);
        Fruit lemon=new Fruit("Lemon",R.drawable.lemon);
        fruitList.add(lemon);
        Fruit mango=new Fruit("Mango",R.drawable.mango);
        fruitList.add(mango);
        Fruit olive=new Fruit("Olive",R.drawable.olive);
        fruitList.add(olive);
        Fruit orange=new Fruit("Orange",R.drawable.orange);
        fruitList.add(orange);
        Fruit peach=new Fruit("Peach",R.drawable.peach);
        fruitList.add(peach);
        Fruit strawberry=new Fruit("Strawberry",R.drawable.strawberry);
        fruitList.add(strawberry);
        Fruit albicocca=new Fruit("Albicocca",R.drawable.albicocca);
        fruitList.add(albicocca);
        Fruit cocco=new Fruit("Cocco",R.drawable.cocco);
        fruitList.add(cocco);
        Fruit pineapple=new Fruit("Pineapple",R.drawable.pineapple);
        fruitList.add(pineapple);
        Fruit watermelon=new Fruit("Watermelon",R.drawable.watermelon);
        fruitList.add(watermelon);

    }
}
