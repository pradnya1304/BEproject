package com.example.beproject.ui.BMICalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.beproject.databinding.FragmentBmicalculatorBinding;

public class BMICalculatorFragment extends Fragment {

    private BMICalculatorViewModel BMICalculatorViewModel;
private FragmentBmicalculatorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        BMICalculatorViewModel =
                new ViewModelProvider(this).get(BMICalculatorViewModel.class);

    binding = FragmentBmicalculatorBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        BMICalculatorViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}