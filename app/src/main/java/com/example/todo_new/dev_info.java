package com.example.todo_new;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class dev_info extends AppCompatActivity {

    private Button userProfileButton;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_info);

        ImageView back = findViewById(R.id.imageView1); // Ensure the correct id if different
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Finish the current activity and return to the previous one
            }
        });

        userProfileButton = findViewById(R.id.userprofile);
        logoutButton = findViewById(R.id.logout);

        userProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dev_info.this, user_infor_setting.class);
                startActivity(intent);
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dev_info.this, splash.class);
                startActivity(intent);
                finish(); // Finish the current activity
            }
        });
    }
}
