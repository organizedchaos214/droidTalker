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

public class ShoppingClothes extends Activity {
	
	ImageButton help;
	ImageButton toTextToTalk;
	
	//create text-to-speech object:
	TextToSpeech ttsobject;
	
	//for the colors-TTS:
	private Button DressPants;
	private Button Flannel;
	private Button Hoody;
	private Button Jacket;
	private Button Jeans;
	private Button Pajamas;
	private Button Pants;
	private Button Shirt;
	private Button Shorts;
	private Button Sweater;
	private Button TShirt;
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_clothes);
        
        //Colors, button ID linking:
        DressPants = (Button)findViewById(R.id.Button1);
        Flannel = (Button)findViewById(R.id.Button2);
        Hoody = (Button)findViewById(R.id.Button3);
        Jacket = (Button)findViewById(R.id.Button4);
        Jeans = (Button)findViewById(R.id.Button5);
        Pajamas = (Button)findViewById(R.id.Button6);
        Pants = (Button)findViewById(R.id.Button7);
        Shirt = (Button)findViewById(R.id.Button8);
        Shorts = (Button)findViewById(R.id.Button9);
        Sweater = (Button)findViewById(R.id.Button10);
        TShirt = (Button)findViewById(R.id.Button11);
     
        
        
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
		String toSpeak = DressPants.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText2(View view){
		String toSpeak = Flannel.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText3(View view){
		String toSpeak = Hoody.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText4(View view){
		String toSpeak = Jacket.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText5(View view){
		String toSpeak = Jeans.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}

	public void speakText6(View view){
		String toSpeak = Pajamas.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText7(View view){
		String toSpeak = Pants.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText8(View view){
		String toSpeak = Shirt.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText9(View view){
		String toSpeak = Shorts.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText10(View view){
		String toSpeak = Sweater.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}	
	
	public void speakText11(View view){
		String toSpeak = TShirt.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}		
	
	
	


}
