package com.example.myapplication;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText nameEditText, emailEditText;
    private Button submitButton, updateButton, deleteButton;
    private ListView contactListView;
    private ContactManager contactManager;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> contactList;
    private int selectedContactId = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.name);
        emailEditText = findViewById(R.id.email);
        submitButton = findViewById(R.id.send_button);
        updateButton = findViewById(R.id.update_button);
        deleteButton = findViewById(R.id.delete_button);
        contactListView = findViewById(R.id.contact_list);
        contactManager = new ContactManager(this);
        contactList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contactList);
        contactListView.setAdapter(adapter);

        displayContacts();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();

                if (!name.isEmpty() && !email.isEmpty()) {
                    long id = contactManager.addContact(name, email);
                    if (id != -1) {
                        Toast.makeText(MainActivity.this, "Contact added successfully", Toast.LENGTH_SHORT).show();
                        displayContacts();
                        nameEditText.setText("");
                        emailEditText.setText("");
                    } else {
                        Toast.makeText(MainActivity.this, "Error adding contact", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Please enter name and email", Toast.LENGTH_SHORT).show();
                }
            }
        });

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();

                if (selectedContactId != -1 && !name.isEmpty() && !email.isEmpty()) {
                    contactManager.updateContact(selectedContactId, name, email);
                    Toast.makeText(MainActivity.this, "Contact updated successfully", Toast.LENGTH_SHORT).show();
                    displayContacts();
                    nameEditText.setText("");
                    emailEditText.setText("");
                    selectedContactId = -1;
                } else {
                    Toast.makeText(MainActivity.this, "Please select a contact and enter name and email", Toast.LENGTH_SHORT).show();
                }
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedContactId != -1) {
                    contactManager.deleteContact(selectedContactId);
                    Toast.makeText(MainActivity.this, "Contact deleted successfully", Toast.LENGTH_SHORT).show();
                    displayContacts();
                    nameEditText.setText("");
                    emailEditText.setText("");
                    selectedContactId = -1;
                } else {
                    Toast.makeText(MainActivity.this, "Please select a contact to delete", Toast.LENGTH_SHORT).show();
                }
            }
        });

        contactListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String contactInfo = adapter.getItem(position);
                if (contactInfo != null) {
                    String[] parts = contactInfo.split(" - ");
                    if (parts.length == 2) {
                        nameEditText.setText(parts[0]);
                        emailEditText.setText(parts[1]);

                        Cursor cursor = contactManager.getAllContacts();
                        if (cursor != null && cursor.moveToPosition(position)) {
                            selectedContactId = cursor.getInt(cursor.getColumnIndex("id"));
                            cursor.close();
                        }
                    }
                }
            }
        });
    }

    private void displayContacts() {
        contactList.clear();
        Cursor cursor = contactManager.getAllContacts();
        if (cursor != null && cursor.moveToFirst()) {
            do {
                String name = cursor.getString(cursor.getColumnIndex("name"));
                String email = cursor.getString(cursor.getColumnIndex("email"));
                contactList.add(name + " - " + email);
            } while (cursor.moveToNext());
            cursor.close();
            adapter.notifyDataSetChanged();
        }
    }
}