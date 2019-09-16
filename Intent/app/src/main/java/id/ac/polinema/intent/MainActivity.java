package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = ImplicitIntentActivity.class.getCanonicalName();
    private static final int GALLERY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleExplicitIntent(View view) {
        Intent intent = new Intent(this,ExplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handleExit(View view) {
        finish();
    }

    public void handleImplicitIntent(View view) {
        Intent intent = new Intent(this,ImplicitIntentActivity.class);
        startActivity(intent);
    }
}
