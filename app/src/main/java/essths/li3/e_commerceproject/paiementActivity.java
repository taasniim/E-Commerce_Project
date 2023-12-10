package essths.li3.e_commerceproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class paiementActivity extends AppCompatActivity {
    EditText num;
    ImageButton pl;
    ImageButton min;


    TextView pizza;
    TextView sii;


    Button add;
    int numbr=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paiement);
        pizza=(TextView)findViewById(R.id.piz);
        sii=(TextView)findViewById(R.id.sii);
        min=(ImageButton)findViewById(R.id.min);
        pl=(ImageButton)findViewById(R.id.pl);

        num=(EditText)findViewById(R.id.num);
        add=(Button)findViewById(R.id.add_pizza);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputValue=num.getText().toString();
                Intent i1=new Intent(paiementActivity.this,resultatActivity.class);
                i1.putExtra("inputValue",inputValue);
                i1.putExtra("Button","add");
                startActivity(i1);

            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbr=numbr-1;
                num.setText(String.valueOf(numbr));
            }
        });


        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbr=numbr+1;
                num.setText(String.valueOf(numbr));
            }
        });



    }
}

