package com.example.monedas_convertir;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void convertir(View vista){
    	EditText pv1 = (EditText)findViewById(R.id.editText1);
    	//convertir dolares
    	EditText pv2 = (EditText)findViewById(R.id.editText2);
    	//convertir euros
    	EditText pv3 = (EditText)findViewById(R.id.editText3);
    	//convertir a peso argentino
    	EditText pv4 = (EditText)findViewById(R.id.editText4);
    	//convertir a peso chileno
    	EditText pv5 = (EditText)findViewById(R.id.editText5);
    	//convertir a real brasileño
    	EditText pv6 = (EditText)findViewById(R.id.editText6);
    	//convertir a peso colombaiano
    	EditText pv7 = (EditText)findViewById(R.id.editText7);
    	
    	String sv1 = pv1.getText().toString();
    	int v1 = Integer.parseInt(sv1);
    	
    	//convertir dolares
    	double c = v1 * 0.1404;
    	//convertir euros
    	double e = v1 * 0.1406;
    	//convertir a peso argentino
    	double a = v1 * 19.3082;
    	//convertir a peso chileno
    	double ch = v1 * 125.765;
    	//convertir a real brasileño
    	double b = v1 * 0.71;
    	//convertir a peso colombiano
    	double co = v1 * 615.838;
    	
    	pv2.setText(c + "");
    	pv3.setText(e + "");
    	pv4.setText(a + "");
    	pv5.setText(ch + "");
    	pv6.setText(b + "");
    	pv7.setText(co + "");
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
