package ru.android.payinhomev2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FrontScreen extends AppCompatActivity implements View.OnClickListener {
    Button signbtn;
    Button regbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        regbtn = (Button) findViewById(R.id.reg_btn);
//        regbtn.setOnClickListener(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_screen);
        signbtn = (Button) findViewById(R.id.enter_btn);
        signbtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.enter_btn:
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        break;
    }}
}
