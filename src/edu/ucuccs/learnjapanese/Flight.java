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

public class Flight extends Activity {
	ActionBar ab;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     
        try {
        setContentView(R.layout.activity_flight);
        ab=getActionBar();
    	  ab.setDisplayHomeAsUpEnabled(true);
    	  ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F96D00"));     
    	  ab.setBackgroundDrawable(colorDrawable);
    	
       

			ListView mlistView = (ListView) findViewById(R.id.list);
			mlistView.setAdapter(new ArrayAdapter<String>(this,
			        android.R.layout.simple_list_item_1, 
			        new String[] {"To Tokyo, please. Please go to Tokyo!","go to","go" ,
					"to" ,"the airport/(Narita)" ,"This Place " ,"To this place go,please " ,"Here you are", "Ok Thanks", "Take Care have a nice trip.", "Where is the train station," ,
					"The train is...", "...where is it?", "It's that way.",
					"(a ticket) to Kyoto", "two of them/twice","How much is it?", "One way or return?", "First or second class?",
					"10,000 Yen", "That's 10,000 Yen.",
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
