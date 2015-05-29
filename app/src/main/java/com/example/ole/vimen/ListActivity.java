package com.example.ole.vimen;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void bafogclick (View w){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Bafoeg gibt's beim Amt")
                .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();
        alert.show();

        }

    public void studclick (View w) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Der Studentenausweis wird dir normalerweise per Post zugeschickt!")
                .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();
        alert.show();
    }

    public void ITMZclick (View w) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Dein ITMZ-Account kannst du dir im KZH freischalten lassen!")
                .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();
        alert.show();
    }

    public void wohnungclick (View w) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Melde dich am Besten bei dir WIRO an!")
                .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();
        alert.show();
    }

    public void umclick (View w) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Melde dich dazu einfach beim Einwohnermeldeamt am Neuen Markt!")
                .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();
        alert.show();
    }

    public void mentclick (View w) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Schon fuer das Mentoring angemeldet?")
                .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();
        alert.show();
    }

    public void stundenplanclick (View w) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Den Studenplan kannst du beim LSF nachgucken. Du bekommst ihn aber auch in der Ersti-Woche!")
                .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();
        alert.show();
    }

    public void studIPclick (View w) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Lerne mit dem StudIP umzugehen!")
                .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();
        alert.show();
    }



        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list, menu);
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
