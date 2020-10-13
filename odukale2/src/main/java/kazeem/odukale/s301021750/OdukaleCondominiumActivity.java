package kazeem.odukale.s301021750;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class OdukaleCondominiumActivity extends AppCompatActivity {

    ArrayList<String> checkedOptions = new ArrayList<>(); // array to store selected apartments options to view, 1st element is apartment type

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odukale_condominium);

        //---CheckBox---
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.odukaleCondominiumCheckBox1);
        checkBox1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.condominiumString1Addr) + " - " + getResources().getString(R.string.condominiumString1Price));
            }
        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.odukaleCondominiumCheckBox2);
        checkBox2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.condominiumString2Addr) + " - " + getResources().getString(R.string.condominiumString2Price));
            }
        });

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.odukaleCondominiumCheckBox3);
        checkBox3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.condominiumString3Addr) + " - " + getResources().getString(R.string.condominiumString3Price));
            }
        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.odukaleCondominiumCheckBox4);
        checkBox4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.condominiumString4Addr) + " - " + getResources().getString(R.string.condominiumString4Price));
            }
        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.odukaleCondominiumCheckBox5);
        checkBox5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.condominiumString5Addr) + " - " + getResources().getString(R.string.condominiumString5Price));
            }
        });

        Button nextButton = findViewById(R.id.odukaleCondominiumNextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OdukaleCondominiumActivity.this, OdukaleCheckoutActivity.class);
                intent.putExtra("selectedApt", checkedOptions);
                startActivity(intent);
            }
        });
    }
}