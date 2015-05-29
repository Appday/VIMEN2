package com.example.ole.vimen;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tourOnClick (View v){
        Button tourButton = (Button) v;
        startActivity(new Intent(getApplicationContext(), TourActivity.class));

    }

    public void todoliste (View w){
        Button listbutton = (Button) w;
        startActivity(new Intent(getApplicationContext(), ListActivity.class));

    }

    public void mensa (View view){
        Intent mensaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.studentenwerk-rostock.de/index.php?lang=de&mainmenue=4&submenue=47"));
        startActivity(mensaIntent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
