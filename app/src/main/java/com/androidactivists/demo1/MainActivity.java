package com.androidactivists.demo1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button outputButton;
    private EditText inputTextView;
    private TextView outputTextView;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);

                 outputButton= (Button) findViewById(R.id.outputButon);
                 inputTextView = (EditText) findViewById(R.id.inputTextView);
                 inputTextView.setGravity(Gravity.CENTER);
                 outputTextView = (TextView)findViewById(R.id.outputTextView);
                 outputTextView.setGravity(Gravity.CENTER);

    outputButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s = inputTextView.getText().toString();
                if(v== outputButton){
                    if(s.length()==0)
                    {
                        toastIt();
                    }
                    else if(s.length()!=0)
                    {
                        outputTextView.setText("You said "+s);
                    }
                }

        }
    });}






    private void toastIt() {
        Toast.makeText(this,"You haven't entered anything !!!",Toast.LENGTH_SHORT).show();
    }
}