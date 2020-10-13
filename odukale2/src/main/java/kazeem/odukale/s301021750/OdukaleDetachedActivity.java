package kazeem.odukale.s301021750;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class OdukaleDetachedActivity extends AppCompatActivity {

    ArrayList<String> checkedOptions = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odukale_detached);

        //---CheckBox---
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.odukaleDetachedCheckBox1);
        checkBox1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.detachedString1Addr) + " - " + getResources().getString(R.string.detachedString1Price));
            }
        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.odukaleDetachedCheckBox2);
        checkBox2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.detachedString2Addr) + " - " + getResources().getString(R.string.detachedString2Price));
            }
        });

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.odukaleDetachCheckBox3);
        checkBox3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.detachedString3Addr) + " - " + getResources().getString(R.string.detachedString3Price));
            }
        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.odukaleDetachCheckBox4);
        checkBox4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.detachedString4Addr) + " - " + getResources().getString(R.string.detachedString4Price));
            }
        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.odukaleDetachCheckBox5);
        checkBox5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.detachedString5Addr) + " - " + getResources().getString(R.string.detachedString5Price));
            }
        });

        Button nextButton = findViewById(R.id.odukaleDetachNextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OdukaleDetachedActivity.this, OdukaleCheckoutActivity.class);
                intent.putExtra("selectedApt", checkedOptions);
                startActivity(intent);
            }
        });
    }
}