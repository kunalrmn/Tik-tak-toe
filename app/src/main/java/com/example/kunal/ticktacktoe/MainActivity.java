package com.example.kunal.ticktacktoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
    {
        int state[]={2,2,2,2,2,2,2,2,2};

        int count=0;
        int a=1;
        int i=0;
        int k=0;
        //TextView textView = (TextView) findViewById(R.id.textView2);
       // TextView textView1 = (TextView) findViewById(R.id.textView);
        public void imageTapped(View view) {
            count++;
            k=0;
            ImageView mytapped = (ImageView) view;
            int imagestate = Integer.parseInt(mytapped.getTag().toString());

            if (state[imagestate] == 2) {
                state[imagestate] = a;

                if (a == 1) {
                    ImageView imageView = (ImageView) view;
                    imageView.setImageResource(R.drawable.cross1);
                    //imageView.animate().rotation(360).setDuration(1000);
                    a = 0;


                } else {

                    ImageView imageView = (ImageView) view;
                    imageView.setImageResource(R.drawable.circle2);
                    //imageView.animate().rotation(360).setDuration(1000);
                    a = 1;
                }

               if(state[0]==state[1] && state[1]==state[2] && state[0]!=2){

                        k=1;
                    }
                else if(state[3]==state[4] && state[4]==state[5] && state[3]!=2){
                 k=1;
                }
               else if(state[6]==state[7] && state[8]==state[6] && state[6]!=2){
                   k=1;
               }
               else if(state[0]==state[4] && state[8]==state[0] && state[0]!=2){
                   k=1;

               }
               else if(state[1]==state[4] && state[4]==state[7] && state[1]!=2){
                   k=1;

               }
               else if(state[2]==state[4] && state[4]==state[6] && state[2]!=2){
                   k=1;

               }
               else if(state[0]==state[3] && state[3]==state[6] && state[0]!=2){
                   k=1;

               }
               else if(state[2]==state[5] && state[5]==state[8] && state[2]!=2){
                   k=1;

               }
                if( a==1 && k==1)
                   // Log.i("Result","player 2 win");
                {
                    TextView textView = (TextView) findViewById(R.id.textView2);
                    textView.setVisibility(view.VISIBLE);
                    for(i=0;i<state.length;i++)
                    {
                        state[i]=3;
                    }

                }
                else if(a==0 && k==1)
                    //Log.i("Result","player 1 win");
                {
                    TextView textView1 = (TextView) findViewById(R.id.textView);
                    textView1.setVisibility(view.VISIBLE);
                    for(i=0;i<state.length;i++)
                    {
                        state[i]=3;
                    }
                }
                if(count==9)
                {
                    TextView textView5 = (TextView) findViewById(R.id.textView3);
                    textView5.setVisibility(view.VISIBLE);
                }

            }
        }

                public void playAgain(View view){
                for(i=0;i<state.length;i++)
                     {
                         state[i]=2;
                     }

                 a=1;

                LinearLayout linearLayoutone= (LinearLayout)findViewById(R.id.linear1);
                int child=linearLayoutone.getChildCount();
                 for(i=0;i<child;i++)
                 {
                     ImageView imagechild= (ImageView)linearLayoutone.getChildAt(i);
                     imagechild.setImageResource(R.drawable.blank1);
                     //imagechild.animate().rotation(360).setDuration(1000);
                 }

                    LinearLayout linearLayout2= (LinearLayout)findViewById(R.id.linear2);
                    int child1=linearLayout2.getChildCount();
                    for(i=0;i<child1;i++)
                    {
                        ImageView imagechild1= (ImageView)linearLayout2.getChildAt(i);
                        imagechild1.setImageResource(R.drawable.blank1);
                        //imagechild1.animate().rotation(360).setDuration(1000);
                    }

                    LinearLayout linearLayout3= (LinearLayout)findViewById(R.id.linear3);
                    int child2=linearLayout3.getChildCount();
                    for(i=0;i<child2;i++)
                    {
                        ImageView imagechild2= (ImageView)linearLayout3.getChildAt(i);
                        imagechild2.setImageResource(R.drawable.blank1);
                        //imagechild2.animate().rotation(360).setDuration(1000);
                    }
                    TextView textView2 = (TextView) findViewById(R.id.textView2);
                    textView2.setVisibility(view.INVISIBLE);
                    TextView textView3 = (TextView) findViewById(R.id.textView);
                    textView3.setVisibility(view.INVISIBLE);
                    TextView textView4 = (TextView) findViewById(R.id.textView3);
                    textView4.setVisibility(view.INVISIBLE);

            }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
