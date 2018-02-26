package ru.android.payinhomev2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class FrontScreen extends AppCompatActivity implements View.OnClickListener {
    public static final String APP_PREFERENCES_THEME = "THEME";
    Button signbtn;
    Button regbtn;
    String pref;
    SharedPreferences sharedSettings;

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
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_theme_light:
                if (checked)
                sharedSettings = getSharedPreferences(APP_PREFERENCES_THEME, 0);
                SharedPreferences.Editor editor = sharedSettings.edit();
                editor.putInt("theme", 0);
                editor.commit();

                break;
            case R.id.radio_theme_dark:
                if (checked)
                    sharedSettings = getSharedPreferences(APP_PREFERENCES_THEME, 0);
                editor = sharedSettings.edit();
                //"theme" is the key sTheme is the value you're saving
                editor.putInt("theme", 1);
                editor.commit();
                    break;
        }
    }
}
