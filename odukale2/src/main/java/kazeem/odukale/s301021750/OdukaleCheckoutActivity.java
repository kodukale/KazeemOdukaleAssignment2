package kazeem.odukale.s301021750;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ViewUtils;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class OdukaleCheckoutActivity extends AppCompatActivity {

    ArrayList<String> recievedIntent;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odukale_checkout);
        recievedIntent = getIntent().getStringArrayListExtra("selectedApt");
        radioGroup = findViewById(R.id.odukaleRadioGroup);
        getApartmentType(recievedIntent);
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