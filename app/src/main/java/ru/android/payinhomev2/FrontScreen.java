package ru.android.payinhomev2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import static android.content.SharedPreferences.Editor;

public class FrontScreen extends AppCompatActivity implements View.OnClickListener {
    public static final String APP_PREFERENCES_THEME = "THEME";
    Button signbtn;
    Button regbtn;
    SharedPreferences sharedSettings;
    Editor editor;

    @Override
    public void onCreate(Bundle savedInstanceState) {
//        regbtn = (Button) findViewById(R.id.reg_btn);
//        regbtn.setOnClickListener(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_screen);
        signbtn =  findViewById(R.id.enter_btn);
        signbtn.setOnClickListener(this);

        sharedSettings = getSharedPreferences(APP_PREFERENCES_THEME, Context.MODE_PRIVATE);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.enter_btn:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }

    public void onRadioButtonClicked(View view) {
        //TODO: SharedPref Front Activity
        // Кнопка выбрана?
        boolean checked = ((RadioButton) view).isChecked();
        // проверяем какая кнопка выбрана
        switch (view.getId()) {
            case R.id.radio_theme_light:
                if (checked)


                    editor = sharedSettings.edit();
                editor.putInt(APP_PREFERENCES_THEME, 0);
                editor.apply();

                break;
            case R.id.radio_theme_dark:
                if (checked)
                    editor = sharedSettings.edit();
                editor.putInt(APP_PREFERENCES_THEME, 1);
                editor.apply();
                break;
        }
    }
}
