package com.example.repasointeraccion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private Button btn_yellow1,btn_yellow2,btn_orange1,btn_orange2,btn_pink;
 private TextView tv_blue1,tv_blue2,tv_green1,tv_green2,tv_red1,tv_red2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_yellow1=findViewById(R.id.btn_yellow1);
        btn_yellow2=findViewById(R.id.btn_yellow2);
        btn_orange1=findViewById(R.id.btn_orange1);
        btn_orange2=findViewById(R.id.btn_orange2);
        btn_pink=findViewById(R.id.btn_pink);

        tv_blue1=findViewById(R.id.tv_blue1);
        tv_blue2= findViewById(R.id.tv_blue2);
        tv_green1=findViewById(R.id.tv_green1);
        tv_green2=findViewById(R.id.tv_green2);
        tv_red1= findViewById(R.id.tv_red1);
        tv_red2=findViewById(R.id.tv_red2);

        etiquetar(btn_yellow1,"yellow");
        etiquetar(btn_yellow2,"yellow");
        etiquetar(btn_orange1,"orange");
        etiquetar(btn_orange2,"orange");
        etiquetar(btn_pink,"pink");

        etiquetar(tv_blue1,"blue");
        etiquetar(tv_blue2,"blue");
        etiquetar(tv_green1,"green");
        etiquetar(tv_green2,"green");
        etiquetar(tv_red1,"red");
        etiquetar(tv_red2,"red");
    }

    public void etiquetar(Button circle,String color){
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle.setText(color);
                circle.setTextColor(Color.BLACK);
                circle.setTextSize(14);
            }
        });
    }
    public void etiquetar(TextView circle,String color){
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle.setText(color);
                circle.setTextColor(Color.BLACK);
                circle.setTextSize(14);
            }
        });
    }

}