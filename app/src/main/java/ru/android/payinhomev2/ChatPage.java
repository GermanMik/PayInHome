package ru.android.payinhomev2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ChatPage extends AppCompatActivity implements View.OnClickListener {
    ImageButton returnBtn;
    Button sendBtnChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_page);
//        returnBtn = (ImageButton) findViewById(R.id.returnBtn);
//        returnBtn.setOnClickListener(this);
//        sendBtnChat = (Button) findViewById(R.id.sendBtnChat);
//        sendBtnChat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        Intent intent;
//        switch (v.getId()) {
//            case R.id.returnBtn:
//                onBackPressed();
//                break;
//            case R.id.sendBtnChat:
//                sendBtnChat.setTextColor(0xffff0000);
//                sendBtnChat.setBackgroundResource(R.drawable.button_border_black);
//                onBackPressed();
//                Toast.makeText(this, R.string.text_sent, Toast.LENGTH_SHORT).show();
//                break;
//        }
    }
}