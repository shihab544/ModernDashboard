package com.example.moderndashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView cardHome;
    CardView cardChat;
    CardView cardProfile;
    CardView cardSettings;
    CardView cardTool;
    CardView cardExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardHome = findViewById(R.id.cardHome);
        cardChat = findViewById(R.id.cardChat);
        cardProfile = findViewById(R.id.cardProfile);
        cardSettings = findViewById(R.id.cardSettings);
        cardTool = findViewById(R.id.cardTool);
        cardExit = findViewById(R.id.cardExit);

try{
            cardHome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast("Right Now Your Are in Home Shihab!");

                }
            });

            cardChat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast("Chat Clicked!");
                }
            });

            cardProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast("Profile Clicked!");
                }
            });

            cardSettings.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast("Settings Clicked!");
                }
            });

            cardTool.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast("Tools Clicked!");
                }
            });
            cardExit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast("Exit Clicked!");
                }
            });
        } catch (Exception ex) {
    ex.printStackTrace();
}
    }


    private void showToast (String message){
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }

        }

