package essths.li3.e_commerceproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class profile extends AppCompatActivity {
    Button logout;
    ConstraintLayout c1;
    LinearLayout linearcommande,linearnotif,linearfav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        logout=(Button)findViewById(R.id.logout);
        linearcommande=(LinearLayout)findViewById(R.id.linearcommande) ;
        linearnotif=(LinearLayout)findViewById(R.id.linearnotif) ;
        linearfav=(LinearLayout)findViewById(R.id.linearfavoris) ;

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        linearcommande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(profile.this,commande.class);
                startActivity(i);
            }
        });
        linearnotif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(profile.this,notification.class);
                startActivity(i);
            }
        });
        linearfav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(profile.this,favori.class);
                startActivity(i);
            }
        });

    }
}