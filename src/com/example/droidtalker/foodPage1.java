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

public class foodPage1 extends Activity {
	
	ImageButton help;
	ImageButton toTextToTalk;
	ImageButton home;
	
	ImageButton vegetables;
	ImageButton drinks;
	ImageButton bakedGoods;
	ImageButton fruits;
	ImageButton meats;
	ImageButton utensils;
	ImageButton dairy;
	ImageButton condiments;
	ImageButton otherfoods;  
	ImageButton descriptions;
	
	
	//create text to speech object
	TextToSpeech ttsobject;	
	
	//for the Sentence Starters-TTS:
	private Button I_Would_Like;		
	private Button Can_I_Have;
	private Button I_Need;
	private Button This_Is_Too;
	private Button This_Is_Not;
	private Button Can_I_Have_More;
	private Button Im_Finished;
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_page1);
        
        //sentence starter ID linking:
        I_Would_Like = (Button)findViewById(R.id.IWouldLike);
        Can_I_Have = (Button)findViewById(R.id.CanIHave);
        I_Need = (Button)findViewById(R.id.INeed);
        This_Is_Too = (Button)findViewById(R.id.ThisIsToo);
        This_Is_Not = (Button)findViewById(R.id.ThisIsNot);
        Can_I_Have_More = (Button)findViewById(R.id.CanIHaveMore);
        Im_Finished = (Button)findViewById(R.id.ImFinished);
        
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
		toTextToTalk = (ImageButton) findViewById(R.id.imageButton13);
		vegetables = (ImageButton) findViewById(R.id.imageButton5);
		drinks = (ImageButton) findViewById(R.id.imageButton3);
		bakedGoods = (ImageButton) findViewById(R.id.imageButton6);
		home = (ImageButton) findViewById(R.id.imageButton15);
		fruits = (ImageButton) findViewById(R.id.imageButton2);
		meats = (ImageButton) findViewById(R.id.imageButton4);
		utensils = (ImageButton) findViewById(R.id.imageButton8);
		dairy = (ImageButton) findViewById (R.id.imageButton7);
		condiments = (ImageButton) findViewById (R.id.imageButton9);
		otherfoods = (ImageButton) findViewById (R.id.imageButton10);
		descriptions = (ImageButton) findViewById (R.id.imageButton11);	
		
	
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
		
		
		
		//For vegetables button:
		vegetables.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, foodVegetables.class);
                        startActivity(intent);   

		}

	});

		
		
		//For drinks button:
		drinks.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, FoodDrinks.class);
                        startActivity(intent);   

		}

	});
		
		
		
		//For baked goods button:
		bakedGoods.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, FoodBakedGoods.class);
                        startActivity(intent);   

		}

	});		

		//For fruits button:
		fruits.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, FoodFruits.class);
                        startActivity(intent);   

		}

	});	
		
		//For meats button:
		meats.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, FoodMeats.class);
                        startActivity(intent);   

		}

	});	
		
		
		//For utensils button:
		utensils.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
	
			    Intent intent = new Intent(context, FoodUtensils.class);
	                        startActivity(intent);   
	
			}
	
		});
		
		
		//For otherfoods button:
		otherfoods.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
	
			    Intent intent = new Intent(context, FoodOtherFoods.class);
	                        startActivity(intent);   
	
			}
	
		});
		
		//For dairy button:
		dairy.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, FoodDairy.class);
                        startActivity(intent);   

		}

	});		
		
		//For condiments button:
		condiments.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, FoodCondiments.class);
                        startActivity(intent);   

		}

	});				
		
		
		//For descriptions button:
		descriptions.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, FoodDescriptions.class);
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
	      String toSpeak = Can_I_Have_More.getText().toString();
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
	
}	//end class




