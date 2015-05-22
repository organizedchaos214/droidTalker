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

public class FoodUtensils extends Activity {
	
	ImageButton help;
	ImageButton toTextToTalk;
	
	//create text-to-speech object:
    TextToSpeech ttsobject;
		
	//for the utensils-TTS:
	private Button Bowl;
	private Button Cup;
	private Button Fork;
	private Button Knife;
	private Button Napkins;
	private Button Plate;
	private Button Spoon;
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_utensils);
        
        //utensils, button ID linking:
        Bowl = (Button)findViewById(R.id.Button1);
        Cup = (Button)findViewById(R.id.Button2);
        Fork = (Button)findViewById(R.id.Button3);
        Knife = (Button)findViewById(R.id.Button4);
        Napkins = (Button)findViewById(R.id.Button5);		
        Plate = (Button)findViewById(R.id.Button6); 
        Spoon = (Button)findViewById(R.id.Button7); 
          
        
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
		String toSpeak = Bowl.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText2(View view){
		String toSpeak = Cup.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText3(View view){
		String toSpeak = Fork.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText4(View view){
		String toSpeak = Knife.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText5(View view){
		String toSpeak = Napkins.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText6(View view){
		String toSpeak = Plate.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText7(View view){
		String toSpeak = Spoon.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
}
