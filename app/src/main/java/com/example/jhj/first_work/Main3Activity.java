package com.example.jhj.first_work;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener, TimePicker.OnTimeChangedListener {

    Calendar c;
    DatePicker datep;
    TimePicker timep;
    Button dpoutput;
    TextView dptv;
    TextView tmtv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //탭 설정
        TabHost tabho = (TabHost)findViewById(R.id.tabh);
        tabho.setup();

        TabHost.TabSpec tab1 = tabho.newTabSpec("1").setContent(R.id.tab1).setIndicator("TimePicker");
        TabHost.TabSpec tab2 = tabho.newTabSpec("2").setContent(R.id.tab2).setIndicator("DatePicker");

        tabho.addTab(tab1);
        tabho.addTab(tab2);

        //날짜설정
        timep = (TimePicker)findViewById(R.id.timePicker);
        datep = (DatePicker) findViewById(R.id.datePicker);
        dptv = (TextView)findViewById(R.id.dptv);
        dpoutput = (Button)findViewById(R.id.dpoutput);
        tmtv = (TextView)findViewById(R.id.tmtv);

        c = Calendar.getInstance();
        int year = c.get(c.YEAR);
        int month = c.get(c.MONTH);
        int dayOfMonth = c.get(c.DAY_OF_MONTH);
        int hourOfDay =  c.get(c.HOUR_OF_DAY);
        int minute = c.get(c.MINUTE);


        dptv.setText("설정 날짜 : \n"+ year + "/" + (month+1)+"/"+dayOfMonth);
        dpoutput.setOnClickListener(this);

        tmtv.setText("\n설정 시간 : \n"+hourOfDay + ":" + minute);
        timep.setOnTimeChangedListener(this);



    }

    public void One(View vi){
        Intent i = new Intent(this , Main5Activity.class);
        startActivity(i);
    }

    public void Two(View vi){
        Intent i = new Intent(this , Main2Activity.class);
        startActivity(i);
    }


    public void Fou(View vi){
        Intent i = new Intent(this , Main4Activity.class);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        dptv.setText("선택된 날짜: \n");
        dptv.setText(dptv.getText() + " " + datep.getYear() + "/" +
                (datep.getMonth()+1)+"/"+datep.getDayOfMonth());


    }

    @Override
    public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
        tmtv.setText("\n현재 설정된 시각: \n" + hourOfDay +":"+minute);
    }
}
