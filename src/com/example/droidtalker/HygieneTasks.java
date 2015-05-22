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

public class HygieneTasks extends Activity {
	
	ImageButton toTextToTalk;
	ImageButton help;
	
	//create text-to-speech object:
	TextToSpeech ttsobject;
		
	//for the hygiene tasks-TTS:
	private Button BrushMyTeeth;
	private Button CutMyNails;
	private Button DoMyHair;
	private Button Floss;
	private Button GetAHaircut;
	private Button Shave;
	private Button Shower;
	private Button TakeABath;
	private Button UseTheBathroom;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hygiene_tasks);
        
        //tasks, button ID linking:
        BrushMyTeeth = (Button)findViewById(R.id.Button1);
        CutMyNails = (Button)findViewById(R.id.Button2);
        DoMyHair= (Button)findViewById(R.id.Button3);
        Floss = (Button)findViewById(R.id.Button4);
        GetAHaircut = (Button)findViewById(R.id.Button5);		
        Shave = (Button)findViewById(R.id.Button6); 
        Shower = (Button)findViewById(R.id.Button7); 
        TakeABath = (Button)findViewById(R.id.Button8); 
        UseTheBathroom = (Button)findViewById(R.id.Button9); 
          
        
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
		String toSpeak = BrushMyTeeth.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText2(View view){
		String toSpeak = CutMyNails.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText3(View view){
		String toSpeak = DoMyHair.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText4(View view){
		String toSpeak = Floss.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText5(View view){
		String toSpeak = GetAHaircut.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText6(View view){
		String toSpeak = Shave.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText7(View view){
		String toSpeak = Shower.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText8(View view){
		String toSpeak = TakeABath.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}
	
	public void speakText9(View view){
		String toSpeak = UseTheBathroom.getText().toString();
		Toast.makeText(getApplicationContext(), toSpeak, 
				Toast.LENGTH_SHORT).show();
		ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
		}

}
