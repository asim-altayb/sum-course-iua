package ha3k.asim.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText n1 ;
    TextView tvresult;
    EditText n2;
    Button sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvresult = (TextView) findViewById(R.id.tvres);
        n1 = (EditText) findViewById(R.id.etn1);
        n2 = (EditText) findViewById(R.id.etn2);
        sum = (Button) findViewById(R.id.btnsum);


        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 = Integer.parseInt(n1.getText().toString());

                int num2 = Integer.parseInt(n2.getText().toString());

                int s= num1 + num2;



                tvresult.setText(Integer.toString(s));

                Toast.makeText(MainActivity.this , " operation sum is completed!",Toast.LENGTH_LONG).show();

            }
        });

    }
}

































/*
        //find the elements
        res= (TextView) findViewById(R.id.restv);
        n1=(EditText) findViewById(R.id.etn1);
        n2=(EditText) findViewById(R.id.etn2);
        sum=(Button) findViewById(R.id.sumbtn);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n1.getText().toString().isEmpty() || n2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "YOU MUST ENTER CORRECT NUMBERS !", Toast.LENGTH_LONG).show();
                }
                else {
                    String result;
                    int num1 = Integer.parseInt(n1.getText().toString());
                    int num2 = Integer.parseInt(n2.getText().toString());
                    result = Integer.toString(num1 + num2);

                    res.setText(result);
                }
            }
        });*/