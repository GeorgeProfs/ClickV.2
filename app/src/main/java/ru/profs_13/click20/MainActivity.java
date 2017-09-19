package ru.profs_13.click20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView2;
    Button button4;
    Button button5;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        textView2 = (TextView) findViewById(R.id.textView2);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button4:
                        textView2.setText(R.string.btn1);
                        textView2.setTextColor(0xff000000);
                        textView2.setTextSize(40);
                        break;
                    case R.id.button5:
                        textView2.setText(R.string.btn2);
                        textView2.setTextColor(0xffff0000);
                        textView2.setTextSize(15);
                        break;
                    case R.id.button6:
                        textView2.setText(R.string.btn3);
                        textView2.setTextColor(0xff0000ff);
                        textView2.setTextSize(26);
                        break;
                }
            }
        };

        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.setText(R.string.button1);
                button5.setText(R.string.button2);
                button6.setText(R.string.btn5);
            }
        });



    }
}
