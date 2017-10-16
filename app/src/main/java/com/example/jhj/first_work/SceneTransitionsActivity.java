package com.example.jhj.first_work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Scene;

import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class SceneTransitionsActivity extends AppCompatActivity {

    ViewGroup rootContainer;
    Scene scene1;
    Scene scene2;
    Scene scene3;
    Scene scene4;
    Scene scene5;
    Scene scene6;
    Scene scene7;
    Scene scene8;
    Scene scene;
    Transition transitionMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_transitions);


        rootContainer =
                (ViewGroup) findViewById(R.id.rootContainer);

        transitionMgr = TransitionInflater.from(this)
                .inflateTransition(R.transition.transition);

        scene1 = Scene.getSceneForLayout(rootContainer,
                R.layout.scene1_layout, this);

        scene2 = Scene.getSceneForLayout(rootContainer,
                R.layout.scene2_layout, this);

        scene3 = Scene.getSceneForLayout(rootContainer,
                R.layout.scene3_layout, this);

        scene4 = Scene.getSceneForLayout(rootContainer,
                R.layout.scene4_layout, this);

        scene5 = Scene.getSceneForLayout(rootContainer,
                R.layout.scene5_layout, this);

        scene6 = Scene.getSceneForLayout(rootContainer,
                R.layout.scene6_layout, this);

        scene7 = Scene.getSceneForLayout(rootContainer,
                R.layout.scene7_layout, this);

        scene8 = Scene.getSceneForLayout(rootContainer,
                R.layout.scene8_layout, this);

        scene = Scene.getSceneForLayout(rootContainer,
                R.layout.scene_layout, this);

        scene.enter();

    }

    public void goToScene2 (View view)
    {
        TransitionManager.go(scene2, transitionMgr);

    }

    public void goToScene1 (View view)
    {
        TransitionManager.go(scene1, transitionMgr);
    }

    public void goToScene3 (View view)
    {
        TransitionManager.go(scene3, transitionMgr);

    }

    public void goToScene4 (View view)
    {
        TransitionManager.go(scene4, transitionMgr);

    }

    public void goToScene5 (View view)
    {
        TransitionManager.go(scene5, transitionMgr);
    }

    public void goToScene6 (View view)
    {
        TransitionManager.go(scene6, transitionMgr);

    }

    public void goToScene (View view)
    {
        TransitionManager.go(scene, transitionMgr);

    }

    public void goToScene7 (View view)
    {
        TransitionManager.go(scene7, transitionMgr);

    }

    public void goToScene8 (View view)
    {
        TransitionManager.go(scene8, transitionMgr);

    }

    public void Six(View vi){
        Intent i = new Intent(this , FragmentExampleActivity.class);
        startActivity(i);
    }

}