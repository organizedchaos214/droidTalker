package com.example.droidtalker;


import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {

	ImageButton button;
	
	TextToSpeech ttsobj;		//create tts object
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton ( );
        
   
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
//    /*
//     * Set Background to something decent:
//     */
//    public void setActivityBackgroundColor(int color) {
//        View view = this.getWindow().getDecorView();
//        view.setBackgroundColor(color);
//    }

    /*
     * Button control
     */
    public void addListenerOnButton() {
 
		final Context context = this;
 
		button = (ImageButton) findViewById(R.id.imageButton1);
 
		button.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, MainRegularUser.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}
 

}
