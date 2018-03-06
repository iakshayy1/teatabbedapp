package com.example.s528772.program7;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity implements BlackTeaFragment.BlackT,OolongTeaFragment.OolongT,ConfirmationDialog.ClearConfirmCallback{

    private static  final String TAG= "MainActivity";
    private android.support.v4.app.Fragment min;
    private android.support.v4.app.Fragment sec;
    private boolean firstShown;
    private boolean doAdd;


    double Time;
    private SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting.");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);







    }



    private void setupViewPager(ViewPager viewpager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new BlackTeaFragment(),"Black Tea");
        adapter.addFragment(new OolongTeaFragment(),"Oolong Tea");
        adapter.addFragment(new AboutMeFragment(),"About Me");
        adapter.addFragment(new TeaHistoryFragment(), "Tea History");
        adapter.addFragment(new PrepTimeFragment(),"Prep Time");
        viewpager.setAdapter(adapter);


    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.person_icon:
                Toast.makeText(getApplicationContext(), "My name is Akshay Reddy Vontari and my fav color is red", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.contact_icon:
                final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"to@email.com"});
                emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject");
                emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Text");
                this.startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public int x = 1;
    public void time(){
        EditText VolOfH20 = (EditText) findViewById(R.id.VolOfWater);
        EditText WDT = (EditText) findViewById(R.id.WgtOfDryTea);
        TextView result = (TextView) findViewById(R.id.textView);
        String s = VolOfH20.getText().toString();
        String w = WDT.getText().toString();


        if(!s.isEmpty()&&!w.isEmpty()&&!s.matches("\\s+")&&!w.matches("\\s+")){
            Double water = Double.parseDouble(s);
            Double DryT = Double.parseDouble(w);
            if (water > 0 & DryT > 0 & !water.isNaN() & !DryT.isNaN()) {
                if(x==1){
                    Time = 3* (water / DryT);

                    String T = Double.toString(Time);

                    result.setText("Time required is "+T+" Seconds");
                    x++;
                } else {
                    Time = (3* (water / DryT))/60;

                    String T = Double.toString(Time);

                    result.setText("Time required is "+T+" Minutes");
                    x--;
                }

            } else
            {

                Toast.makeText(getApplicationContext(), "Enter the number", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(getApplicationContext(), "Enter the number greater than zero", Toast.LENGTH_SHORT).show();
        }

    }


        public int x1 = 1;
        public void Otime(){
            EditText VolOfH20 = (EditText) findViewById(R.id.VolOfW);
            EditText WDT = (EditText) findViewById(R.id.WgtOfDryT);
            TextView result = (TextView) findViewById(R.id.textView2);
            String s = VolOfH20.getText().toString();
            String w = WDT.getText().toString();


            if(!s.isEmpty()&&!w.isEmpty()&&!s.matches("\\s+")&&!w.matches("\\s+")){
                Double water = Double.parseDouble(s);
                Double DryT = Double.parseDouble(w);
                if (water > 0 & DryT > 0 & !water.isNaN() & !DryT.isNaN()) {
                    if(x1==1){
                        Time = 0.66* (water / DryT);

                        String T = Double.toString(Time);

                        result.setText("Time required is "+T+" Seconds");
                        x1++;
                    } else {
                        Time = (0.66* (water / DryT))/60;

                        String T = Double.toString(Time);

                        result.setText("Time required is "+T+" Minutes");
                        x1--;
                    }

                } else
                {

                    Toast.makeText(getApplicationContext(), "Enter the number", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(getApplicationContext(), "Enter the number greater than zero", Toast.LENGTH_SHORT).show();
            }
        }


    public void calculate(){
        EditText VolOfH20 = (EditText) findViewById(R.id.VolOfWater);
        EditText WDT = (EditText) findViewById(R.id.WgtOfDryTea);
        TextView result = (TextView) findViewById(R.id.textView);
        String s = VolOfH20.getText().toString();
        String w = WDT.getText().toString();


        if(!s.isEmpty()&&!w.isEmpty()&&!s.matches("\\s+")&&!w.matches("\\s+")){
            Double water = Double.parseDouble(s);
            Double DryT = Double.parseDouble(w);
            if (water > 0 & DryT > 0 & !water.isNaN() & !DryT.isNaN()) {
                 Time = 3* (water / DryT);

                String T = Double.toString(Time);

                result.setText("Time required is "+T+" Seconds");
            } else
            {

                Toast.makeText(getApplicationContext(), "Enter the number", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(getApplicationContext(), "Enter the number greater than zero", Toast.LENGTH_SHORT).show();
        }

    }

    public void cal(){
        EditText VolOfH20 = (EditText) findViewById(R.id.VolOfW);
        EditText WDT = (EditText) findViewById(R.id.WgtOfDryT);
        TextView result = (TextView) findViewById(R.id.textView2);
        String s = VolOfH20.getText().toString();
        String w = WDT.getText().toString();

        if(!s.isEmpty()&&!w.isEmpty()&&!s.contains("\\s+")&&!w.contains("\\s+")){
            Double water = Double.parseDouble(s);
            Double DryT = Double.parseDouble(w);
            if (water > 0 & DryT > 0 & !water.isNaN() & !DryT.isNaN()) {
                Double Time = 0.66* (water / DryT);
                String T = Double.toString(Time);
                result.setText("Time required is "+T+" Seconds");
            } else
            {

                Toast.makeText(getApplicationContext(), "Enter the number", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(getApplicationContext(), "Enter the number greater than zero", Toast.LENGTH_SHORT).show();
        }
    }

//    public void clear(){
//        EditText VolOfH20 = (EditText) findViewById(R.id.VolOfWater);
//        EditText WDT = (EditText) findViewById(R.id.WgtOfDryTea);
//        TextView result = (TextView) findViewById(R.id.textView);
//        VolOfH20.setText("");
//        WDT.setText("");
//        result.setText("");
//    }

    public void clr(){
        EditText VolOfH20 = (EditText) findViewById(R.id.VolOfW);
        EditText WDT = (EditText) findViewById(R.id.WgtOfDryT);
        TextView result = (TextView) findViewById(R.id.textView2);
        VolOfH20.setText("");
        WDT.setText("");
        result.setText("");
    }


    public void calCoffee(View view){

            EditText VolOfH20 = (EditText) findViewById(R.id.editText);
            EditText WDT = (EditText) findViewById(R.id.editText2);
            TextView result = (TextView) findViewById(R.id.textView14);
            String s = VolOfH20.getText().toString();
            String w = WDT.getText().toString();


            if(!s.isEmpty()&&!w.isEmpty()&&!s.matches("\\s+")&&!w.matches("\\s+")){
                Double water = Double.parseDouble(s);
                Double coffee = Double.parseDouble(w);
                if (water > 0 & coffee > 0 & !water.isNaN() & !coffee.isNaN()) {
                    Time = 8/3* (water / coffee);

                    String T = Double.toString(Time);

                    Toast.makeText(getApplicationContext(),"Time required for preparing coffee is "+T+" seconds",Toast.LENGTH_SHORT).show();
                } else
                {

                    Toast.makeText(getApplicationContext(), "Enter the number", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(getApplicationContext(), "Enter the number greater than zero", Toast.LENGTH_SHORT).show();
            }

        }

        public void calChai(View view){
            EditText VolOfH20 = (EditText) findViewById(R.id.editText3);
            EditText WDT = (EditText) findViewById(R.id.editText4);
            TextView result = (TextView) findViewById(R.id.textView17);
            String s = VolOfH20.getText().toString();
            String w = WDT.getText().toString();


            if(!s.isEmpty()&&!w.isEmpty()&&!s.matches("\\s+")&&!w.matches("\\s+")){
                Double water = Double.parseDouble(s);
                Double chai = Double.parseDouble(w);
                if (water > 0 & chai > 0 & !water.isNaN() & !chai.isNaN()) {
                    Time = 10* (water / chai);

                    String T = Double.toString(Time);

                    Toast.makeText(getApplicationContext(),"Time required for preparing chai is "+T+" seconds",Toast.LENGTH_SHORT).show();
                } else
                {

                    Toast.makeText(getApplicationContext(), "Enter the number", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(getApplicationContext(), "Enter the number greater than zero", Toast.LENGTH_SHORT).show();
            }

        }

        public void calIcedTea(View view){
            EditText VolOfH20 = (EditText) findViewById(R.id.editText5);
            EditText WDT = (EditText) findViewById(R.id.editText6);
            TextView result = (TextView) findViewById(R.id.textView18);
            String s = VolOfH20.getText().toString();
            String w = WDT.getText().toString();


            if(!s.isEmpty()&&!w.isEmpty()&&!s.matches("\\s+")&&!w.matches("\\s+")){
                Double water = Double.parseDouble(s);
                Double Icedtea = Double.parseDouble(w);
                if (water > 0 & Icedtea > 0 & !water.isNaN() & !Icedtea.isNaN()) {
                    Time = 18* (water / Icedtea);

                    String T = Double.toString(Time);

                    Toast.makeText(getApplicationContext(),"Time required for preparing icedTea is "+T+" seconds",Toast.LENGTH_SHORT).show();
                } else
                {

                    Toast.makeText(getApplicationContext(), "Enter the number", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(getApplicationContext(), "Enter the number greater than zero", Toast.LENGTH_SHORT).show();
            }

        }

    @Override
    public void setCount() {
        EditText VolOfH20 = (EditText) findViewById(R.id.VolOfWater);
        EditText WDT = (EditText) findViewById(R.id.WgtOfDryTea);
        TextView result = (TextView) findViewById(R.id.textView);
        VolOfH20.setText("");
        WDT.setText("");
        result.setText("");
    }
}












