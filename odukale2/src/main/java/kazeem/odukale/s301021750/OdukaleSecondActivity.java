package kazeem.odukale.s301021750;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class OdukaleSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odukale_second);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    //
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.odukaleAppartment:
                intent = new Intent(this, OdukaleApartmentActivity.class);
                startActivity(intent);
                break;

            case R.id.odukaleDetachedHomes:
                intent = new Intent(this, OdukaleDetachedActivity.class);
                startActivity(intent);
                break;

            case R.id.odukaleSemiDetached:
                intent = new Intent(this, OdukaleSemiDetachedActivity.class);
                startActivity(intent);
                break;

            case R.id.odukaleCondominium:
                intent = new Intent(this, OdukaleCondominiumActivity.class);
                startActivity(intent);
                break;
            case R.id.odukaleTownHouse:
                intent = new Intent(this, OdukaleTownhouseActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        return true;
    }
}