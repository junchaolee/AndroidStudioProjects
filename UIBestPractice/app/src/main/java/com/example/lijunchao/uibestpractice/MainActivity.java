package com.example.lijunchao.uibestpractice;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private ListView msgListView;
    private EditText inputText;
    private Button send;
    private MsgAdapter adapter;
    private List<Message> msgList=new ArrayList<Message>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMsgs();//初始化数据
        adapter=new MsgAdapter(MainActivity.this,R.layout.msg_item,msgList);
        inputText=(EditText)findViewById(R.id.input_text);
        send=(Button)findViewById(R.id.send);
        msgListView=(ListView)findViewById(R.id.msg_list_view);
        msgListView.setAdapter(adapter);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content=inputText.getText().toString();
                if(!"".equals(content)){
                    Message msg=new Message(content,Message.TYPE_SENT);
                    msgList.add(msg);
                    adapter.notifyDataSetChanged();//当有消息时刷新状态
                    msgListView.setSelection(msgList.size());//将ListView定位到最后一行
                    inputText.setText("");//清空输入框中的内容

                }
            }
        });

    }

    private void initMsgs(){
        Message msg1=new Message("Hello guy",Message.TYPE_RECEIVED);
        msgList.add(msg1);
        Message msg2=new Message("Hell,Who is that?",Message.TYPE_SENT);
        msgList.add(msg2);
        Message msg3=new Message("This is Tom,Nice talking to you ",Message.TYPE_RECEIVED);
        msgList.add(msg3);
    }
}
