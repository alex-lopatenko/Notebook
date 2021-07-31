package com.example.notebookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private myDbManager myDbManager;
    private EditText edTitle, edDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDbManager = new myDbManager(this);
        edTitle = findViewById(R.id.edTitle);
        edDesc = findViewById(R.id.edDesc);
    }

    @Override
    protected  void  onResume() {
        super.onResume();
        myDbManager.openDb();
    }

    public void onClickSave(View view){
        myDbManager.insertToDb(edTitle.getTitle.getText().toString(), edDisc.getText().toString());
    }
}