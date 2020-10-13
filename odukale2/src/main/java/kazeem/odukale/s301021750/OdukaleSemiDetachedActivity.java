package kazeem.odukale.s301021750;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class OdukaleSemiDetachedActivity extends AppCompatActivity {

    ArrayList<String> checkedOptions = new ArrayList<>(); // array to store selected apartments options to view, 1st element is apartment type

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odukale_semi_detached);

        //---CheckBox---
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.odukaleSemiDetCheckBox1);
        checkBox1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.semiDetString1Addr) + " - " + getResources().getString(R.string.semiDetString1Price));
            }
        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.odukaleSemiDetCheckBox2);
        checkBox2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.semiDetString2Addr) + " - " + getResources().getString(R.string.semiDetString2Price));
            }
        });

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.odukaleSemiDetCheckBox3);
        checkBox3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.semiDetString3Addr) + " - " + getResources().getString(R.string.semiDetString3Price));
            }
        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.odukaleSemiDetCheckBox4);
        checkBox4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.semiDetString4Addr) + " - " + getResources().getString(R.string.semiDetString4Price));
            }
        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.odukaleSemiDetCheckBox5);
        checkBox5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.semiDetString5Addr) + " - " + getResources().getString(R.string.semiDetString5Price));
            }
        });

        Button nextButton = findViewById(R.id.odukaleSemiDetachedNextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OdukaleSemiDetachedActivity.this, OdukaleCheckoutActivity.class);
                intent.putExtra("selectedApt", checkedOptions);
                startActivity(intent);
            }
        });
    }
}