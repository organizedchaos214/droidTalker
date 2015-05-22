package com.example.droidtalker;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.view.View;
import android.widget.Toast;

public class CategorybyLocationMain extends FragmentActivity	{
	

  	 int PLACE_PICKER_REQUEST = 1;
  	 
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.category_by_location_main);
	        

	   	 PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();

	   	 Context context = getApplicationContext();
	   	 try {
			startActivityForResult(builder.build(context), PLACE_PICKER_REQUEST);
		} catch (GooglePlayServicesRepairableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GooglePlayServicesNotAvailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	 }
	 	 
	 
	 protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		  if (requestCode == PLACE_PICKER_REQUEST) {
		    if (resultCode == RESULT_OK) {
		        Place place = PlacePicker.getPlace(data, this);
		        String toastMsg = String.format("Place: %s", place.getName());
		        Toast.makeText(this, toastMsg, Toast.LENGTH_LONG).show();
		    }
		  }
		}
	 
}