package com.example.jhj.first_work;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Button;
import android.support.v4.app.FragmentTransaction;
import android.view.View;



public class FragmentExampleActivity extends FragmentActivity
        implements ToolbarFragment.ToolbarListener,View.OnClickListener {

    private final int FRAGMENT1 = 1;
    private final int FRAGMENT2 = 2;

    private Button bt_tab1, bt_tab2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_example);

        bt_tab1 = (Button)findViewById(R.id.bt_tab1);
        bt_tab2 = (Button)findViewById(R.id.bt_tab2);


        bt_tab1.setOnClickListener(this);
        bt_tab2.setOnClickListener(this);

        // 임의로 액티비티 호출 시점에 어느 프레그먼트를 프레임레이아웃에 띄울 것인지를 정함
        callFragment(FRAGMENT1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_tab1 :
                // 버튼 클릭시 프래그먼트1호출

                callFragment(FRAGMENT1);
                break;

            case R.id.bt_tab2 :
                // 버튼 클릭시 프래그먼트2 호출
                callFragment(FRAGMENT2);
                break;
        }
    }

    private void callFragment(int frament_no){

        // 프래그먼트 사용하기 위해
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (frament_no){
            case 1:
                // 프래그1 호출
                Fragment1 fragment1 = new Fragment1();
                transaction.replace(R.id.fragment_container, fragment1);
                transaction.commit();
                break;

            case 2:
                // 프래그2 호출
                Fragment2 fragment2 = new Fragment2();
                transaction.replace(R.id.fragment_container, fragment2);
                transaction.commit();
                break;
        }}

    public void onButtonClick(int fontsize, String text) {
        TextFragment textFragment =
                (TextFragment)
                        getSupportFragmentManager().findFragmentById(R.id.text_fragment);
        textFragment.changeTextProperties(fontsize, text);


    }
}