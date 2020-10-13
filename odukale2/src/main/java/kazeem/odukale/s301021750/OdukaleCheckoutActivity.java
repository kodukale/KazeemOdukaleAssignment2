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

import java.util.ArrayList;

public class OdukaleCheckoutActivity extends AppCompatActivity {

    ArrayList<String> recievedIntent;
    RadioGroup radioGroup;
    Button nextCheckoutButton;
    ArrayList<String> checkoutDetails = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odukale_checkout);
        recievedIntent = getIntent().getStringArrayListExtra("selectedApt");
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
                    checkoutDetails.add("Credit Card");
                } else if (rbDC.isChecked()) {
                    checkoutDetails.add("Debit Card");
                }
                else { }
            }
        });

        //--- Apartment option RadioButton---
        final RadioGroup radioGroupSelectedApt = findViewById(R.id.odukaleRadioGroup);
        radioGroupSelectedApt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedApartment = findViewById(checkedId);
                checkoutDetails.add(selectedApartment.getText().toString());
            }
        });

        nextCheckoutButton = findViewById(R.id.odukaleCheckoutButton);

        nextCheckoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OdukaleCheckoutActivity.this, OdukalePaymentActivity.class);
                intent.putExtra("checkoutKey", checkoutDetails);
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