package lemonapps.budgetallowance;

        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.widget.LinearLayout;
        import android.widget.TextView;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

//THIS ACTUALLY LISTS PAYMENTS
public class newPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_payment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        List<Payment> pastPayments = new ArrayList<Payment>();
        pastPayments = MainActivity.payments;
        loadPastPayments(pastPayments);
    }

    public void loadPastPayments(List<Payment> past) {
        LinearLayout paymentList = (LinearLayout) findViewById(R.id.pastPaymentsLayout);
        Collections.reverse(past);
        for (Payment pay : past) {
            TextView element = new TextView(this);
            element.setText("$"+String.valueOf(pay.value));
            element.setTextSize(30);
            paymentList.addView(element);
            TextView element2 = new TextView(this);
            element2.setText(String.valueOf(pay.date) + " " + String.valueOf(pay.desc));
            element2.setTextSize(10);
            paymentList.addView(element2);
        }
    }
}
