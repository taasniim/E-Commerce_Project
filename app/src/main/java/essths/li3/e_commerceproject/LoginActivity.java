package essths.li3.e_commerceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    ImageView im2;
    EditText email;
    EditText password;
    Button log;
    TextView t1;
    TextView register;
    TextView forgotbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        im2=findViewById(R.id.logim);
        email=findViewById(R.id.logemail);
        password=findViewById((R.id.passlog));
        log=findViewById(R.id.b2log);
         t1=findViewById(R.id.donthave);
        register=findViewById(R.id.Registerlog);
        forgotbutton=findViewById(R.id.forgotpasss);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i1);


            }
        });

    }
}