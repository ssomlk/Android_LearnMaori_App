package com.example.shank.learnmaoriuiux;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private CardView numbers;
    private CardView family;
    private CardView colors;
    private Intent intentNumbers;
    private Intent intentFamily;
    private Intent intentColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Build.VERSION.SDK_INT >= 21){
            TransitionInflater inflater = TransitionInflater.from(this);
            Transition transition = inflater.inflateTransition(R.transition.transition_main);
            getWindow().setExitTransition(transition);
        }

        setContentView(R.layout.activity_main);

        ImageView numberMain = (ImageView) findViewById(R.id.imgnumbermain);
        ImageView colorMain = (ImageView) findViewById(R.id.imgcolormain);
        ImageView familyMain = (ImageView) findViewById(R.id.imgfamilymain);

        final Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate_image);

       numberMain.setAnimation(rotate);
       colorMain.setAnimation(rotate);
       familyMain.setAnimation(rotate);

        initializeCardViews();
        setCardViewClickActivities();
    }

    private void initializeCardViews(){
        this.numbers = findViewById(R.id.numbersCardId);
        this.family =  findViewById(R.id.familyCardId);
        this.colors = findViewById(R.id.colorsCardId);
    }

    private void setCardViewClickActivities(){

        this.numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(intentNumbers == null){
                    intentNumbers = new Intent(view.getContext(),NumbersActivity.class);
                }
                ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) view.getContext(), null);
                startActivity(intentNumbers, compat.toBundle());
            }
        });

        this.family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(intentFamily == null){
                    intentFamily = new Intent(view.getContext(),FamilyActivity.class);
                }
                ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) view.getContext(), null);
                startActivity(intentFamily,compat.toBundle());
            }
        });

        this.colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(intentColors == null){
                    intentColors = new Intent(view.getContext(),ColorsActivity.class);
                }
                ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) view.getContext(), null);
                startActivity(intentColors, compat.toBundle());
            }
        });
    }
}
