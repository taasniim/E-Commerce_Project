package essths.li3.e_commerceproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class resultatActivity extends AppCompatActivity {
    EditText price;
    ImageButton q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);
        price=(EditText)findViewById(R.id.price);
        q=(ImageButton) findViewById(R.id.q);

        Intent i1=getIntent();
        String inputValue=i1.getStringExtra("inputValue");
        String Button=i1.getStringExtra("Button");
        assert Button!=null;
        if(Button.equals("add")){
            try {
                assert inputValue != null;
                Float m = Float.parseFloat(inputValue);
                Double r = m * 15.5;
                String result = r.toString();
                price.setText(result);
            }catch (NumberFormatException e){
                System.out.println("erreur");
            }
        }
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultatActivity.super.finishAffinity();
            }
        });

    }
}


