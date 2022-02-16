package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button button,button2;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textId);
        button = (Button) findViewById(R.id.btnId);
        editText = (EditText) findViewById(R.id.edtId);
        button2 = (Button) findViewById(R.id.btn2) ;

        button.setOnClickListener(this);
        button2.setOnClickListener(this);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name = editText.getText().toString();
//                textView.setText(name);
//                Toast toast = Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG);
//                toast.setGravity(Gravity.TOP,0,0);
//                toast.show();
//            }
//        });
//


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnId:
                String name = editText.getText().toString();
                textView.setText(name);
                Toast toast = Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP,0,0);
                toast.show();
                break;
            case  R.id.btn2:
                textView.setText("Hello World");

        }

//        if(view.getId() == R.id.btnId){
//            String name = editText.getText().toString();
//            textView.setText(name);
//            Toast toast = Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG);
//            toast.setGravity(Gravity.TOP,0,0);
//            toast.show();
//        }


    }
}