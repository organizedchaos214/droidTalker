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

public class SchoolClasses extends Activity {
	
	ImageButton help;
	ImageButton toTextToTalk;
	
	//create text-to-speech object:
	TextToSpeech ttsobject;
		
	//for the descriptions-TTS:
	private Button Art;
	private Button English;
	private Button Gym;
	private Button History;
	private Button Lunch;
	private Button Math;
	private Button Music;
	private Button Science;
	private Button Writing;


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.school_classes);
        
        //Descriptions, button ID linking:
        Art = (Button)findViewById(R.id.Button1);
        English = (Button)findViewById(R.id.Button2);
        Gym = (Button)findViewById(R.id.Button3);
        History = (Button)findViewById(R.id.Button4);
        Lunch = (Button)findViewById(R.id.Button5);
        Math = (Button)findViewById(R.id.Button6);
        Music = (Button)findViewById(R.id.Button7);
        Science = (Button)findViewById(R.id.Button8);
        Writing = (Button)findViewById(R.id.Button9);
        
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
		String toSpeak = Art.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText2(View view){
		String toSpeak = English.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText3(View view){
		String toSpeak = Gym.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText4(View view){
		String toSpeak = History.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText5(View view){
		String toSpeak = Lunch.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText6(View view){
		String toSpeak = Math.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText7(View view){
		String toSpeak = Music.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText8(View view){
		String toSpeak = Science.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText9(View view){
		String toSpeak = Writing.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}


}
