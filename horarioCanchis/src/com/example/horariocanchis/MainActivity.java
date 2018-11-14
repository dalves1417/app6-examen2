package com.example.horariocanchis;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void leg(View View){
    	Toast.makeText(getApplicationContext(), "2 Horas", Toast.LENGTH_LONG).show();
    }
    public void empre(View View){
    	Toast.makeText(getApplicationContext(), "3 Horas", Toast.LENGTH_LONG).show();
    }
    public void lide(View View){
    	Toast.makeText(getApplicationContext(), "2 Horas", Toast.LENGTH_LONG).show();
    }
    public void taller(View View){
    	Toast.makeText(getApplicationContext(), "6 Horas", Toast.LENGTH_LONG).show();
    }
    public void comer(View View){
    	Toast.makeText(getApplicationContext(), "2 Horas", Toast.LENGTH_LONG).show();
    }
    public void pro(View View){
    	Toast.makeText(getApplicationContext(), "5 Horas", Toast.LENGTH_LONG).show();
    }
    public void apli(View View){
    	Toast.makeText(getApplicationContext(), "4 Horas", Toast.LENGTH_LONG).show();
    }
}
