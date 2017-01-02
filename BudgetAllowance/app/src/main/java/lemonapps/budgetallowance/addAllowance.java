package lemonapps.budgetallowance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class addAllowance extends AppCompatActivity {
    Spinner allowanceOptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_allowance);

        //Setting up allowance time spinner
        allowanceOptions = (Spinner) findViewById(R.id.allowanceTime);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.allowanceTimeOptions,android.R.layout.simple_dropdown_item_1line);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        allowanceOptions.setAdapter(adapter);
    }


}
