package kazeem.odukale.s301021750;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ViewUtils;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class OdukaleCheckoutActivity extends AppCompatActivity {

    ArrayList<String> recievedIntent;
    RadioGroup radioGroup;
    Button nextCheckoutButton;
    RadioButton selectedApartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odukale_checkout);
        recievedIntent = (ArrayList<String>) getIntent().getSerializableExtra("selectedApt");
        radioGroup = findViewById(R.id.odukaleRadioGroup);
        getApartmentType(recievedIntent);

        //--- Payment RadioButton---
        RadioGroup radioGroupPayment = (RadioGroup) findViewById(R.id.odukalePaymentOptionRG);
        radioGroupPayment.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rCC = (RadioButton) findViewById(R.id.odukaleCreditCardRbtn);
                RadioButton rbDC = findViewById(R.id.odukaleDebitCardRbtn);
                if (rCC.isChecked()) {
                    recievedIntent.add(getResources().getString(R.string.ccCard));
                } else if (rbDC.isChecked()) {
                    recievedIntent.add(getResources().getString(R.string.dcCard));
                }
                else { }
            }
        });

        //--- Apartment option RadioButton---
        final RadioGroup radioGroupSelectedApt = findViewById(R.id.odukaleRadioGroup);
        radioGroupSelectedApt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selectedApartment = findViewById(checkedId);
                if(selectedApartment == null) {
                    Toast.makeText(getApplicationContext(), "Please select an apartment", Toast.LENGTH_LONG).show();
                    return;
                }
                recievedIntent.add(selectedApartment.getText().toString());
            }
        });

        nextCheckoutButton = findViewById(R.id.odukaleCheckoutButton);

        nextCheckoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OdukaleCheckoutActivity.this, OdukalePaymentActivity.class);
                intent.putExtra("checkoutKey", recievedIntent);
                startActivity(intent);
            }
        });
    }

    private void getApartmentType(ArrayList<String> dataReceived) {
        for(String item : dataReceived) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(item);
            radioButton.setId(View.generateViewId());
            radioGroup.addView(radioButton);
        }
    }
}