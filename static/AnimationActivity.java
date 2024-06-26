

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/linearLayout2"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/white"
    android:orientation="vertical">


    <ImageView
        android:id="@id/imageView"
        android:layout_width="354dp"
        android:layout_height="232dp"
        android:src="@drawable/tceseminar"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.062" />

    <Button
        android:id="@+id/btnFadeIn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Fade In"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.08"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.405" />

    <Button
        android:id="@+id/btnFadeOut"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Fade Out"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.464"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.405" />

    <Button
        android:id="@+id/btnCrossFade"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Cross Fade"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.749"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.53" />

    <Button
        android:id="@+id/btnBlink"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Blink"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.464"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.656" />

    <Button
        android:id="@+id/btnZoomIn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Zoom In"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.869"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.913" />

    <Button
        android:id="@+id/btnZoomOut"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Zoom Out"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.082"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.913" />

    <Button
        android:id="@+id/btnRotate"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Rotate"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.876"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.656" />

    <Button
        android:id="@+id/btnMove"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Move"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.913" />

    <Button
        android:id="@+id/btnSlideUp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Slide Up"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.213"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.793" />

    <Button
        android:id="@+id/btnSlideDown"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Slide Down"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.748"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.792" />

    <Button
        android:id="@+id/btnBounce"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Bounce"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.08"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.656" />

    <Button
        android:id="@+id/btnSequential"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sequential"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.226"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.53" />

    <Button
        android:id="@+id/btnTogether"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Together"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.895"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.404" />

</androidx.constraintlayout.widget.ConstraintLayout>


AnimationActivity.java :

