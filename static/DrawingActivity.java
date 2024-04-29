activity_draw.xml :
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/white"
    tools:context=".DrawingActivity">

    <FrameLayout
        android:id="@+id/drawingContainer"
        android:layout_width="407dp"
        android:layout_height="565dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.02">

        <!-- Your Drawing View can be added here -->
        <!-- For example: -->
        <!--<com.example.emptyactivity.DrawingActivity$DrawingView
            android:id="@+id/drawingView"
            android:layout_width="match_parent"
            android:layout_height="match_parent" />-->

    </FrameLayout>

    <Button
        android:id="@+id/buttonRectangle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="RECTANGLE"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.052"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.788" />

    <Button
        android:id="@+id/buttonLine"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="LINE"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.563"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.788" />

    <Button
        android:id="@+id/buttonCircle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="CIRCLE"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.95"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.788" />

    <SeekBar
        android:id="@+id/seekBarWidth"
        android:layout_width="331dp"
        android:layout_height="32dp"
        android:background="#D3C4ED"
        android:max="20"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.41"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@+id/drawingContainer"
        app:layout_constraintVertical_bias="0.876" />

    <Spinner
        android:id="@+id/spinnerColor"
        android:layout_width="79dp"
        android:layout_height="43dp"
        android:background="#8a2be2"
        android:spinnerMode="dialog"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.096"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@+id/drawingContainer"
        app:layout_constraintVertical_bias="0.96"
        tools:visibility="visible" />

    <Button
        android:id="@+id/buttonEraser"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Rubber"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.417"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.967" />

    <Button
        android:id="@+id/buttonEraseAll"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Erase All"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.856"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.967" />

</androidx.constraintlayout.widget.ConstraintLayout>

DrawingActivity.java :

package com.example.emptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import android.widget.FrameLayout;

public class DrawingActivity extends AppCompatActivity {

