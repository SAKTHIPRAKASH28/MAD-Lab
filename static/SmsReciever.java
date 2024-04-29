package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText numberInput, messageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.numberInput);
        messageInput = findViewById(R.id.messageInput);

        // Button click event to send SMS
        Button sendButton = findViewById(R.id.send_button);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = numberInput.getText().toString();
                String message = messageInput.getText().toString();
                sendSMS(phoneNumber, message);
            }
        });
    }

    private void sendSMS(String phoneNumber, String message) {
        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNumber, null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_SHORT).show();
            //Group chat
            Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + "phone numbers"));
            smsIntent.putExtra("sms_body", message);
            startActivity(smsIntent);
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "SMS failed to send.", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}
