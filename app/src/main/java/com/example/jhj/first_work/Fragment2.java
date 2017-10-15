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
public class Fragment2 extends Fragment {

    Intent intent;

    public Fragment2() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_fragment2, container, false);

        View rootView = inflater.inflate(R.layout.fragment_fragment2, container, false);

        intent = new Intent(getActivity(), SceneTransitionsActivity.class);
        final Button button = (Button) rootView.findViewById(R.id.btn4);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        return rootView;
    }



}
