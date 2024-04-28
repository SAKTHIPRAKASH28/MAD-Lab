package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ContactManager {
    private DatabaseHelper dbHelper;

    public ContactManager(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    public long addContact(String name, String email) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("email", email);
        long id = db.insert("contacts", null, values);
        db.close();
        return id;
    }

    public Cursor getAllContacts() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        return db.query("contacts", null, null, null, null, null, null);
    }

    public void updateContact(int id, String name, String email) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("email", email);
        db.update("contacts", values, "id=?", new String[]{String.valueOf(id)});
        db.close();
    }

    public void deleteContact(int id) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.delete("contacts", "id=?", new String[]{String.valueOf(id)});
        db.close();
    }
}
