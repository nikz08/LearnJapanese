package edu.ucuccs.learnjapanese;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Eating extends Activity {
	ActionBar ab;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        

        try {
        setContentView(R.layout.activity_eating);
        ab=getActionBar();
  	  ab.setDisplayHomeAsUpEnabled(true);
  	  ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F96D00"));     
  	  ab.setBackgroundDrawable(colorDrawable);
  	
       

			ListView mlistView = (ListView) findViewById(R.id.list);
			mlistView.setAdapter(new ArrayAdapter<String>(this,
			        android.R.layout.simple_list_item_1, 
			        new String[] {"Breakfast","Lunch","Dinner" ,
					"Snack" ,"Meat" ,"Beef " ,"Chicken " ,"Eggs", "Pork", "Fish", "Chopsticks", "Fork", "Napkin", "I'm full",
					"fourteen", "Fiftteen","Sixteen", "Seventeen", "Eighteen",
					"I'm Hungry", "I love this dish", "What is called this","Do you have menu in English", "What do you recommend","Vegetables", "Can i have the bill please","Take away/Take home", "This is dilicous",
//				
					}));
 
        mlistView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
              // When clicked, show a toast with the TextView text
              Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
                  Toast.LENGTH_SHORT).show();
              String sText = ((TextView) view).getText().toString();
              Intent intent = null;
              if(sText.equals("Game"))
              intent = new Intent(getBaseContext(),
						Oha.class);
              //else if(sText.equals("Help")) ..........
 
              if(intent != null)
				startActivity(intent);              
            }
          });
        } catch (Exception e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        }
        

 
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intent = new Intent(this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

}
}

