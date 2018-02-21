package ru.android.payinhomev2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class QueryPage extends AppCompatActivity implements View.OnClickListener{
    ImageButton returnBtn;
    Button sendBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_page);
//        returnBtn = (ImageButton) findViewById(R.id.returnBtn);
//        returnBtn.setOnClickListener(this);
//        sendBtn = (Button) findViewById(R.id.sendBtn);
//        sendBtn.setOnClickListener(this);


    }

    private String getText(EditText editBtn1) {
        editBtn1.getText();
        return null;
    }

    @Override
    public void onClick(View v) {
//        Intent intent;
//        switch (v.getId()) {
//            case R.id.returnBtn:
//                onBackPressed();
//                break;
//            case R.id.sendBtn:
//                sendBtn.setTextColor(0xffff0000);
//                sendBtn.setBackgroundResource(R.drawable.button_border_black);
//                onBackPressed();
//                Toast.makeText(this, R.string.text_sent, Toast.LENGTH_SHORT).show();
//                break;
//        }
    }
}