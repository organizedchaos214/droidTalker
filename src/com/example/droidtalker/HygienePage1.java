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

public class HygienePage1 extends Activity {
	
	ImageButton help;
	ImageButton toTextToTalk;
	ImageButton home;
	ImageButton tasks;
	ImageButton descriptions;
	ImageButton items;
	ImageButton bodyparts;
	
	//create text to speech object
	TextToSpeech ttsobject;	
	
	//for the Sentence Starters-TTS:
	private Button I_Would_Like_To;		
	private Button Can_I;
	private Button I_Need;
	private Button I_Need_To_Wash;
	private Button Theres_No_More;
	private Button This_Is_Too;
	private Button Im_Finished;
	
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hygiene_page1);
        
        
        //sentence starter ID linking:
        I_Would_Like_To = (Button)findViewById(R.id.Button1);
        Can_I = (Button)findViewById(R.id.Button2);
        I_Need = (Button)findViewById(R.id.Button3);
        I_Need_To_Wash = (Button)findViewById(R.id.Button4);
        Theres_No_More = (Button)findViewById(R.id.Button5);
        This_Is_Too = (Button)findViewById(R.id.Button6);
        Im_Finished = (Button)findViewById(R.id.Button7);
        
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

	public void addListenerOnButton( ) {
		
		final Context context = this;
		
		//buttons:
		help = (ImageButton) findViewById(R.id.imageButton1);
		toTextToTalk = (ImageButton) findViewById(R.id.imageButton2);
		home = (ImageButton) findViewById(R.id.imageButton3);
		tasks = (ImageButton) findViewById(R.id.imageButton8);
		descriptions = (ImageButton) findViewById(R.id.imageButton6);
		items = (ImageButton) findViewById(R.id.imageButton9);
		bodyparts = (ImageButton) findViewById(R.id.imageButton7);
		
		
		
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
		
		//for home button:
		home.setOnClickListener(new OnClickListener() {
					
		@Override
		public void onClick(View arg0) {

	    Intent intent = new Intent(context, MainRegularUser.class);
                    startActivity(intent);   

		}

		});	
		
		
		//for tasks button:
		tasks.setOnClickListener(new OnClickListener() {
					
		@Override
		public void onClick(View arg0) {

	    Intent intent = new Intent(context, HygieneTasks.class);
                    startActivity(intent);   

		}

		});	
		
		//for descriptions button:
		descriptions.setOnClickListener(new OnClickListener() {
							
		@Override
		public void onClick(View arg0) {

			Intent intent = new Intent(context, HygieneDescriptions.class);
		              startActivity(intent);   

		}

		});	
		
		
		//for items button:
		items.setOnClickListener(new OnClickListener() {
					
		@Override
		public void onClick(View arg0) {

	    Intent intent = new Intent(context, HygieneItems.class);
                    startActivity(intent);   

		}

		});	
		
		
		//for bodyparts button:
		bodyparts.setOnClickListener(new OnClickListener() {
					
		@Override
		public void onClick(View arg0) {

	    Intent intent = new Intent(context, HygieneBodyParts.class);
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
	 * SpeakText calls. Used by Sentence Start Buttons
	 * in XML file:
	 */
	 public void speakText1(View view){
	      String toSpeak = I_Would_Like_To.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }

	 public void speakText2(View view){
	      String toSpeak = Can_I.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	 
	 public void speakText3(View view){
	      String toSpeak = I_Need.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	
	 public void speakText4(View view){
	      String toSpeak = I_Need_To_Wash.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	
	 public void speakText5(View view){
	      String toSpeak = Theres_No_More.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	 
	 public void speakText6(View view){
	      String toSpeak = This_Is_Too.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	 
	 public void speakText7(View view){
	      String toSpeak = Im_Finished.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
}
