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

public class FoodDrinks extends Activity {
	
	ImageButton help;
	ImageButton toTextToTalk;
	
	//create text-to-speech object:
	TextToSpeech ttsobject;
		
	//for the vegetable-TTS:
	private Button Coffee;
	private Button Juice;
	private Button Milk;
	private Button Soda;
	private Button Tea;
	private Button Water;
	
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_drinks);
        
      //drinks, button ID linking:
      Coffee = (Button)findViewById(R.id.Button1);
      Juice = (Button)findViewById(R.id.Button2);
      Milk = (Button)findViewById(R.id.Button3);
      Soda = (Button)findViewById(R.id.Button4);
      Tea = (Button)findViewById(R.id.Button5);		
      Water = (Button)findViewById(R.id.Button6); 
        
      
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
		String toSpeak = Coffee.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText2(View view){
		String toSpeak = Juice.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText3(View view){
		String toSpeak = Milk.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText4(View view){
		String toSpeak = Soda.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText5(View view){
		String toSpeak = Tea.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText6(View view){
		String toSpeak = Water.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
}