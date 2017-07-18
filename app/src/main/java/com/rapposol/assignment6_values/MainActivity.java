package com.rapposol.assignment6_values;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitClicked(View v)
    {
        EditText ed = (EditText)findViewById(R.id.edtxt);
        TextView txt = (TextView)findViewById(R.id.textView);

        txt.setText(ed.getText().toString());
    }
}