    private static DrawingView drawingView; // Declare as static
    private Button buttonRectangle, buttonCircle, buttonLine, buttonEraser, buttonEraseAll;
    private SeekBar seekBarWidth;
    private Spinner spinnerColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);

        FrameLayout drawingContainer = findViewById(R.id.drawingContainer);
        drawingView = new DrawingView(this); // Assign to the static instance
        drawingContainer.addView(drawingView);
        buttonRectangle = findViewById(R.id.buttonRectangle);
        buttonCircle = findViewById(R.id.buttonCircle);
        buttonLine = findViewById(R.id.buttonLine);
        buttonEraser = findViewById(R.id.buttonEraser);
        buttonEraseAll = findViewById(R.id.buttonEraseAll);
        seekBarWidth = findViewById(R.id.seekBarWidth);
        spinnerColor = findViewById(R.id.spinnerColor);

        // Set up spinner adapter with color options
        String[] colors = {"Black", "Red", "Green", "Blue"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, colors);
        spinnerColor.setAdapter(adapter);

        buttonRectangle.setOnClickListener(v -> drawingView.setDrawingMode(DrawingView.DrawingMode.RECTANGLE));
        buttonCircle.setOnClickListener(v -> drawingView.setDrawingMode(DrawingView.DrawingMode.CIRCLE));
        buttonLine.setOnClickListener(v -> drawingView.setDrawingMode(DrawingView.DrawingMode.LINE));
        buttonEraser.setOnClickListener(v -> drawingView.setDrawingMode(DrawingView.DrawingMode.ERASER));
        buttonEraseAll.setOnClickListener(v -> drawingView.eraseAll());

        seekBarWidth.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                drawingView.setStrokeWidth(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        spinnerColor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String colorName = parent.getItemAtPosition(position).toString();
                int color = Color.BLACK;
                switch (colorName) {
                    case "Black":
                        color = Color.BLACK;
                        break;
                    case "Red":
                        color = Color.RED;
                        break;
                    case "Green":
                        color = Color.GREEN;
                        break;
                    case "Blue":
                        color = Color.BLUE;
                        break;
                }
                drawingView.setColor(color);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
    }

    public static class DrawingView extends View {

        private Paint paint;
        private List<Shape> shapes;
        private Shape currentShape;
        private DrawingMode drawingMode = DrawingMode.RECTANGLE;
        private int strokeWidth = 5;
        private int currentColor = Color.BLACK;

        public enum DrawingMode {
            RECTANGLE, CIRCLE, LINE, ERASER
        }

        public DrawingView(Context context) {
            super(context);
            init();
        }

        private void init() {
            paint = new Paint();
            paint.setColor(currentColor);
            paint.setStrokeWidth(strokeWidth);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);

            shapes = new ArrayList<>();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            for (Shape shape : shapes) {
                shape.draw(canvas);
            }

            if (currentShape != null) {
                currentShape.draw(canvas);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    if (drawingMode != DrawingMode.ERASER) {
                        currentShape = new Shape();
                        currentShape.setStrokeWidth(strokeWidth);
                        currentShape.setColor(currentColor);
                        currentShape.setDrawingMode(drawingMode);
                        currentShape.moveTo(event.getX(), event.getY());
                    } else {
                        // Erase logic
                        eraseAt(event.getX(), event.getY());
                    }
                    break;
                case MotionEvent.ACTION_MOVE:
                    if (drawingMode != DrawingMode.ERASER && currentShape != null) {
                        currentShape.lineTo(event.getX(), event.getY());
                    } else {
                        // Erase logic
                        eraseAt(event.getX(), event.getY());
                    }
                    invalidate();
                    break;
                case MotionEvent.ACTION_UP:
                    if (drawingMode != DrawingMode.ERASER && currentShape != null) {
                        shapes.add(currentShape);
                        currentShape = null;
                    }
                    break;
            }
            return true;
        }

        public void setStrokeWidth(int strokeWidth) {
            this.strokeWidth = strokeWidth;
            if (currentShape != null) {
                currentShape.setStrokeWidth(strokeWidth);
            }
        }

        public void setColor(int color) {
            this.currentColor = color;
            if (currentShape != null) {
                currentShape.setColor(color);
            }
        }

        public void setDrawingMode(DrawingMode drawingMode) {
            this.drawingMode = drawingMode;
        }

        private void eraseAt(float x, float y) {
            // Iterate through shapes in reverse order to find the top-most shape at the point (x, y)
            for (int i = shapes.size() - 1; i >= 0; i--) {
                Shape shape = shapes.get(i);
                if (shape.contains(x, y)) {
                    shapes.remove(i);
                    invalidate();
                    break; // Only erase the top-most shape
                }
            }
        }

        public void eraseAll() {
            shapes.clear();
            invalidate();
        }
    }

    public static class Shape {

        private Path path;
        private int color;
        private int strokeWidth;
        private DrawingView.DrawingMode drawingMode;

        public Shape() {
            path = new Path();
        }

        public void setColor(int color) {
            this.color = color;
        }

        public void setStrokeWidth(int strokeWidth) {
            this.strokeWidth = strokeWidth;
        }

        public void setDrawingMode(DrawingView.DrawingMode drawingMode) {
            this.drawingMode = drawingMode;
        }

        public void moveTo(float x, float y) {
            path.moveTo(x, y);
        }

        public void lineTo(float x, float y) {
            path.lineTo(x, y);
        }

        public void draw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setColor(color);
            paint.setStrokeWidth(strokeWidth);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);

            RectF bounds = new RectF();
            path.computeBounds(bounds, true);

            switch (drawingMode) {
                case RECTANGLE:
                    canvas.drawRect(bounds, paint);
                    break;
                case CIRCLE:
                    float centerX = bounds.centerX();
                    float centerY = bounds.centerY();
                    float radius = Math.max(bounds.width(), bounds.height()) / 2;
                    canvas.drawCircle(centerX, centerY, radius, paint);
                    break;
                case LINE:
                    canvas.drawPath(path, paint);
                    break;
            }
        }

        public boolean contains(float x, float y) {
            RectF bounds = new RectF();
            path.computeBounds(bounds, true);
            return bounds.contains(x, y);
        }
    }
}