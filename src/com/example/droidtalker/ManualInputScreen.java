package com.example.droidtalker;

import java.util.Locale;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class ManualInputScreen extends Activity {
	
	ImageButton toTaptoTalkMode;
	ImageButton help;
	
	Button clear;
	
	TextToSpeech ttsobject;
	private EditText write;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_input_screen);
        
        write = (EditText)findViewById(R.id.editText1);
        ttsobject = new TextToSpeech(getApplicationContext(),
        		new TextToSpeech.OnInitListener() {
					
					@Override
					public void onInit(int status) {
						if (status!= TextToSpeech.ERROR) {
							ttsobject.setLanguage(Locale.US);
						}
						
					}
				});
        
        addListenerOnButton ( );
        }

	public void addListenerOnButton() 
 		{
		final Context context = this;
 
		toTaptoTalkMode = (ImageButton) findViewById(R.id.imageButton1);
		help = (ImageButton) findViewById(R.id.imageButton2);
		clear = (Button) findViewById(R.id.CanIHave);
		
		//For tap-to-talk (category) menu:
		toTaptoTalkMode.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, TapToTalkHome.class);
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
		
	
		
		//For clear button:
		clear.setOnClickListener(new OnClickListener() {
					 
		@Override
		public void onClick(View arg0) {
			 // reset only by another button
            write.setText("");
		 
			}
		 
		});
		
 	}
	   @Override
	   public void onPause(){
	      if(ttsobject !=null){
	         ttsobject.stop();
	         ttsobject.shutdown();
	      }
	      super.onPause();
	   }
	
	
	 public void speakText(View view){
	      String toSpeak = write.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

	   }

}
