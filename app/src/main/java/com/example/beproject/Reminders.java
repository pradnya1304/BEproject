package com.example.beproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Reminders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminders);
    }

    public void OpenReminder(View v)
    {
        if (v.getId()==R.id.button_AddMealsReminder)
        {

        }
        else if(v.getId()==R.id.button_AddHydrationReminder)
        {

        }



    }


}
