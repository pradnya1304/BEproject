package com.example.beproject.ui.Reminder;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReminderViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReminderViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Reminder fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}