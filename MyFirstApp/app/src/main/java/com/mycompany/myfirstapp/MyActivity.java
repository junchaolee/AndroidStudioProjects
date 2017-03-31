package com.mycompany.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MyActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE="com.mycompany.myfirstapp.MESSAGE";
    @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       requestWindowFeature(Window.FEATURE_NO_TITLE);
       setContentView(R.layout.activity_my);
       Button button1=(Button) findViewById(R.id.button_1);
      /* button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MyActivity.this, "你点击了发送", Toast.LENGTH_SHORT).show();
            }
        });*/
     /*  button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(MyActivity.this,DisplayMessageActivity.class);
               startActivity(intent);
           }
       });*/

     /*  button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(Intent.ACTION_VIEW);
               intent.setData(Uri.parse("http://www1.slswd.com"));
               startActivity(intent);
           }
       });*/

       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(Intent.ACTION_DIAL);
               intent.setData(Uri.parse("tel:10086"));
               startActivity(intent);
           }
       });
   }
}
