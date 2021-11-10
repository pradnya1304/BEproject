package com.example.beproject.ui.BMICalculator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BMICalculatorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BMICalculatorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}