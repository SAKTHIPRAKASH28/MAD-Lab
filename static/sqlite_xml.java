<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <EditText
        android:id="@+id/name"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="name"
        />

    <EditText
        android:id="@+id/email"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="email"
        android:inputType="textMultiLine" />

    <Button
        android:id="@+id/send_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Submit" />
    <Button
        android:id="@+id/update_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Update" />

    <Button
        android:id="@+id/delete_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Delete" />

    <ListView
        android:id="@+id/contact_list"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
</LinearLayout>
