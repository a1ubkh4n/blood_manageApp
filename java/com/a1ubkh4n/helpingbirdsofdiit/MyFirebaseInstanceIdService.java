package com.a1ubkh4n.helpingbirdsofdiit;

/**
 * Created by Md.Aiub Khan on 13-Feb-17.
 */

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

public class MyFirebaseInstanceIdService extends com.google.firebase.iid.FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {

        //Getting registration token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        //Displaying token in logcat
        Log.e(TAG, "Refreshed token: " + refreshedToken);

    }

    private void sendRegistrationToServer(String token) {
        //You can implement this method to store the token on your server
        //Not required for current project
    }
}