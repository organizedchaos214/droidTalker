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
import android.widget.ImageButton;
import android.widget.Toast;

public class FoodCondiments extends Activity {


	ImageButton help;
	ImageButton toTextToTalk;
	
	//create text-to-speech object:
	TextToSpeech ttsobject;
		
	//for the vegetable-TTS:
	private Button HotSauce;
	private Button Ketchup;
	private Button Mustard;
	private Button Pepper;
	private Button Salt;
	private Button Sugar;
 
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_condiments);
        
      //drinks, button ID linking:
        HotSauce = (Button)findViewById(R.id.Button1);
        Ketchup = (Button)findViewById(R.id.Button2);
        Mustard = (Button)findViewById(R.id.Button3);
        Pepper = (Button)findViewById(R.id.Button4);
        Salt = (Button)findViewById(R.id.Button5);		
        Sugar = (Button)findViewById(R.id.Button6); 
         
        
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
	
		//buttons:
		help = (ImageButton) findViewById(R.id.imageButton1);
		toTextToTalk = (ImageButton) findViewById(R.id.imageButton3);
		
		//For help button:
		help.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
	
			    Intent intent = new Intent(context, helpScreen.class);
	                        startActivity(intent);   
	
			}
	
		});
		
		
		//For text-to-talk mode:
		toTextToTalk.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, ManualInputScreen.class);
                        startActivity(intent);   

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
	
	
	
	/*
	 * SpeakText calls for XML Buttons:
	 */
	public void speakText1(View view){
		String toSpeak = HotSauce.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText2(View view){
		String toSpeak = Ketchup.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText3(View view){
		String toSpeak = Mustard.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText4(View view){
		String toSpeak = Pepper.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText5(View view){
		String toSpeak = Salt.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText6(View view){
		String toSpeak = Sugar.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
}
