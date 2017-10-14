package com.example.jhj.first_work;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.SystemClock;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TableRow;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity{

    TextView tv3;
    TableRow tb1, tb2;
    LinearLayout rsli;
    Chronometer chro;
    Button naver, daum, google, hywm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        final CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox3);
        final CheckBox cb2 = (CheckBox)findViewById(R.id.checkBox4);
        final CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox5);
        final CheckBox cb4 = (CheckBox)findViewById(R.id.checkBox6);
        final CheckBox cb5 = (CheckBox)findViewById(R.id.checkBox7);
        final CheckBox cb6 = (CheckBox)findViewById(R.id.checkBox8);
        final CheckBox cb7 = (CheckBox)findViewById(R.id.checkBox9);
        final CheckBox cb8 = (CheckBox)findViewById(R.id.checkBox10);
        final TextView tv3 = (TextView)findViewById(R.id.tv3);
        final TableRow tb1 = (TableRow) findViewById(R.id.tb1);
        final TableRow tb2 = (TableRow) findViewById(R.id.tb2);
        Button startbtn = (Button)findViewById(R.id.startbtn);
        final Button selectbtn = (Button)findViewById(R.id.selectbtn);
        final TextView rs = (TextView)findViewById(R.id.rstv);
        final LinearLayout rsli = (LinearLayout)findViewById(R.id.rsli);
        chro = (Chronometer) findViewById(R.id.chro);
        Button stopbtn = (Button)findViewById(R.id.stopbtn);
        final MediaPlayer mp = MediaPlayer.create(getBaseContext(),R.raw.conan);
        final RatingBar rating = (RatingBar)findViewById(R.id.rating);
        final Button ratbtn = (Button)findViewById(R.id.ratbtn);
        final TextView ratv = (TextView)findViewById(R.id.ratv);
        naver = (Button)findViewById(R.id.naver);
        google = (Button)findViewById(R.id.google);
        hywm = (Button)findViewById(R.id.hywm);


        naver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.google.com"));
                startActivity(intent);
            }
        });

        hywm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://hywoman.ac.kr"));
                startActivity(intent);
            }
        });




        ratbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating.setVisibility(View.VISIBLE);
                ratv.setVisibility(View.VISIBLE);
            }
        });

        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            }


        });

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();
                mp.setLooping(true);



                chro.setBase(SystemClock.elapsedRealtime());
                chro.start();
                chro.setTextColor(Color.RED);

                tv3.setVisibility(View.VISIBLE);
                tb1.setVisibility(View.VISIBLE);
                tb2.setVisibility(View.VISIBLE);
                rsli.setVisibility(View.VISIBLE);
                chro.setVisibility(View.VISIBLE);
                ratbtn.setVisibility(View.VISIBLE);
            }
        });

        stopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                chro.stop();
                chro.setTextColor(Color.BLUE);

                tv3.setVisibility(View.INVISIBLE);
                tb1.setVisibility(View.INVISIBLE);
                tb2.setVisibility(View.INVISIBLE);
                rsli.setVisibility(View.INVISIBLE);
                chro.setVisibility(View.INVISIBLE);
                ratbtn.setVisibility(View.INVISIBLE);
                rating.setVisibility(View.INVISIBLE);
                ratv.setVisibility(View.INVISIBLE);

            }
        });

        selectbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                chro.stop();
                chro.setTextColor(Color.BLUE);


                String result = "";  // 결과를 출력할 문자열  ,  항상 스트링은 빈문자열로 초기화 하는 습관을 가지자
                if(cb1.isChecked() == true) result += cb1.getText().toString();
                if(cb2.isChecked() == true) result += cb2.getText().toString();
                if(cb3.isChecked() == true) result += cb3.getText().toString();
                if(cb4.isChecked() == true) result += cb4.getText().toString();
                if(cb5.isChecked() == true) result += cb5.getText().toString();
                if(cb6.isChecked() == true) result += cb6.getText().toString();
                if(cb7.isChecked() == true) result += cb7.getText().toString();
                if(cb8.isChecked() == true) result += cb8.getText().toString();
                rs.setText(" "+ result);
            }
        });

    }
    public void One(View vi){
        Intent i = new Intent(this , Main5Activity.class);
        startActivity(i);
    }


    public void Thr(View vi){
        Intent i = new Intent(this , Main3Activity.class);
        startActivity(i);
    }

    public void Fou(View vi){
        Intent i = new Intent(this , Main4Activity.class);
        startActivity(i);
    }

    public void Six(View vi){
        Intent i = new Intent(this , FragmentExampleActivity.class);
        startActivity(i);
    }
}

