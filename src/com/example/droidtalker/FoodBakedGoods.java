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

public class FoodBakedGoods extends Activity {
	
	ImageButton toTextToTalk;
	ImageButton help;
	
	//create text-to-speech object:
	TextToSpeech ttsobject;
		
	//for the baked goods-TTS:
	private Button Bagels;
	private Button Bread;
	private Button Cake;
	private Button Donuts;
	private Button Muffins;
	private Button Pie;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_baked_goods);
        
        //baked goods, button ID linking:
        Bagels = (Button)findViewById(R.id.Button1);
        Bread = (Button)findViewById(R.id.Button2);
        Cake = (Button)findViewById(R.id.Button3);
        Donuts = (Button)findViewById(R.id.Button4);
        Muffins = (Button)findViewById(R.id.Button5);
        Pie = (Button)findViewById(R.id.Button6);
        
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
		String toSpeak = Bagels.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText2(View view){
		String toSpeak = Bread.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText3(View view){
		String toSpeak = Cake.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText4(View view){
		String toSpeak = Donuts.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText5(View view){
		String toSpeak = Muffins.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	
	public void speakText6(View view){
		String toSpeak = Pie.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	

}
