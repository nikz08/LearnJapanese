package edu.ucuccs.learnjapanese;


import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {
	ImageView imageView1;
	ImageView imageView2;
	ImageView imageView3;
	ImageView imageView4;
	ImageView imageView5;
	ImageView imageView6;
	ImageView imageView7;
	ImageView imageView8;
	ImageView imageView9;
	ImageView imageView10;
	ImageView imageView11;
	ImageView imageView12;
	ActionBar ab;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1=(ImageView)findViewById(R.id.imageView1);
        imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView3=(ImageView)findViewById(R.id.imageView3);
        imageView4=(ImageView)findViewById(R.id.imageView4);
        imageView5=(ImageView)findViewById(R.id.imageView5);
        imageView6=(ImageView)findViewById(R.id.imageView6);
        imageView7=(ImageView)findViewById(R.id.imageView7);
        imageView8=(ImageView)findViewById(R.id.imageView8);
        imageView9=(ImageView)findViewById(R.id.imageView9);
        imageView10=(ImageView)findViewById(R.id.imageView10);
        imageView11=(ImageView)findViewById(R.id.imageView11);
        imageView12=(ImageView)findViewById(R.id.imageView12);
        
       
        ab=getActionBar();
        ab.setSubtitle("Nihongo Phrasebook");
        ab.setSubtitle(Html.fromHtml("<font color=\"white\">" + getString(R.string.drawer_open) + "</font>"));
        ab.setDisplayShowHomeEnabled(true);
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F96C00"));     
        ab.setBackgroundDrawable(colorDrawable);
        getActionBar().setTitle(Html.fromHtml("<font color=\"white\">" + getString(R.string.app_name) + "</font>"));
       
        imageView1.setOnClickListener(new OnClickListener(){
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent gotoOut=new Intent(MainActivity.this,Basic.class);
			startActivity(gotoOut);
			
		}
		
		
		
	});
	
        imageView2.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			
			Intent gotoLevelOne1= new Intent(MainActivity.this,People.class);
			startActivity(gotoLevelOne1);
		}
    	
    	
    });
        imageView3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				Intent gotoLevelOne1= new Intent(MainActivity.this,Numbers.class);
				startActivity(gotoLevelOne1);
			}
	    	
	    	
	    });
        
        imageView4.setOnClickListener(new OnClickListener(){
    		
    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			
    			Intent gotoOut=new Intent(MainActivity.this,Eating.class);
    			startActivity(gotoOut);
    			
    		}
    		
    		
    		
    	});
        
        imageView5.setOnClickListener(new OnClickListener(){
    		
    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			
    			Intent gotoOut=new Intent(MainActivity.this,Driving.class);
    			startActivity(gotoOut);
    			
    		}
    		
    		
    		
    	});
        imageView6.setOnClickListener(new OnClickListener(){
    		
    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			
    			Intent gotoOut=new Intent(MainActivity.this,Flight.class);
    			startActivity(gotoOut);
    			
    		}
    		
    		
    		
    	});
        
        imageView7.setOnClickListener(new OnClickListener(){
    		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent gotoOut=new Intent(MainActivity.this,Toilet.class);
			startActivity(gotoOut);
			
		}
		
		
		
	});
        imageView8.setOnClickListener(new OnClickListener(){
    		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent gotoOut=new Intent(MainActivity.this,Shopping.class);
			startActivity(gotoOut);
			
		}
		
		
		
	});
        imageView9.setOnClickListener(new OnClickListener(){
    		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent gotoOut=new Intent(MainActivity.this,Currency.class);
			startActivity(gotoOut);
			
		}
		
		
		
	});
      
        imageView10.setOnClickListener(new OnClickListener(){
    		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent gotoOut=new Intent(MainActivity.this,Transport.class);
			startActivity(gotoOut);
			
		}
		
		
		
	});
        imageView11.setOnClickListener(new OnClickListener(){
    		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent gotoOut=new Intent(MainActivity.this,Emergency.class);
			startActivity(gotoOut);
			
		}
		
		
		
	});
        imageView12.setOnClickListener(new OnClickListener(){
    		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent gotoOut=new Intent(MainActivity.this,Hotel.class);
			startActivity(gotoOut);
			
		}
		
		
		
	});
        
	 
	
	}
	
	}
	
	
	

	
    
    

