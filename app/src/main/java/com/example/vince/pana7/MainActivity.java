package com.example.vince.pana7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView1);

        String groceries = getString(R.string.groceries_name);
        String utilities = getString(R.string.utilities_name);
        String transportation = getString(R.string.transportation_name);
        String eatingout = getString(R.string.eating_out_name);
        String entertainment = getString(R.string.entertainment_name);



        HashMap<String, String> budgetList = new HashMap<>();
        budgetList.put(groceries, groceryAmount());
        budgetList.put(utilities, utilitiesAmount());
        budgetList.put(transportation, transportationAmount());
        budgetList.put(entertainment, entertainmentAmount());
        budgetList.put(eatingout, eatingoutAmount());



        List<HashMap<String, String>> listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.list_items, new String[]{"First Line", "Second Line"}, new int[]{R.id.textItem, R.id.textAmount});

        Iterator it = budgetList.entrySet().iterator();
        while (it.hasNext())
        {
            HashMap<String, String> resultsMap = new HashMap<>();
            resultsMap.toString();
            Map.Entry pair = (Map.Entry)it.next();
            resultsMap.put("First Line", pair.getKey().toString());
            resultsMap.put("Second Line", pair.getValue().toString());
            listItems.add(resultsMap);
        }
        listView.setAdapter(adapter);
    }

    private String groceryAmount()
    {
        int groceriesAmount = 50;
        int newAmount = 50;
        int totals = groceriesAmount + newAmount;
        String totalAsString = Integer.toString(totals);
        return totalAsString;

    }

    private String transportationAmount()
    {
        int transportationAmount = 20;
        int newAmount = 4;
        int totals = transportationAmount + newAmount;
        String totalAsString = Integer.toString(totals);
        return totalAsString;
    }

    private String utilitiesAmount()
    {
        int utilitiesAmount = 504;
        int newAmount = 650;
        int totals = utilitiesAmount + newAmount;
        String totalAsString = Integer.toString(totals);
        return totalAsString;
    }

    private String entertainmentAmount()
    {
        int entertainmentAmount = 520;
        int newAmount = 23;
        int totals = entertainmentAmount + newAmount;
        String totalAsString = Integer.toString(totals);
        return totalAsString;
    }

    private String eatingoutAmount()
    {
        int eatingoutAmount = 1;
        int newAmount = 9;
        int totals = eatingoutAmount + newAmount;
        String totalAsString = Integer.toString(totals);
        return totalAsString;
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.menuitem_add:
                AddFragment addFragment = new AddFragment();
                addFragment.show(getFragmentManager(), "Add");
                return true;
            case R.id.menuitem_print:
                Toast.makeText(MainActivity.this, "Print", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    

}
