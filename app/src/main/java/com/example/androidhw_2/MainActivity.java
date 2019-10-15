package com.example.androidhw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText h;
    EditText w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h=(EditText)findViewById(R.id.high);
        w=(EditText)findViewById(R.id.weight);
        Button submit=(Button)findViewById(R.id.submit);

        submit.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View arg0){
                if(!("".equals(h.getText().toString()) ||
                        "".equals(w.getText().toString()))){
                    double fh =Float.parseFloat(h.getEditableText().toString());
                    float fw=Float.parseFloat(w.getEditableText().toString());
                    float fresult;
                    TextView result=(TextView)findViewById((R.id.result));
                    fh=fh/100;
                    fh=Math.pow(fh,2);


                }
            }

        });
    }

}
