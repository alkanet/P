package com.ebs.FlashLight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by yyh on 14-9-16.
 */
public class MainActivity extends Activity {
    WorldGen earth=new WorldGen("Earth",5973,9.78);
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setStartupWorldValue();
        setStartupScreenText();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_add:
                Intent intent_add=new Intent(this,NewPlanet.class);
                this.startActivity(intent_add);
                break;
            case R.id.menu_config:
                Intent intent_config=new Intent(this,ConfigActivity.class);
                this.startActivity(intent_config);
                break;
            case R.id.menu_travel:
                Intent intent_travel=new Intent(this,TravelActivity.class);
                this.startActivity(intent_travel);
                break;
            case R.id.menu_attack:
                Intent intent_attack=new Intent(this,AttackPlanet.class);
                this.startActivity(intent_attack);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }



    protected void setStartupWorldValue() {
        earth.setPlanetColonies(1);
        earth.setPlanetMilitary(1);
        earth.setColonyImmigration(1000);
        earth.setBaseProtection(100);
        earth.turnForceFieldOn();
    }
    protected void setStartupScreenText(){
        TextView planetNameValue=(TextView) findViewById(R.id.dataView);
        planetNameValue.setText(earth.getPlanetName());
        TextView planetMassValue=(TextView) findViewById(R.id.dataView2);
        planetMassValue.setText(String.valueOf(earth.getPlanetMass()));
        TextView planetGravityValue=(TextView) findViewById(R.id.dataView3);
        planetGravityValue.setText(String.valueOf(earth.getPlanetGravity()));

        TextView planetColoniesValue=(TextView) findViewById(R.id.dataView4);
        planetColoniesValue.setText(String.valueOf(earth.getPlanetColonies()));
        TextView planetPopulationValue=(TextView) findViewById(R.id.dataView5);
        planetPopulationValue.setText(String.valueOf(earth.getPlanetPopulation()));
        TextView planetMilitaryValue=(TextView) findViewById(R.id.dataView6);
        planetMilitaryValue.setText(String.valueOf(earth.getPlanetMilitary()));

        TextView planetBasesValue=(TextView) findViewById(R.id.dataView7);
        planetBasesValue.setText(String.valueOf(earth.getPlanetBases()));
        TextView planetForcedFieldValue=(TextView) findViewById(R.id.dataView8);
        planetForcedFieldValue.setText(String.valueOf(earth.planetProtection));


    }

}