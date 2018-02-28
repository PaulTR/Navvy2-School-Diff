package e.zeyramedina.savvynav2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SavvyNav2 extends AppCompatActivity {

    private TextView mTextMessage;

    private OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            return false;
        }

    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savvy_nav2);
    }

    public void buttonClick(View view) {
        Intent startnewactivity = new Intent(this, SecondActivity.class);
        startActivity(startnewactivity);
    }


    public void Screen2(View view) {
    }}