package com.gregadeaux.udacityappportfolio;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gregadeaux.udacityappportfolio.databinding.ActivityMainBinding;


public class MainActivity extends Activity implements Button.OnClickListener{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.mainButtonSpotify.setOnClickListener(this);
        binding.mainButtonBuild.setOnClickListener(this);
        binding.mainButtonCapstone.setOnClickListener(this);
        binding.mainButtonScores.setOnClickListener(this);
        binding.mainButtonBuild.setOnClickListener(this);
        binding.mainButtonXyz.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String toastMessage = null;
        if(v == binding.mainButtonSpotify) {
            toastMessage = "This button will launch my Spotify App!";
        }else if(v == binding.mainButtonScores) {
            toastMessage = "This button will launch my Super Duo App!";
        }else if(v == binding.mainButtonBuild) {
            toastMessage = "This button will launch my Build It Bigger App!";
        }else if(v == binding.mainButtonXyz) {
            toastMessage = "This button will launch my XYZ Reader App!";
        }else if(v == binding.mainButtonCapstone) {
            toastMessage = "This button will launch my Capstone App!";
        }

        if(toastMessage != null) {
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
        }

    }
}
