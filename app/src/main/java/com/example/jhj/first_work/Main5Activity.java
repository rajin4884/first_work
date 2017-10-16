package com.example.jhj.first_work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {


    RadioGroup Rgroup;
    RadioButton rbtn1, rbtn2, rbtn3, rbtn4, rbtn5, rbtn6;
    Button compbtn;
    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Rgroup = (RadioGroup)findViewById(R.id.Rgroup);
        rbtn1 = (RadioButton)findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton)findViewById(R.id.rbtn2);
        rbtn3 = (RadioButton)findViewById(R.id.rbtn3);
        rbtn4 = (RadioButton)findViewById(R.id.rbtn4);
        rbtn5 = (RadioButton)findViewById(R.id.rbtn5);
        rbtn6 = (RadioButton)findViewById(R.id.rbtn6);

        compbtn = (Button)findViewById(R.id.compbtn);
        imageView1 = (ImageView)findViewById(R.id.imageView1);

        compbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setVisibility(View.VISIBLE);
                switch (Rgroup.getCheckedRadioButtonId()){
                    case R.id.rbtn1:
                        imageView1.setImageResource(R.drawable.tom3);
                        Toast toast =
                                Toast.makeText(getApplicationContext(),
                                        "톰홀랜드를 눌렀습니다.", Toast.LENGTH_SHORT);toast.show();
                        break;
                    case R.id.rbtn2:
                        imageView1.setImageResource(R.drawable.harry);
                        Toast toast1 =
                                Toast.makeText(getApplicationContext(),
                                        "해리스타일스를 눌렀습니다.", Toast.LENGTH_SHORT);toast1.show();
                        break;
                    case R.id.rbtn3:
                        imageView1.setImageResource(R.drawable.pine);
                        Toast toast2 =
                                Toast.makeText(getApplicationContext(),
                                        "크리스파인을 눌렀습니다.", Toast.LENGTH_SHORT);toast2.show();
                        break;
                    case R.id.rbtn4:
                        imageView1.setImageResource(R.drawable.bill);
                        Toast toast4 =
                                Toast.makeText(getApplicationContext(),
                                        "빌스카스가드를 눌렀습니다.", Toast.LENGTH_SHORT);toast4.show();
                        break;
                    case R.id.rbtn5:
                        imageView1.setImageResource(R.drawable.jack);
                        Toast toast5 =
                                Toast.makeText(getApplicationContext(),
                                        "잭로우든을 눌렀습니다.", Toast.LENGTH_SHORT);toast5.show();
                        break;
                    case R.id.rbtn6:
                        imageView1.setImageResource(R.drawable.ezra);
                        Toast toast6 =
                                Toast.makeText(getApplicationContext(),
                                        "에즈라밀러를 눌렀습니다.", Toast.LENGTH_SHORT);toast6.show();
                        break;
                }
            }
        });

    }



    public void Two(View vi){
        Intent i = new Intent(this , Main2Activity.class);
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

