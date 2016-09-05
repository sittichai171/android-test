package com.aimboy.testopenlink;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView2,textView3;
    String check = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);

        //textView.setOnTouchListener();
        button.setOnClickListener(new OnClickListenner());
        button2.setOnClickListener(new OnClickListenner());

        question2();

    }
    protected void openLink(View v){
        //String getStr = editText.getText().toString();
        //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/#q="+getStr)));
    }

    private class OnClickListenner implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            int getID = v.getId();
            Log.i("LOGTAG",">> Actions >> ");
            if(v.equals(textView2)){

            }else if (v.equals(textView3)){

            }



        }
    }
    public void submit(){
        textView2.setOnClickListener(new OnClickListenner());
        textView3.setOnClickListener(new OnClickListenner());

    }
    public void question1(){

        textView2.setText("Cat");
        textView3.setText("Dog");
        submit();

    }
    public void question2(){

        textView2.setText("Yellow");
        textView3.setText("Red");
        //check = "textView2";
        submit();

    }
}
