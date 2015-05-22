package com.example.droidtalker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainRegularUser extends Activity {
	
	ImageButton tapToTalk;
	ImageButton manualTextEntry;
	ImageButton help;
	ImageButton categorybyLocation;
	ImageButton settings;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_regular_user);
        addListenerOnButton ( );
    }
	
	
	
	 public void addListenerOnButton() 
	 	{
		 
			final Context context = this;
	 
			tapToTalk = (ImageButton) findViewById(R.id.imageButton3);
			
			manualTextEntry = (ImageButton) findViewById(R.id.imageButton2);
			
			categorybyLocation = (ImageButton) findViewById(R.id.imageButton4);
			
			help = (ImageButton) findViewById(R.id.imageButton1);
	 
			settings = (ImageButton) findViewById(R.id.imageButton5);
			//For tap-to-talk (category) menu:
			tapToTalk.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, TapToTalkHome.class);
	                            startActivity(intent);   
	 
				}
	 
			});
			
			//For manual text (predictive) mode:
			manualTextEntry.setOnClickListener(new OnClickListener() {
				 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, ManualInputScreen.class);
	                            startActivity(intent);   
	 
				}
	 
			});
			
			
			
			//For help button:
			help.setOnClickListener(new OnClickListener() {
				 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, helpScreen.class);
	                            startActivity(intent);   
	 
				}
	 
			});
			
			
			//category by Location button (GPS):
			categorybyLocation.setOnClickListener(new OnClickListener( ) {
				 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, CategorybyLocationMain.class);
	                            startActivity(intent);   
	 
				}
	 
			});
			
			
			
			//settings button:
			settings.setOnClickListener(new OnClickListener( ) {
				 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, SettingsMenu.class);
	                            startActivity(intent);   
	 
				}
	 
			});
			
		 }
}