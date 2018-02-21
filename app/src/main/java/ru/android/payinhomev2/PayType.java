package ru.android.payinhomev2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PayType extends PayPage implements View.OnClickListener{
    ImageButton pressReturnBtn;
    Button pressBankCard;
    Button pressMtsWallet;
    Button pressPayFromPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_type);
//        pressReturnBtn = (ImageButton) findViewById(R.id.btn_return);
//        pressReturnBtn.setOnClickListener(this);
//        pressBankCard = (Button) findViewById(R.id.payFromCard);
//        pressBankCard.setOnClickListener(this);
//        pressMtsWallet = (Button) findViewById(payFromWallet);
//        pressMtsWallet.setOnClickListener(this);
//        pressPayFromPhone = (Button) findViewById(payFromPhone);
//        pressPayFromPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
//            case R.id.btn_return:
//                onBackPressed();
//                break;
//            case payFromCard:
//                pressBankCard.setTextColor(0xffff0000);
//                pressBankCard.setBackgroundResource(R.drawable.button_border_black);
//                onBackPressed();
//                Toast.makeText(this, R.string.text_sent, Toast.LENGTH_SHORT).show();
//                break;
//            case payFromWallet:
//                pressMtsWallet.setTextColor(0xffff0000);
//                pressMtsWallet.setBackgroundResource(R.drawable.button_border_black);
//                onBackPressed();
//                Toast.makeText(this, R.string.text_sent, Toast.LENGTH_SHORT).show();
//                break;
//            case payFromPhone:
//                pressPayFromPhone.setTextColor(0xffff0000);
//                pressPayFromPhone.setBackgroundResource(R.drawable.button_border_black);
//                onBackPressed();
//                Toast.makeText(this, R.string.text_sent, Toast.LENGTH_SHORT).show();
//                break;
        }
    }
}
