package ifpr.aulapdmatividade1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt_num;
    private EditText txt_num2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_num = findViewById(R.id.txt_num);
        txt_num2 = findViewById(R.id.txt_num2);
        tvResultado = findViewById(R.id.tvResultado);

    }

    public void somar(View view){
        int valor1 = Integer.parseInt(txt_num.getText().toString());
        int valor2 = Integer.parseInt(txt_num2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 + valor2));
    }

    public void subtrair(View view){
        int valor1 = Integer.parseInt(txt_num.getText().toString());
        int valor2 = Integer.parseInt(txt_num2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 - valor2));
    }

    public void multiplicar(View view){
        int valor1 = Integer.parseInt(txt_num.getText().toString());
        int valor2 = Integer.parseInt(txt_num2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 * valor2));
    }

    public void dividir(View view){
        int valor1 = Integer.parseInt(txt_num.getText().toString());
        int valor2 = Integer.parseInt(txt_num2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 / valor2));
    }

}