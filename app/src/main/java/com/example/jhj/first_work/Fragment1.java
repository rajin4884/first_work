package com.example.jhj.first_work;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    public Fragment1() {
        // Required empty public constructor

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
