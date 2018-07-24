package com.example.ricar.ejemplodemenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //aqui se programan los botones del menu:
        switch (item.getItemId()){
            case R.id.opc1:
                Toast.makeText(getApplicationContext(),"Hola Bienvenido", Toast.LENGTH_LONG).show();
                return true;
                //con la opcion1 al hacer clic en Bienvenida me sale el mensaje "Hola Bienvenido"
            case R.id.opc2:
                finish();
                return true;
            case R.id.opc3:
                startActivity(new Intent(MainActivity.this, MainActivity.class));
                return true;
            case R.id.opc4:
                return true;
            case R.id.opc5:
                return true;
            case R.id.opc6:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);

            }


    }
}
