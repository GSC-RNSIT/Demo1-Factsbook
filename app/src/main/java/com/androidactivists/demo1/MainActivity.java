package com.androidactivists.demo1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{



    private Button outputButton;
    private TextView outputField;
    private EditText inputField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputButton = (Button) findViewById(R.id.outputButton);
        inputField = (EditText) findViewById(R.id.inputField);
        outputField = (TextView) findViewById(R.id.outputField);

        outputButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        if(v== outputButton){
            String input = inputField.getText().toString();
            outputField.setText("You just said "+ input);
        }


    }
}
