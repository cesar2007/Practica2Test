package mx.udg.mti.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mensaEditTxt1;
    EditText mensaEditTxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClic(View view) {
        mensaEditTxt1 = findViewById(R.id.edtTxt1);
        String datosUsuario = mensaEditTxt1.getText().toString();

        mensaEditTxt2 = findViewById(R.id.edtTxtPass);
        String datosPassword = mensaEditTxt2.getText().toString();

        // Toast.makeText(this, "usuario: " + datosUsuario + " " + "password: " +
        // datosPassword, Toast.LENGTH_LONG).show();

        if (datosUsuario == "usuario" && datosPassword == "password")
        {
            Toast.makeText(this, "Ingreso correcto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, Bienvenido2.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "ingreso incorrecto", Toast.LENGTH_LONG).show();
        }
    }
}