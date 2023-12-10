package essths.li3.e_commerceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class notification extends AppCompatActivity {
    ImageButton precedent;
    TextView notif,detailnotif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        precedent=(ImageButton) findViewById(R.id.precedent);
        notif=(TextView) findViewById(R.id.notif);
        detailnotif=(TextView) findViewById(R.id.detailnotif);
        precedent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(notification.this,profile.class);
                startActivity(i);
            }
        });
    }
}