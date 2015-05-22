package com.example.droidtalker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class UserScreen extends Activity {
	
	Button button_newUser;
	Button button_testNormalUser;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_select);
        addListenerOnButton ( );
    }
        
        /*
         * Button control
         */
        public void addListenerOnButton( ) 
        	{
        	final Context context = this;
     
    		button_newUser = (Button) findViewById(R.id.IWouldLike);
    		button_testNormalUser = (Button) findViewById(R.id.CanIHave);
     
    		
    		button_newUser.setOnClickListener(new OnClickListener() 
    			{
    			@Override
    			public void onClick(View arg0) 
    				{
    				Intent intent = new Intent(context, AddUser.class);
                    startActivity(intent);   
    				}
     
    			});
     
    		
    		
    		button_testNormalUser.setOnClickListener(new OnClickListener( ) {
    			
    			@Override
    			public void onClick(View arg0) 
    				{ 
    			    Intent intent = new Intent(context, MainRegularUser.class);
                    startActivity(intent);   
    				}
    			});
    		
        	}
     
        }
