package lemonapps.budgetallowance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class addAllowance extends AppCompatActivity {
    Spinner time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_allowance);
        time = (Spinner)findViewById(R.id.timeSpinner);

    }
}
