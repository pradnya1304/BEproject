package com.example.beproject.ui.Reminder;

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

import com.example.beproject.databinding.FragmentReminderBinding;

public class ReminderFragment extends Fragment {

    private ReminderViewModel reminderViewModel;
private FragmentReminderBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        reminderViewModel =
                new ViewModelProvider(this).get(ReminderViewModel.class);

    binding = FragmentReminderBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.buttonAddMealsReminder;
        reminderViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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