package com.example.emptyactivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AnimationActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button btnFadeIn, btnFadeOut, btnCrossFade, btnBlink, btnZoomIn, btnZoomOut,
            btnRotate, btnMove, btnSlideUp, btnSlideDown, btnBounce, btnSequential, btnTogether;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        imageView = findViewById(R.id.imageView);
        btnFadeIn = findViewById(R.id.btnFadeIn);
        btnFadeOut = findViewById(R.id.btnFadeOut);
        btnCrossFade = findViewById(R.id.btnCrossFade);
        btnBlink = findViewById(R.id.btnBlink);
        btnZoomIn = findViewById(R.id.btnZoomIn);
        btnZoomOut = findViewById(R.id.btnZoomOut);
        btnRotate = findViewById(R.id.btnRotate);
        btnMove = findViewById(R.id.btnMove);
        btnSlideUp = findViewById(R.id.btnSlideUp);
        btnSlideDown = findViewById(R.id.btnSlideDown);
        btnBounce = findViewById(R.id.btnBounce);
        btnSequential = findViewById(R.id.btnSequential);
        btnTogether = findViewById(R.id.btnTogether);

        btnFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeIn();
            }
        });

        btnFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeOut();
            }
        });

        btnCrossFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crossFade();
            }
        });

        // Implement click listeners and animation methods for all buttons here
        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blink();
            }
        });

        btnZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomIn();
            }
        });

        btnZoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOut();
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotate();
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move();
            }
        });

        btnSlideUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideUp();
            }
        });

        btnSlideDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideDown();
            }
        });

        btnBounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bounce();
            }
        });

        btnSequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sequentialAnimation();
            }
        });

        btnTogether.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                togetherAnimation();
            }
        });
    }

    private void fadeIn() {
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(1000);
        imageView.startAnimation(fadeIn);
    }

    private void fadeOut() {
        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setDuration(1000);
        imageView.startAnimation(fadeOut);
    }

    private void crossFade() {
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(1000);

        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setDuration(1000);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(fadeOut);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(fadeIn);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        imageView.startAnimation(fadeOut);
    }

    private void blink() {
        Animation blink = new AlphaAnimation(1, 0);
        blink.setDuration(300); // Adjust duration for desired blink speed
        blink.setRepeatCount(4); // Adjust for number of blinks
        blink.setRepeatMode(Animation.REVERSE);
        imageView.startAnimation(blink);
    }

    private void zoomIn() {
        float pivotX = imageView.getWidth() / 2.0f;
        float pivotY = imageView.getHeight() / 2.0f;
        ScaleAnimation zoomIn = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, pivotX, pivotY);
        zoomIn.setDuration(1000);
        imageView.startAnimation(zoomIn);
    }

    private void zoomOut() {
        float pivotX = imageView.getWidth() / 2.0f;
        float pivotY = imageView.getHeight() / 2.0f;
        ScaleAnimation zoomOut = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, pivotX, pivotY);
        zoomOut.setDuration(1000);
        imageView.startAnimation(zoomOut);
    }

    private void rotate() {
        RotateAnimation rotate = new RotateAnimation(0, 360,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(1000);
        imageView.startAnimation(rotate);
    }

    private void move() {
        float fromXDelta = 100; // Adjust for desired horizontal movement
        float fromYDelta = 0;   // Adjust for desired vertical movement
        float toXDelta = 0;
        float toYDelta = 100;  // Adjust for desired vertical movement
        TranslateAnimation move = new TranslateAnimation(Animation.ABSOLUTE, fromXDelta,
                Animation.ABSOLUTE, toXDelta, Animation.ABSOLUTE, fromYDelta, Animation.ABSOLUTE, toYDelta);
        move.setDuration(1000);
        imageView.startAnimation(move);
    }

    private void slideUp() {
        float fromYDelta = 0;
        float toYDelta = -imageView.getHeight(); // Move image off-screen
        TranslateAnimation slideUp = new TranslateAnimation(Animation.ABSOLUTE, 0,
                Animation.ABSOLUTE, 0, Animation.ABSOLUTE, fromYDelta, Animation.ABSOLUTE, toYDelta);
        slideUp.setDuration(1000);
        imageView.startAnimation(slideUp);
    }

    private void slideDown() {
        float fromYDelta = imageView.getHeight(); // Move image from off-screen
        float toYDelta = 0;
        TranslateAnimation slideDown = new TranslateAnimation(Animation.ABSOLUTE, 0,
                Animation.ABSOLUTE, 0, Animation.ABSOLUTE, fromYDelta, Animation.ABSOLUTE, toYDelta);
        slideDown.setDuration(1000);
        imageView.startAnimation(slideDown);
    }

    private void bounce() {
        AnimationSet bounce = new AnimationSet(false);
        TranslateAnimation translateY = new TranslateAnimation(Animation.ABSOLUTE, 0,
                Animation.ABSOLUTE, 0, Animation.ABSOLUTE, 0, Animation.ABSOLUTE, -100);
        translateY.setDuration(500);
        translateY.setRepeatCount(4);
        translateY.setRepeatMode(Animation.REVERSE);
        bounce.addAnimation(translateY);
        imageView.startAnimation(bounce);
    }

    private void sequentialAnimation() {
        AnimationSet sequential = new AnimationSet(false);

        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(1000);

        RotateAnimation rotate = new RotateAnimation(0, 360,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(1000);

        ScaleAnimation zoomOut = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f,
                ScaleAnimation.RELATIVE_TO_SELF, 0.5f, ScaleAnimation.RELATIVE_TO_SELF, 0.5f);
        zoomOut.setDuration(1000);

        sequential.addAnimation(fadeIn);
        sequential.addAnimation(rotate);
        sequential.addAnimation(zoomOut);

        imageView.startAnimation(sequential);
    }

    private void togetherAnimation() {
        AnimationSet together = new AnimationSet(true); // Animate together

        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(1000);

        RotateAnimation rotate = new RotateAnimation(0, 360,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(1000);

        ScaleAnimation zoomIn = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f,
                ScaleAnimation.RELATIVE_TO_SELF, 0.5f, ScaleAnimation.RELATIVE_TO_SELF, 0.5f);
        zoomIn.setDuration(1000);

        together.addAnimation(fadeIn);
        together.addAnimation(rotate);
        together.addAnimation(zoomIn);

        imageView.startAnimation(together);
    }

}