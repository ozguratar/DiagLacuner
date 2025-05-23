
package com.example.diaglauncher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Rueban MTB Tool'u başlat
        Intent launchIntent = new Intent();
        launchIntent.setClassName("com.xiaomi.mtb", "com.xiaomi.mtb.MainActivity");
        launchIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(launchIntent);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Kendini sonlandır
        finish();
    }
}
