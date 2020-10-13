package kazeem.odukale.s301021750;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class OdukaleTownhouseActivity extends AppCompatActivity {

    ArrayList<String> checkedOptions = new ArrayList<>(); // array to store selected apartments options to view, 1st element is apartment type

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odukale_townhouse);

        //---CheckBox---
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.odukaleTownHouseCheckBox1);
        checkBox1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.townHouseString1Addr) + " - " + getResources().getString(R.string.townHouseString1Price));
            }
        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.odukaleTownHouseCheckBox2);
        checkBox2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.townHouseString2Addr) + " - " + getResources().getString(R.string.townHouseString2Price));
            }
        });

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.odukaleTownHouseCheckBox3);
        checkBox3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.townHouseString3Addr) + " - " + getResources().getString(R.string.townHouseString3Price));
            }
        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.odukaleTownHouseCheckBox4);
        checkBox4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.townHouseString4Addr) + " - " + getResources().getString(R.string.townHouseString4Price));
            }
        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.odukaleTownHouseCheckBox5);
        checkBox5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.townHouseString5Addr) + " - " + getResources().getString(R.string.townHouseString5Price));
            }
        });

        Button nextButton = findViewById(R.id.odukaleTownHouseNextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OdukaleTownhouseActivity.this, OdukaleCheckoutActivity.class);
                intent.putExtra("selectedApt", checkedOptions);
                startActivity(intent);
            }
        });
    }
}