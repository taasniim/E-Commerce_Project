package essths.li3.e_commerceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class commande extends AppCompatActivity {
ImageButton precedent;
TextView commandes,details;
ImageView pizza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commande);
        precedent=(ImageButton) findViewById(R.id.precedent);
        commandes=(TextView) findViewById(R.id.commandes);
        details=(TextView) findViewById(R.id.details);
        pizza=(ImageView) findViewById(R.id.pizza);
        precedent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(commande.this,profile.class);
                startActivity(i);
            }
        });
    }
}