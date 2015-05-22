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

public class HygieneItems extends Activity {
	
	ImageButton toTextToTalk;
	ImageButton help;
	
	//create text-to-speech object:
	TextToSpeech ttsobject;
		
	//for the hygiene tasks-TTS:
	private Button Cologne;
	private Button Deodarant;
	private Button HairGel;
	private Button Lotion;
	private Button Mouthwash;
	private Button Perfume;
	private Button Shampoo;
	private Button Soap;
	private Button Tissue;
	private Button Toothpaste;
	private Button Vitamins;
	
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hygiene_items);
        
        //hygiene items, button ID linking:
        Cologne = (Button)findViewById(R.id.Button1);
        Deodarant = (Button)findViewById(R.id.Button2);
        HairGel = (Button)findViewById(R.id.Button3);
        Lotion = (Button)findViewById(R.id.Button4);
        Mouthwash = (Button)findViewById(R.id.Button5);		
        Perfume = (Button)findViewById(R.id.Button6); 
        Shampoo = (Button)findViewById(R.id.Button7); 
        Soap = (Button)findViewById(R.id.Button8);
        Tissue = (Button)findViewById(R.id.Button9); 
        Toothpaste = (Button)findViewById(R.id.Button10);
        Vitamins = (Button)findViewById(R.id.Button11);
        
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
	 * SpeakText calls for XML Buttons:
	 */
	public void speakText1(View view){
		String toSpeak = Cologne.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText2(View view){
		String toSpeak = Deodarant.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText3(View view){
		String toSpeak = HairGel.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText4(View view){
		String toSpeak = Lotion.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText5(View view){
		String toSpeak = Mouthwash.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText6(View view){
		String toSpeak = Perfume.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText7(View view){
		String toSpeak = Shampoo.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText8(View view){
		String toSpeak = Soap.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText9(View view){
		String toSpeak = Tissue.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText10(View view){
		String toSpeak = Toothpaste.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}

	public void speakText11(View view){
		String toSpeak = Vitamins.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
}
