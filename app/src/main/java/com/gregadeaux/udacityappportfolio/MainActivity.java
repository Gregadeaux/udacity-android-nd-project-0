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

    C:\ProgramData\Oracle\Java\javapath;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\Program Files (x86)\AMD APP\bin\x86_64;C:\Program Files (x86)\AMD APP\bin\x86;C:\Users\Greg Billetdeaux\Documents\AMD APP\bin\x86_64;C:\Users\Greg Billetdeaux\Documents\AMD APP\bin\x86;%SystemRoot%\system32;%SystemRoot%;%SystemRoot%\System32\Wbem;%SYSTEMROOT%\System32\WindowsPowerShell\v1.0\;C:\Program Files\Microsoft\Web Platform Installer\;C:\Program Files (x86)\Microsoft ASP.NET\ASP.NET Web Pages\v1.0\;C:\Program Files\Microsoft SQL Server\110\Tools\Binn\;C:\Program Files (x86)\Windows Live\Shared;C:\Program Files (x86)\IVI Foundation\VISA\WinNT\Bin\;C:\Program Files\IVI Foundation\VISA\Win64\Bin\;C:\Program Files (x86)\IVI Foundation\VISA\WinNT\Bin;C:\Program Files (x86)\ATI Technologies\ATI.ACE\Core-Static;C:\Program Files (x86)\AMD\ATI.ACE\Core-Static

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
