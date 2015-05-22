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

public class foodVegetables extends Activity {
	
	ImageButton help;
	ImageButton toTextToTalk;
	
//	//for the veg button creation:
//	Button broccolli;
//	Button carrots;
//	Button corn;
//	Button greenBeans;
//	Button peas;
//	Button squash;
//	Button tomatoes;
//	Button yams;
	
	//create text-to-speech object:
	TextToSpeech ttsobject;
	
	//for the vegetable-TTS:
	private Button Broccolli;
	private Button Carrots;
	private Button Corn;
	private Button GreenBeans;
	private Button Peas;
	private Button Squash;
	private Button Tomatoes;
	private Button Yams;
	
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_vegetables);
        
        //vegetable, button ID linking:
        Broccolli = (Button)findViewById(R.id.Button1);
        Carrots = (Button)findViewById(R.id.Button2);
        Corn = (Button)findViewById(R.id.Button3);
        GreenBeans = (Button)findViewById(R.id.Button4);
        Peas = (Button)findViewById(R.id.Button5);		
        Squash = (Button)findViewById(R.id.Button6);
        Tomatoes = (Button)findViewById(R.id.Button7);
        Yams = (Button)findViewById(R.id.Button8);
        
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
	toTextToTalk = (ImageButton) findViewById(R.id.imageButton2);
	


	//For help button:
	help.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, helpScreen.class);
                        startActivity(intent);   

		}

	});
	
	
	
	//For text-to-talk button:
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
		String toSpeak = Broccolli.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	
	public void speakText2(View view){
		String toSpeak = Carrots.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}

	public void speakText3(View view){
		String toSpeak = Corn.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText4(View view){
		String toSpeak = GreenBeans.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText5(View view){
		String toSpeak = Peas.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText6(View view){
		String toSpeak = Squash.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText7(View view){
		String toSpeak = Tomatoes.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText8(View view){
		String toSpeak = Yams.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
}
