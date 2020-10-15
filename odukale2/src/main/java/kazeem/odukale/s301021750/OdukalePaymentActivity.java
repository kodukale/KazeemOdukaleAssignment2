package kazeem.odukale.s301021750;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class OdukalePaymentActivity extends AppCompatActivity {

    ArrayList<String> outputIntent;
    Button paymentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odukale_payment);

        outputIntent = (ArrayList<String>) getIntent().getSerializableExtra("checkoutKey");
        EditText fullnameEditText = findViewById(R.id.OdukaleFullname);
        EditText cardNumberEditText = findViewById(R.id.OdukaleCardNumber);
        EditText ccvEditText = findViewById(R.id.OdukaleCCV);
        final Spinner foodSpinner = findViewById(R.id.OdukaleFavoriteFood);
        TextView foodSpinnerText = (TextView) foodSpinner.getSelectedView();
        final Spinner sportSpinner = findViewById(R.id.OdukaleFavoriteSport);
        TextView sportSpinnerText = (TextView) sportSpinner.getSelectedView();
        outputIntent.add(foodSpinnerText.getText().toString());
        outputIntent.add(fullnameEditText.getText().toString());
        outputIntent.add(cardNumberEditText.getText().toString());
        outputIntent.add(ccvEditText.getText().toString());
        outputIntent.add(sportSpinnerText.getText().toString());

        paymentButton = findViewById(R.id.odukalePaymentSubmitButton);

        paymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OdukalePaymentActivity.this, OdukaleOutputActivity.class);
                intent.putExtra("paymentKey", outputIntent);
                startActivity(intent);
            }
        });
    }
}