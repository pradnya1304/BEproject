package com.example.beproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
            startActivity(new Intent(Reminders.this,AddMealsReminder.class));
        }
        else if(v.getId()==R.id.button_AddHydrationReminder)
        {
            startActivity(new Intent(Reminders.this,AddHydrationReminder.class));
        }



    }


}
