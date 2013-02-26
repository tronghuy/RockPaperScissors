package com.JohnWrinkle.rockpaperscissors;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void rockClick (View view){
		RPSRoll(1);
		
		
	}
	
	public void paperClick (View view){
		RPSRoll(2);
		
	}
	
	public void scissorsClick (View view){
		RPSRoll(3);
	}
	
	
	
	public void RPSRoll(int userInput){
		TextView mTexter;
		TextView mTextCPU;
		mTexter = (TextView) findViewById(R.id.textEr);
		mTextCPU = (TextView) findViewById(R.id.cpu);
	    
		Random generator = new Random();
	    int roll = generator.nextInt(3)+1;
	    switch (roll) {
	    //computer picks...
	    
	    //rock
	    case 1:
	    	mTextCPU.setText(R.string.cpuR);
	    	if (userInput ==1){
	    		mTexter.setText(R.string.tie);
	    		
	    	}
	    	else if (userInput ==2){
	    		mTexter.setText(R.string.win);
	    		
	    	}
	    	else if (userInput == 3){
	    		mTexter.setText(R.string.lose);
	    		
	    	}
	    	
	    	break;
	    	
	    //paper
	    case 2:
	    	mTextCPU.setText(R.string.cpuP);
	    	if (userInput ==1){
	    		mTexter.setText(R.string.lose);
	    		
	    	}
	    	else if (userInput ==2){
	    		mTexter.setText(R.string.tie);
	    		
	    	}
	    	else if (userInput == 3){
	    		mTexter.setText(R.string.win);
	    		
	    	}
	    	break;
	    //scissors
	    case 3:
	    	mTextCPU.setText(R.string.cpuS);
	    	if (userInput ==1){
	    		mTexter.setText(R.string.win);
	    		
	    	}
	    	else if (userInput ==2){
	    		mTexter.setText(R.string.lose);
	    		
	    	}
	    	else if (userInput == 3){
	    		mTexter.setText(R.string.tie);
	    		
	    	}
	    	break;
	    }
	    
}

}
