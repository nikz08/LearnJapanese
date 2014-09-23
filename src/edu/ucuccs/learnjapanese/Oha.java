package edu.ucuccs.learnjapanese;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Oha extends Activity {
	ActionBar ab;
	MediaPlayer m;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_oha);
		   ab=getActionBar();
		   ab.setDisplayHomeAsUpEnabled(true);
		   ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F96D00"));     
	       ab.setBackgroundDrawable(colorDrawable);
	       
	       
		
		
	}
	

	       
	
	public void clickPlay(View v){
    	m = MediaPlayer.create(this, R.raw.oha);
    	m.start();
    	
	}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intent = new Intent(this,Basic.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
