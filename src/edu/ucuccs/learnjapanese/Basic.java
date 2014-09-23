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



public class Basic extends Activity {
	ActionBar ab;
	

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
        setContentView(R.layout.activity_basic);
        ab=getActionBar();
  	  ab.setDisplayHomeAsUpEnabled(true);
  	ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F96D00"));     
    ab.setBackgroundDrawable(colorDrawable);
	
   
       
			ListView mlistView = (ListView) findViewById(R.id.list);
			mlistView.setAdapter(new ArrayAdapter<String>(this,
			        android.R.layout.simple_list_item_1, 
			        new String[] {"Good Morning","Good Afternoon" ,"Good Evening" ,"Good Night" ,
					"Good Bye" ,"How are you" ,"I'm fine thanks" ,"My Name is...", "See you later"
					,"Nice to meet you","What about you?","Good Luck","Take Care","Can you speak in English>",
					"I can speak a litte Japanese","I'm From(Country)","How old are tou?","Im 30 years old",
					}));
		
			
			 
 
        mlistView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
              String sText = ((TextView) view).getText().toString();
            
              Intent intent = null;
              if(sText.equals("Good Morning"))
              intent = new Intent(getBaseContext(),
						Oha.class);
           else if(sText.equals("Good Afternoon"))
        	   intent = new Intent(getBaseContext(),
						Kon.class);
           else if(sText.equals("Good Evening"))
        	   intent = new Intent(getBaseContext(),
						Konban.class);
           else if(sText.equals("Good Night"))
        	   intent = new Intent(getBaseContext(),
						Oya.class);
           else if(sText.equals("Good Bye"))
        	   intent = new Intent(getBaseContext(),
						Sayo.class);
           else if(sText.equals("How are you"))
        	   intent = new Intent(getBaseContext(),
						Sayo.class);
     
     
     
     
 
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