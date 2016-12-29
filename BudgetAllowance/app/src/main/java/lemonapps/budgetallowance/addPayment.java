package lemonapps.budgetallowance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//THIS ACTIVITY IS TO ADD A PAYMENT
public class addPayment extends AppCompatActivity {
    EditText txtValue;
    EditText txtDesc;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_payment);
        btnAdd = (Button) findViewById(R.id.btnAddPayment);
        txtValue = (EditText) findViewById(R.id.paymentValue);
        txtDesc = (EditText) findViewById(R.id.paymentDesc);
        if (btnAdd != null) {
            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AddPayment();
                }
            });
        }
    }

    private void AddPayment() {
        Double value = 0.0;
        String desc = "";
        String date = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
        value = Double.parseDouble(txtValue.getText().toString());
        desc = txtDesc.getText().toString();
        MainActivity.payments.add(new Payment(value,date,desc));
        finish();

    }
}
