package com.quentinrouet.module1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.quentinrouet.module1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Article article = new Article("pain au chocolat2", "description2", "url", 1.1f, 3.0f, false);
        binding.setArticle(article);
        binding.imageButtonWeb.setOnClickListener(v -> {
            
        });

    }

}