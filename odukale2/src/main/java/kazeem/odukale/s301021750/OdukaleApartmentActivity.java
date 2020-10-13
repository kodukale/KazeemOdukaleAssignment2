package kazeem.odukale.s301021750;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class OdukaleApartmentActivity extends AppCompatActivity {

    ArrayList<String> checkedOptions = new ArrayList<>(); // array to store selected apartments options to view, 1st element is apartment type

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odukale_apartment);

        //---CheckBox---
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.odukaleCheckBox1);
        checkBox1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.apartmentString1Addr) + " - " + getResources().getString(R.string.apartmentString1Price));
            }
        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.odukaleCheckBox2);
        checkBox2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.apartmentString2Addr) + " - " + getResources().getString(R.string.apartmentString2Price));
            }
        });

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.odukaleCheckBox3);
        checkBox3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.apartmentString3Addr) + " - " + getResources().getString(R.string.apartmentString3Price));
            }
        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.odukaleCheckBox4);
        checkBox4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.apartmentString4Addr) + " - " + getResources().getString(R.string.apartmentString4Price));
            }
        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.odukaleCheckBox5);
        checkBox5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.apartmentString5Addr) + " - " + getResources().getString(R.string.apartmentString5Price));
            }
        });

        Button nextButton = findViewById(R.id.odukaleAptNext);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OdukaleApartmentActivity.this, OdukaleCheckoutActivity.class);
                intent.putExtra("selectedApt", checkedOptions);
                startActivity(intent);
            }
        });
    }
}