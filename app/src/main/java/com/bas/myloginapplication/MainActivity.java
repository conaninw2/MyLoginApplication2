package com.bas.myloginapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnButton = (Button) findViewById(R.id.btnLogin);


        btnButton.setOnClickListener(onClickListener);
    }
    private View.OnClickListener  onClickListener = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),MenuActivity.class);  //ขึ้นหน้าใหม่หรือการส่งไปอีกหน้า DetailActivity คือ หน้าที่ต้อิงดารส่ง
        startActivity(intent);  //เป็นการส่งค่าระหว่าง Activity โดยหารใช้ Intent
    }
};

}
