package com.example.droidtalker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


	
	
public class TapToTalkHome extends Activity {
	
	ImageButton manualTextEntry;
	ImageButton help;
	ImageButton home;
	
	ImageButton foods;
	ImageButton shopping;
	ImageButton hygiene;
	ImageButton school;

	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tap_to_talk_home);
        addListenerOnButton ( );
    }
	
	
public void addListenerOnButton() 
 	{
	 
		final Context context = this;
		
		manualTextEntry = (ImageButton) findViewById(R.id.imageButton4);
		
		help = (ImageButton) findViewById(R.id.imageButton1);
		
		foods = (ImageButton) findViewById(R.id.imageButton2);
		
		home = (ImageButton) findViewById(R.id.imageButton6);
 
		hygiene = (ImageButton) findViewById(R.id.imageButton3);
		
		school = (ImageButton) findViewById(R.id.imageButton7);
		
		shopping = (ImageButton) findViewById(R.id.imageButton8);
		
		//For tap-to-talk (category) menu:
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
				
		
		//For food/drink button:
		foods.setOnClickListener(new OnClickListener( ) {
			 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, foodPage1.class);
                            startActivity(intent);   
 
			}
 
		});
		
		
		
		
		//For home button:
		home.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, MainRegularUser.class);
                        startActivity(intent);   

		}

	});	
		
		//for hygiene button:
		hygiene.setOnClickListener(new OnClickListener( ) {
			 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, HygienePage1.class);
                            startActivity(intent);   
 
			}
 
		});
		
		//for school button:
		school.setOnClickListener(new OnClickListener( ) {
			 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, SchoolPage1.class);
                            startActivity(intent);   
 
			}
 
		});
		
		//For shopping button:
		shopping.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, ShoppingPage1.class);
                            startActivity(intent);   
 
			}
 
		});
 	}
}
