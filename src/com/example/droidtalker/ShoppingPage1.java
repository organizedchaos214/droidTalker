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

public class ShoppingPage1 extends Activity {

	ImageButton help;
	ImageButton home;
	ImageButton toTextToTalk;
	
	ImageButton clothes;
	ImageButton colors;
	ImageButton descriptions;
	
	//create text to speech object
	TextToSpeech ttsobject;	
	
	//for the Sentence Starters-TTS:
	private Button How_Much_Is_This;
	private Button Do_You_Have;
	private Button Excuse_Me;
	private Button Can_I_Try;
	private Button I_Need;
	private Button I_Would_Like;
	private Button This_Is;
	private Button Where_Is;
	private Button Thank_You;

	
	protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.shopping_page1);
	        
	        
	       //sentence starter ID linking:
	       How_Much_Is_This = (Button)findViewById(R.id.Button1);
	       Do_You_Have = (Button)findViewById(R.id.Button2);
	       Excuse_Me = (Button)findViewById(R.id.Button3);
		   Can_I_Try = (Button)findViewById(R.id.Button4); 
		   I_Need = (Button)findViewById(R.id.Button5);
	       I_Would_Like = (Button)findViewById(R.id.Button6);
	       This_Is = (Button)findViewById(R.id.Button7);
	       Where_Is = (Button)findViewById(R.id.Button8);
	       Thank_You = (Button)findViewById(R.id.Button9);
	       
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

		clothes = (ImageButton)findViewById(R.id.imageButton2);
		colors = (ImageButton)findViewById(R.id.imageButton3);
		descriptions = (ImageButton)findViewById(R.id.imageButton4);
			
		
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
		
		

		//for clothes button:
		clothes.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

	    Intent intent = new Intent(context, ShoppingClothes.class);
                    startActivity(intent);   

		}

		});	
		
		
		

		//for colors button:
		colors.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

	    Intent intent = new Intent(context, ShoppingColors.class);
                    startActivity(intent);   

		}

		});	
				
		

		//for descriptions button:
		descriptions.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

	    Intent intent = new Intent(context, ShoppingDescriptions.class);
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
	      String toSpeak = How_Much_Is_This.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }

	 public void speakText2(View view){
	      String toSpeak = Do_You_Have.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	 
	 public void speakText3(View view){
	      String toSpeak = Excuse_Me.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	
	 public void speakText4(View view){
	      String toSpeak = Can_I_Try.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	
	 public void speakText5(View view){
	      String toSpeak = I_Need.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	 
	 public void speakText6(View view){
	      String toSpeak = I_Would_Like.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	 
	 public void speakText7(View view){
	      String toSpeak = This_Is.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	 
	 public void speakText8(View view){
	      String toSpeak = Where_Is.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	 
	 public void speakText9(View view){
	      String toSpeak = Thank_You.getText().toString();
	      Toast.makeText(getApplicationContext(), toSpeak, 
	      Toast.LENGTH_SHORT).show();
	      ttsobject.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	   }
	 
	
	
}
