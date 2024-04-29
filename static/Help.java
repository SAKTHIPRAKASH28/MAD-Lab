activity_help.xml :

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/linearLayout"
    android:background="@color/white"
    android:layout_width="match_parent"
    android:layout_height="match_parent">


    <TextView
        android:id="@+id/textView3"
        android:layout_width="212dp"
        android:layout_height="48dp"
        android:fontFamily="sans-serif-medium"
        android:text="HELP"
        android:textAlignment="center"
        android:textAppearance="@style/TextAppearance.AppCompat.Body2"
        android:textColor="@color/purple_700"
        android:textColorHint="@color/black"
        android:textSize="25dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.496"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.042" />

    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/constraintLayout"
        android:layout_width="373dp"
        android:layout_height="286dp"
        android:background="#F5F5F5"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView3"
        app:layout_constraintVertical_bias="0.053">

        <EditText
            android:id="@+id/editTextTextPersonName"
            android:layout_width="325dp"
            android:layout_height="52dp"
            android:ems="10"
            android:hint="Phone number"
            android:textColor="@color/black"
            android:inputType="textPersonName"
            android:textColorHint="@color/black"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="0.141" />

        <EditText
            android:id="@+id/editTextTextPersonName2"
            android:layout_width="325dp"
            android:layout_height="52dp"
            android:layout_marginTop="32dp"
            android:ems="10"
            android:hint="Message"
            android:textColor="@color/black"
            android:inputType="textPersonName"
            android:textColorHint="@color/black"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/editTextTextPersonName" />


        <Button
            android:id="@+id/button3"
            android:layout_width="143dp"
            android:layout_height="53dp"
            android:text="SEND VIA SMS"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.104"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="0.832" />

        <Button
            android:id="@+id/timerbutton"
            android:layout_width="143dp"
            android:layout_height="53dp"
            android:text="SEND IN 1 MINS"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.895"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="0.832" />
    </androidx.constraintlayout.widget.ConstraintLayout>

    <TextView
        android:id="@+id/textView5"
        android:layout_width="276dp"
        android:layout_height="44dp"
        android:layout_marginTop="16dp"
        android:fontFamily="sans-serif-medium"
        android:text="CONTACT-WHATSAPP"
        android:textAlignment="center"
        android:textAppearance="@style/TextAppearance.AppCompat.Body2"
        android:textColor="@color/purple_700"
        android:textSize="25dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/constraintLayout"
        app:layout_constraintVertical_bias="0.0" />

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="373dp"
        android:layout_height="243dp"
        android:layout_marginTop="25dp"
        android:background="#F5F5F5"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView5"
        app:layout_constraintVertical_bias="0.0">

        <EditText
            android:id="@+id/editTextTextPersonName3"
            android:layout_width="325dp"
            android:layout_height="52dp"
            android:layout_marginTop="28dp"
            android:ems="10"
            android:hint="Enter message"
            android:textColor="@color/black"
            android:inputType="textPersonName"
            android:textColorHint="@color/black"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <Button
            android:id="@+id/button13"
            android:layout_width="143dp"
            android:layout_height="53dp"
            android:layout_marginTop="45dp"
            android:text="Send via Other apps"
            android:textColor="@color/black"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/editTextTextPersonName3"
            app:layout_constraintVertical_bias="0.0" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <ImageButton
        android:id="@+id/imageButton"
        android:layout_width="57dp"
        android:layout_height="50dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.045"
        app:layout_constraintStart_toStartOf="parent"
        android:background="@color/blue"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.039"
        app:srcCompat="@drawable/ic_baseline_add_location_alt_24" />
</androidx.constraintlayout.widget.ConstraintLayout>

HelpActivity.java :


package com.example.emptyactivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.os.CountDownTimer;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;


public class Help extends AppCompatActivity {
    private static final int PERMISSION_REQUEST_SEND_SMS = 1;
    private static final long ONE_MINUTE_IN_MILLIS = 60000;
    private EditText phonenumber, message;
    private Button send, scheduleButton;
    private ImageButton imgButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        send = findViewById(R.id.button3);
        phonenumber = findViewById(R.id.editTextTextPersonName);
        message = findViewById(R.id.editTextTextPersonName2);
        final EditText messageEditText = findViewById(R.id.editTextTextPersonName3);
        scheduleButton = findViewById(R.id.timerbutton);
        Button button13 = findViewById(R.id.button13);
        imgButton=findViewById(R.id.imageButton);

        send.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String numbers = phonenumber.getText().toString().trim(); // Remove leading/trailing whitespaces
                String msg = message.getText().toString();

                if (checkPermission()) {
                    if (!numbers.isEmpty() && !msg.isEmpty()) {
                        sendSMS(splitNumbers(numbers), msg); // Send to multiple recipients
                    } else {
                        Toast.makeText(getApplicationContext(), "Phone number or message is empty", Toast.LENGTH_LONG).show();
                    }
                } else {
                    requestPermission();
                }
            }
        });

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Help.this, map.class);
                startActivity(intent);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m = messageEditText.getText().toString();
                sendMessage(m);
            }
        });

        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Store phone numbers and message for later use
                final String numbers = phonenumber.getText().toString().trim();
                final String msg = message.getText().toString();

                new CountDownTimer(ONE_MINUTE_IN_MILLIS, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        // Update UI if needed (optional)
                    }

                    @Override
                    public void onFinish() {
                        try {
                            if (checkPermission()) {
                                sendSMS(splitNumbers(numbers), msg); // Attempt to send SMS
                                // Display a success toast even if sending might not be immediate
                                Toast.makeText(getApplicationContext(), "Message sent!", Toast.LENGTH_LONG).show();
                            } else {
                                requestPermission();
                            }
                        } catch (Exception e) {
                            // Handle potential errors (e.g., permission issues, SMS sending failure)
                            Toast.makeText(getApplicationContext(), "Failed to send message", Toast.LENGTH_LONG).show();
                        }
                    }
                }.start();
            }
        });


    }



    private boolean checkPermission() {
        int result = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);
        return result == PackageManager.PERMISSION_GRANTED;
    }

    private void requestPermission() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, PERMISSION_REQUEST_SEND_SMS);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_REQUEST_SEND_SMS) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(getApplicationContext(), "Permission granted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Permission denied", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void sendMessage(String m) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, m);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            // If no apps can handle the intent, show a toast message
            Toast.makeText(this, "No app can handle this action.", Toast.LENGTH_SHORT).show();
        }
    }


    private void sendSMS(String[] phoneNumbers, String message) {
        try {
            SmsManager smsManager = SmsManager.getDefault();
            for (String number : phoneNumbers) {
                smsManager.sendTextMessage(number, null, message, null, null);
            }
            Toast.makeText(getApplicationContext(), "Message Sent", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Failed to send message", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

    private String[] splitNumbers(String numbers) {
        // Splits comma-separated phone numbers into an array
        return numbers.split(",");
    }
}


<uses-permission android:name="android.permission.READ_SMS" />
    <uses-permission android:name="android.permission.RECEIVE_SMS" />                                                          <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.SEND_SMS" />
