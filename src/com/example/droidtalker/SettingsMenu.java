package com.example.droidtalker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class SettingsMenu extends Activity {
	
	ImageButton help;
	ImageButton home;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_menu);
        addListenerOnButton ( );
    }

	public void addListenerOnButton( ) 
		{
		final Context context = this;
	
		//buttons:
		help = (ImageButton) findViewById(R.id.imageButton1);
		home = (ImageButton) findViewById(R.id.imageButton2);
		
		
		//For help button:
		help.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
	
			    Intent intent = new Intent(context, helpScreen.class);
	                        startActivity(intent);   
	
			}
	
		});
		
		
		
		//for home button:
		home.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

	    Intent intent = new Intent(context, MainRegularUser.class);
                    startActivity(intent);   

		}

		});	
		
		

		}
}
