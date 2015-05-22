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

public class FoodOtherFoods extends Activity {
	
	ImageButton help;
	ImageButton toTextToTalk;
	
	//create text-to-speech object:
	TextToSpeech ttsobject;
		
	//for the otherfood-TTS:
	private Button Candy;
	private Button FrenchFries;
	private Button Soup;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_otherfoods);
        
        //drinks, button ID linking:
	    Candy = (Button)findViewById(R.id.Button1);
	    FrenchFries = (Button)findViewById(R.id.Button2);
	    Soup = (Button)findViewById(R.id.Button3);
        
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
		String toSpeak = Candy.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText2(View view){
		String toSpeak = FrenchFries.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText3(View view){
		String toSpeak = Soup.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
}
