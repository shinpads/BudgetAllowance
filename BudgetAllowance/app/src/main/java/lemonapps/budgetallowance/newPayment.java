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
        import java.util.List;

public class newPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_payment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<Payment> pastPayments = new ArrayList<Payment>();
        pastPayments.add(new Payment(20.0, "12/27/2016", "Test Payment"));
        loadPastPayments(pastPayments);
    }

    public void loadPastPayments(List<Payment> past) {
        LinearLayout paymentList = (LinearLayout) findViewById(R.id.pastPaymentsLayout);
        for (Payment pay : past) {
            TextView element = new TextView(this);
            element.setText(String.valueOf(pay.value));
            paymentList.addView(element);
        }
    }
}
