package essths.li3.e_commerceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class favori extends AppCompatActivity {
TextView favorite;
ImageButton precedent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favori);
        precedent=(ImageButton) findViewById(R.id.precedent);
        favorite=(TextView) findViewById(R.id.favorite);
        precedent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(favori.this,profile.class);
                startActivity(i);
            }
        });
    }
}