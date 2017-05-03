package com.example.liuhao.androidplayground.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.liuhao.androidplayground.R;
import com.example.liuhao.androidplayground.databinding.ActivityMvvmBinding;

public class MVVMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mvvm);

        ActivityMvvmBinding binding = ActivityMvvmBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

    }
}
