package demo.fizz.fizztestutilsdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import demo.fizz.fizztest_utils.FizzTestUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView testTv = findViewById(R.id.main_activity_test_tv);
        testTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = MainActivity.this;
                String msg = testTv.getText().toString().trim();
                FizzTestUtils.testToast(context, msg);
            }
        });

    }

}
