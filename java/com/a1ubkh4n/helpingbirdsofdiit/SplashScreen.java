package com.a1ubkh4n.helpingbirdsofdiit;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewAnimationUtils;

/**
 * Created by a1ubkh4n on 09/02/2017.
 */
public class SplashScreen extends Activity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        context = this;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startRevealAnimation();
            }
        }, 200);

    }

    /**
     * Start splash animation with reveal effect
     */
    private void startRevealAnimation() {
        // previously invisible view
        View myView = findViewById(R.id.backgroundLayout);

        if (Build.VERSION.SDK_INT >= 21) {
            // get the center for the clipping circle
            int cx = (myView.getLeft() + myView.getRight()) / 2;
            int cy = (myView.getTop() + myView.getBottom()) / 2;

            // get the final radius for the clipping circle
            int finalRadius = Math.max(myView.getWidth(), myView.getHeight());

            Animator anim = null;
            try {
                // create the animator for this view (the start radius is zero)
                anim = ViewAnimationUtils.createCircularReveal(myView, cx, cy, 0, finalRadius);
            } catch (IllegalStateException ignored) {}

            // make the view visible and start the animation
            myView.setVisibility(View.VISIBLE);

            if (anim != null) anim.start();
        } else {
            myView.setVisibility(View.VISIBLE);
        }
        startMainActivity();
    }


     // finish splash screen, start main activity

    private void startMainActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        }, 1000);
    }

}