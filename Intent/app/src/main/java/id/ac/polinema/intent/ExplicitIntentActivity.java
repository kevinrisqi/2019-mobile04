package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ExplicitIntentActivity extends AppCompatActivity {

    private TextView outputText;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        outputText = findViewById(R.id.text_output);
        editText = findViewById(R.id.input_name);
    }

    public void cetak(View view) {
        String nameInput = editText.getText().toString();
        outputText.setText(nameInput);
    }
}
