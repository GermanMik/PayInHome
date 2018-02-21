package ru.android.payinhomev2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class AdditPage extends AppCompatActivity implements View.OnClickListener{
    ImageButton returnBtn;
//    Button sendBtnAddit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addit_page);
//        returnBtn = (ImageButton) findViewById(R.id.returnBtn);
//        returnBtn.setOnClickListener(this);
//        sendBtnAddit = (Button) findViewById(R.id.sendBtn);
//        sendBtnAddit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        Intent intent;
//        switch (v.getId()) {
//            case R.id.returnBtn:
//                onBackPressed();
//                break;
//            case R.id.sendBtnAddit:
//                sendBtnAddit.setTextColor(0xffff0000);
//                sendBtnAddit.setBackgroundResource(R.drawable.button_border_black);
//                onBackPressed();
//                Toast.makeText(this, R.string.text_sent, Toast.LENGTH_SHORT).show();
//                break;
//        }
    }
}