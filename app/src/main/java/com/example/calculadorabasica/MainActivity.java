package com.example.calculadorabasica;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNumero1, etNumero2;
    Button btnSuma, btnResta, btnMultiplicacion, btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Asegúrate que esto esté apuntando a activity_main o content_main

        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnDivision = findViewById(R.id.btnDivision);

        btnSuma.setOnClickListener(v -> operar("+"));
        btnResta.setOnClickListener(v -> operar("-"));
        btnMultiplicacion.setOnClickListener(v -> operar("*"));
        btnDivision.setOnClickListener(v -> operar("/"));
    }

    private void operar(String operacion) {
        String texto1 = etNumero1.getText().toString();
        String texto2 = etNumero2.getText().toString();

        if (texto1.isEmpty() || texto2.isEmpty()) {
            Toast.makeText(this, "Por favor ingresa ambos números", Toast.LENGTH_SHORT).show();
            return;
        }

        double num1 = Double.parseDouble(texto1);
        double num2 = Double.parseDouble(texto2);
        double resultado = 0;

        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_SHORT).show();
                    return;
                }
                resultado = num1 / num2;
                break;
        }

        Toast.makeText(this, "Resultado: " + resultado, Toast.LENGTH_LONG).show();
    }
}