package com.example.jhj.first_work;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends Fragment {


    public Fragment1() {

    }

    Intent intent;
    Intent intent1;
    Intent intent2;
    Intent intent3;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_fragment1, container, false);

        //뷰 컨테이너(View Container)는 다른 View들을 포함하고 있거나 포함할 수 있는 View를 말하며,
        // 일반적으로 ViewGroup을 상속하면서 Layout이 아닌 클래스를 지칭한다

        //inflate: xml 에 씌여져 있는 view 의 정의를 실제 view 객체로 만드는 역할
        //inflater는 xml로 정의된 view (또는 menu 등)를 실제 객체화 시키는 용도입니다.
        View rootView = inflater.inflate(R.layout.fragment_fragment1, container, false);
//-------------------------------------------------------------------------------
        intent = new Intent(getActivity(), Main2Activity.class);
        final Button button = (Button) rootView.findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });
//-------------------------------------------------------------------------------

        intent1 = new Intent(getActivity(), Main5Activity.class);
        final Button button1 = (Button) rootView.findViewById(R.id.btn1);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent1);
            }
        });
//-------------------------------------------------------------------------------

        intent2 = new Intent(getActivity(), Main3Activity.class);
        final Button button2 = (Button) rootView.findViewById(R.id.btn2);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
//-------------------------------------------------------------------------------
        intent3 = new Intent(getActivity(), Main4Activity.class);
        final Button button3 = (Button) rootView.findViewById(R.id.btn3);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent3);
            }
        });



        return rootView;
    }

}
