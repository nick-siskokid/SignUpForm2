package temple.edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button saveButton;
    EditText name, email, password, confirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveButton = findViewById(R.id.saveButton);
        name = findViewById(R.id.nameEditText);
        email = findViewById(R.id.emailEditText);
        password = findViewById(R.id.passwordEditText);
        confirmPassword = findViewById(R.id.confirmPasswordEditText);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().isEmpty() || email.getText().toString().isEmpty() || password.getText().toString().isEmpty() || confirmPassword.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Make sure you entered in all information.", Toast.LENGTH_SHORT).show();
                }
                else if(!(password.getText().toString().equals(confirmPassword.getText().toString()))){
                    Toast.makeText(MainActivity.this, "Cannot confirm password.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Welcome, " + name.getText().toString() + ", to the SignUpForm App!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
