package com.example.johann.glosser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    Button testButton, createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testButton = (Button) findViewById(R.id.test_button);
        createButton = (Button) findViewById(R.id.create_button);
    }


   public void startQuiz(View view) {
       Intent intent = new Intent(this, StartQuizActivity.class);
        startActivity(intent);

   }

    public void createQuiz(View view) {
        Intent intent = new Intent(this, CreateQuizAcivity.class);
        startActivity(intent);

    }
}
