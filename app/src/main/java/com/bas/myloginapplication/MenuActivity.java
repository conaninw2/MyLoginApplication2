package com.bas.myloginapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    private ImageButton imgBtnProfile;
    private ImageButton imgBtnLove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        imgBtnProfile = (ImageButton) findViewById(R.id.imgBtnProfile);
        imgBtnLove = (ImageButton) findViewById(R.id.imgBtnLove);


        imgBtnProfile.setOnClickListener(OnClickSumitListener);
        imgBtnLove.setOnClickListener(OnClickSumitLoveListener);
    }

    private View.OnClickListener OnClickSumitListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent in = new Intent(getApplicationContext(), DetailActivity.class); // เป็นการขึ้นหน้า แล้วส่งไปยัง DetailActivity

            startActivity(in);
        }

    };
    private View.OnClickListener OnClickSumitLoveListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent in = new Intent(getApplicationContext(), LoveActivity.class); // เป็นการขึ้นหน้า แล้วส่งไปยัง DetailActivity

            startActivity(in);
        }
    };
}