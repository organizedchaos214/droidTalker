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


public class SchoolPage1 extends Activity {
	
	//ImageButton Decls:
	ImageButton help;
	ImageButton home;
	ImageButton toTextToTalk;
	
	ImageButton subjects;
	ImageButton supplies;
	ImageButton descriptions;
	
	//create text to speech object
	TextToSpeech ttsobject;	
	
	//for the Sentence Starters-TTS:
	private Button I_Would_Like;		
	private Button Can_I_Have;
	private Button I_Need;
	private Button This_Is_Too;
	private Button This_Is_Not;
	private Button Excuse_Me;
	private Button Can_You_Explain;
	private Button Im_Finished;
	private Button Homework;
	private Button Can_You_Repeat_That;
	private Button I_Need_Help;
	
	

	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.school_page1);
	        
	      //sentence starter ID linking:
	       I_Would_Like = (Button)findViewById(R.id.Button1);
	       Can_I_Have = (Button)findViewById(R.id.Button2);
	       I_Need = (Button)findViewById(R.id.Button3);
	       This_Is_Too = (Button)findViewById(R.id.Button4);
	       This_Is_Not = (Button)findViewById(R.id.Button5);
	       Excuse_Me = (Button)findViewById(R.id.Button6);
	       Can_You_Explain = (Button)findViewById(R.id.Button7); 
	       Im_Finished = (Button)findViewById(R.id.Button8);
	       Homework = (Button)findViewById(R.id.Button9);
	       Can_You_Repeat_That = (Button)findViewById(R.id.Button10); 
	       I_Need_Help = (Button) findViewById(R.id.Button11);
	       
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
		home = (ImageButton) findViewById(R.id.imageButton15);
		toTextToTalk = (ImageButton) findViewById(R.id.imageButton13);
		descriptions = (ImageButton) findViewById(R.id.imageButton4);
		subjects = (ImageButton) findViewById(R.id.imageButton2);
		supplies = (ImageButton) findViewById(R.id.imageButton3);
		
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
				
	
		
		//For descriptions button:
		descriptions.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, SchoolDescriptions.class);
                        startActivity(intent);   

		}

	});
		
		//For subjects button:
		subjects.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, SchoolClasses.class);
                        startActivity(intent);   

		}

	});	
		
		
		//For supplies button:
		supplies.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, SchoolSupplies.class);
                        startActivity(intent);   

		}

	});
		
	}	//end addListenerOnButton
	 
		 
	 
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
	      String toSpeak = I_Would_Like.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }

	 public void speakText2(View view){
	      String toSpeak = Can_I_Have.getText().toString();
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
	      String toSpeak = This_Is_Too.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	
	 public void speakText5(View view){
	      String toSpeak = This_Is_Not.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	 
	 public void speakText6(View view){
	      String toSpeak = Excuse_Me.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	 
	 public void speakText7(View view){
	      String toSpeak = Can_You_Explain.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	 
	 public void speakText8(View view){
	      String toSpeak = Im_Finished.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }

	 public void speakText9(View view){
	      String toSpeak = Homework.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }

	 public void speakText10(View view){
	      String toSpeak = Can_You_Repeat_That.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	 
	 public void speakText11(View view){
	      String toSpeak = I_Need_Help.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }

}