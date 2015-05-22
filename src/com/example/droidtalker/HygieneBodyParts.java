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

public class HygieneBodyParts extends Activity {
	
	ImageButton toTextToTalk;
	ImageButton help;
	
	//create text-to-speech object:
	TextToSpeech ttsobject;
	
	//for the bodyParts-TTS:
	private Button MyArms;
	private Button MyBack;
	private Button MyFace;
	private Button MyFeet;
	private Button MyHair;
	private Button MyHands;
	private Button MyLegs;

		
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hygiene_bodyparts);
        
        
        //body parts, button ID linking:
        MyArms = (Button)findViewById(R.id.Button1);
        MyBack = (Button)findViewById(R.id.Button2);
        MyFace = (Button)findViewById(R.id.Button3);
        MyFeet = (Button)findViewById(R.id.Button4);
        MyHair = (Button)findViewById(R.id.Button5);
        MyHands = (Button)findViewById(R.id.Button6);		
        MyLegs = (Button)findViewById(R.id.Button7);
        
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
	
	public void addListenerOnButton ( )
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
	 * SpeakText calls. Used by buttons in XML file:
	 */
public void speakText1(View view){
	String toSpeak = MyArms.getText().toString();
	Toast.makeText(getApplicationContext(), toSpeak, 
			Toast.LENGTH_SHORT).show();
	ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	}

public void speakText2(View view){
	String toSpeak = MyBack.getText().toString();
	Toast.makeText(getApplicationContext(), toSpeak, 
			Toast.LENGTH_SHORT).show();
	ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	}

public void speakText3(View view){
	String toSpeak = MyFace.getText().toString();
	Toast.makeText(getApplicationContext(), toSpeak, 
			Toast.LENGTH_SHORT).show();
	ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	}

public void speakText4(View view){
	String toSpeak = MyFeet.getText().toString();
	Toast.makeText(getApplicationContext(), toSpeak, 
			Toast.LENGTH_SHORT).show();
	ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	}

public void speakText5(View view){
	String toSpeak = MyHair.getText().toString();
	Toast.makeText(getApplicationContext(), toSpeak, 
			Toast.LENGTH_SHORT).show();
	ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	}

public void speakText6(View view){
	String toSpeak = MyHands.getText().toString();
	Toast.makeText(getApplicationContext(), toSpeak, 
			Toast.LENGTH_SHORT).show();
	ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	}

public void speakText7(View view){
	String toSpeak = MyLegs.getText().toString();
	Toast.makeText(getApplicationContext(), toSpeak, 
			Toast.LENGTH_SHORT).show();
	ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	}
	

}
