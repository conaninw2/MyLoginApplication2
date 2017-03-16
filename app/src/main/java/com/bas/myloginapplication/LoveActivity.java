package com.bas.myloginapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoveActivity extends AppCompatActivity {

    private LinearLayout llLove;
    private TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        llLove = (LinearLayout) findViewById(R.id.llLove);
        tvresult = (TextView) findViewById(R.id.tvresult);

        llLove.setOnClickListener(OnClickLoveListener);
    }


    private View.OnClickListener OnClickLoveListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvresult.setText("ซวยโครต โครต");
        }
    };

}
