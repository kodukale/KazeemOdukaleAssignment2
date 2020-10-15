package kazeem.odukale.s301021750;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class OdukaleOutputActivity extends AppCompatActivity {

    ArrayList<String> outputDataIntent = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odukale_output);

        outputDataIntent = (ArrayList<String>) getIntent().getSerializableExtra("paymentKey");
        TextView paymentTypeTextView = findViewById(R.id.OdukalePaymentTypeOutput);
        TextView fullnameTextView = findViewById(R.id.OdukaleFullnameOutput);
        TextView addrAndPriceTextView = findViewById(R.id.OdukaleAddrOutput);
        TextView cardNumberTextView = findViewById(R.id.OdukaleCreditCardOutput);
        TextView CCVtextView = findViewById(R.id.OdukaleCCVOutput);
        TextView sportTextView = findViewById(R.id.OdukaleSportOutput);
        TextView foodTextView = findViewById(R.id.OdukaleFoodOutput);

        paymentTypeTextView.setText(outputDataIntent.get(0));
        addrAndPriceTextView.setText(outputDataIntent.get(1));
        foodTextView.setText(outputDataIntent.get(2));
        fullnameTextView.setText(outputDataIntent.get(3));
        cardNumberTextView.setText(outputDataIntent.get(4));
        CCVtextView.setText(outputDataIntent.get(5));
        sportTextView.setText(outputDataIntent.get(6));
    }
}