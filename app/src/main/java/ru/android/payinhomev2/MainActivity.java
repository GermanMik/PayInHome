package ru.android.payinhomev2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import static ru.android.payinhomev2.FrontScreen.APP_PREFERENCES_THEME;
import static ru.android.payinhomev2.FrontScreen.sharedSettings;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Integer theme;
    ImageButton countersBtn;
    ImageButton payBtn;
    ImageButton chatBtn;
    ImageButton queryBtn;
    ImageButton additBtn;
    ImageButton helpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Получаем через Sharedpref инт с идентификатором темы и устанавливаем ее
        if (FrontScreen.sharedSettings.contains(APP_PREFERENCES_THEME)) {
            theme = sharedSettings.getInt(APP_PREFERENCES_THEME, 1);
        } else {
            theme = sharedSettings.getInt(APP_PREFERENCES_THEME, 1);
        }
        // Если в данных значени 1 то ставим темную тему
        if (theme == 1) {
            setTheme(R.style.DarkTheme);
        } else {
            setTheme(R.style.AppTheme);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countersBtn = findViewById(R.id.counters_button);
        payBtn = findViewById(R.id.pay_button);
        chatBtn = findViewById(R.id.chat_button);
        queryBtn = findViewById(R.id.quotes_button);
        additBtn = findViewById(R.id.addit_button);
        helpBtn = findViewById(R.id.last_button);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //Set OnClicklisteners on ImageButtons
        countersBtn.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CountersData.class);
                startActivity(intent);
            }
        });
        payBtn.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PayType.class);
                startActivity(intent);
            }
        });
        chatBtn.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChatPage.class);
                startActivity(intent);
            }
        });
        queryBtn.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QueryPage.class);
                startActivity(intent);
            }
        });
        additBtn.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdditPage.class);
                startActivity(intent);
            }
        });
        helpBtn.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HelpPage.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_settings) {
        } else if (id == R.id.nav_payment_adress) {
        } else if (id == R.id.nav_counters) {
        } else if (id == R.id.nav_addition) {
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
