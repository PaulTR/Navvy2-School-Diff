package e.zeyramedina.savvynav2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import static e.zeyramedina.savvynav2.SecondActivity.*;

public class SavvyNav2 extends AppCompatActivity {

    private TextView mTextMessage;

    private android.content.Intent sc;
    private OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            return false;
        }

        public void buttonClick(View view) {


            Intent startnewactivity = new Intent(SecondActivity.LAUNCHER_APPS_SERVICE);
        }


    };


    public void Screen2(View view) {
    }}