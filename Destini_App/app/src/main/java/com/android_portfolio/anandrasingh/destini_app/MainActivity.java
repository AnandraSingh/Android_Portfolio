package com.android_portfolio.anandrasingh.destini_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


      private TextView mStoryTextview;
      private Button mButtonTop;
      private Button mButtonBottom;
      private int mStoryIndex=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mStoryTextview =  findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom =findViewById(R.id.buttonBottom);


        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mStoryIndex==1) {
                    mStoryTextview.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                }
                else if (mStoryIndex==3)
                {
                   mStoryTextview.setText(R.string.T6_End);
                   mButtonTop.setVisibility(View.GONE);
                   mButtonBottom.setVisibility(View.GONE);
                }
                else if (mStoryIndex==2)
                {
                    mStoryTextview.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                }

            }
        });



        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mStoryIndex==1) {
                    mStoryTextview.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
                else if (mStoryIndex==2)
                {
                    mStoryTextview.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);

                }
                else if(mStoryIndex==3)
                {
                    mStoryTextview.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }


            }
        });


    }
}
