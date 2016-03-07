package com.example.jacob.startactivityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity {
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText=(EditText)findViewById(R.id.editText);
    }
    public void showResult (View view){
        Intent intent=new Intent();
        intent.putExtra("message",editText.getText().toString());
        setResult(2,intent);
        finish();
    }
}
