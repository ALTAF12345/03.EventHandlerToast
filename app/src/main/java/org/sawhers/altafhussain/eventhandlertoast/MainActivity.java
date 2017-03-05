package org.sawhers.altafhussain.eventhandlertoast;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout mylinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mylinearLayout = (LinearLayout) findViewById(R.id.main_layout);
    }


//    public void btn_RedClick(View view){
//        Toast.makeText(MainActivity.this,"Red",Toast.LENGTH_SHORT).show();
//        //mylinearLayout.setBackgroundColor(Color.RED);
//       // mylinearLayout.setBackgroundResource(R.drawable.a);
//
//    }
//
//
//    public void btn_GreenClick(View view){
//        Toast.makeText(MainActivity.this,"Green",Toast.LENGTH_SHORT).show();
//        //mylinearLayout.setBackgroundColor(Color.GREEN);
//
//        mylinearLayout.setBackgroundResource(R.drawable.b);
//
//
//    }
//
//
//    public void btn_BlueClick(View view){
//        Toast.makeText(MainActivity.this,"Blue",Toast.LENGTH_SHORT).show();
//       // mylinearLayout.setBackgroundColor(Color.BLUE);
//        mylinearLayout.setBackgroundResource(R.drawable.c);
//    }
//
//
//
//    public void bnt_ExitClick(View view){
//        Toast.makeText(MainActivity.this,"Exit",Toast.LENGTH_SHORT).show();
//        mylinearLayout.setBackgroundColor(Color.WHITE);
//    }
    //now we need to write for every button onclick these increse our triubel
    // now we write one methed and thats don our work  For this we need to Give
    // the same name with button onclick


//        public void btnClick(View view){
//            //when we press the green btn etc from xml these come to view
//
//            if (view.getId()==R.id.btn_Red){
//                mylinearLayout.setBackgroundColor(Color.RED);
//            }
//            if (view.getId()==R.id.btn_blue){
//                mylinearLayout.setBackgroundColor(Color.BLUE);
//            }
//            if (view.getId()==R.id.btn_green){
//                mylinearLayout.setBackgroundColor(Color.GREEN);
//            }
//            if (view.getId()==R.id.btn_exit){
//                mylinearLayout.setBackgroundColor(Color.WHITE);
//
//            }
//        }


    //now we need to prorperly apply the if esle setements

    public void btnClick(View view) {

//
//        if (view.getId() == R.id.btn_Red) {
//            mylinearLayout.setBackgroundColor(Color.RED);
//        } else if (view.getId() == R.id.btn_green) {
//            mylinearLayout.setBackgroundColor(Color.GREEN);
//        } else if (view.getId() == R.id.btn_blue) {
//            mylinearLayout.setBackgroundColor(Color.BLUE);
//        } else if (view.getId() == R.id.btn_exit) {
//            mylinearLayout.setBackgroundColor(Color.WHITE);
//        }
//       // now we need to apply Switch statements

        switch (view.getId()){
            case R.id.btn_Red:
                mylinearLayout.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this,"Green",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_green:
                mylinearLayout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.btn_blue:
                mylinearLayout.setBackgroundColor(Color.BLUE);

                break;
            case R.id.btn_exit:
                mylinearLayout.setBackgroundColor(Color.WHITE);
                break;
                     }

               }
            }





