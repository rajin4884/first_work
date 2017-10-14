package com.example.jhj.first_work;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    //이미지 보이기, 숨기기
    ImageView tom,tomm;
    Button show,hide,dia;
    TextView textView8;

    //이미지 클릭시 변경
    int [] ImageId = {R.drawable.tom, R.drawable.tomm};
    ImageView iv;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tom = (ImageView)findViewById(R.id.imageView1);
        show = (Button)findViewById(R.id.showbtn);
        hide = (Button)findViewById(R.id.hidebtn);
        dia = (Button)findViewById(R.id.dialog);
        textView8 = (TextView)findViewById(R.id.textView8);


        //보이기
        show.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                tom.setVisibility(View.VISIBLE);
                dia.setVisibility(View.VISIBLE);
                textView8.setVisibility(View.VISIBLE);
                hide.setVisibility(View.VISIBLE);
                show.setVisibility(View.INVISIBLE);
            }
        });

        //숨기기
        hide.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                tom.setVisibility(View.INVISIBLE);
                dia.setVisibility(View.INVISIBLE);
                textView8.setVisibility(View.INVISIBLE);
                show.setVisibility(View.VISIBLE);
                hide.setVisibility(View.INVISIBLE);

            }
        });

        //다이얼로그
        Button dialog = (Button)findViewById(R.id.dialog);
        dialog.setOnClickListener(this);

        iv = (ImageView)findViewById(R.id.imageView1);

        iv.setImageResource(R.drawable.tom);

        iv.setOnClickListener(new MyListener());
    }


    //1페이지, 2페이지, 3페이지, 4페이지
    public void One(View vi){
        Intent i = new Intent(this , Main5Activity.class);
        startActivity(i);
    }

    public void Two(View vi){
        Intent i = new Intent(this , Main2Activity.class);
        startActivity(i);
    }

    public void Thr(View vi){
        Intent i = new Intent(this , Main3Activity.class);
        startActivity(i);
    }
    public void Six(View vi){
        Intent i = new Intent(this , FragmentExampleActivity.class);
        startActivity(i);
    }





    //다이얼로그
    @Override
    public void onClick(View v) {
        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setTitle("정현진 정보");
        ad.setMessage("한양여자대학교 \n정보경영과 2-C \n학번 216230111\n좋아하는 것: 자는 것");
        ad.setNegativeButton("그만보기",null);
        ad.setCancelable(false);
        ad.show();
    }

    //이미지 클릭시 변경
    private class MyListener implements View.OnClickListener {

        int i = 0;
        int length = ImageId.length;

        @Override
        public void onClick(View v) {
            iv.setImageResource(ImageId[i]);

            i +=1;
            if(i == ImageId.length) i = 0;
        }
    }
}
