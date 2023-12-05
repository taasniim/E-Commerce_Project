package essths.li3.e_commerceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    ImageView im3;
    EditText email;
    EditText password;
    EditText phone;
    EditText username;

    Button reg;
    TextView already;
    TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        im3=findViewById(R.id.imgreg);
        email=findViewById(R.id.regemail);
        password=findViewById(R.id.regpass);
        phone=findViewById(R.id.regphone);
        username=findViewById(R.id.regusername);
        reg=findViewById(R.id.breg2);
        already=findViewById(R.id.already);
        login=findViewById(R.id.reglog);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(i1);


            }
        });
    }
}