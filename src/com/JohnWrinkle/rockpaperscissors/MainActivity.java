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

	// this basically says if you click the rock roll, send the value of 1
	// to the method below
	public void rockClick(View view) {
		// this one will take the value of "userInput" in the method
		// which will then be used in the switch statement
		RPSRoll(1);

	}

	// if paper send 2
	public void paperClick(View view) {
		RPSRoll(2);

	}

	// if scissors send 3
	public void scissorsClick(View view) {
		RPSRoll(3);
	}

	// this method will roll a random dice 1-3
	// and compare it to your choice
	// 1 = rock
	// 2 = paper
	// 3 = scissors
	public void RPSRoll(int userInput) {
		// declare our xml objects
		TextView mTexter;
		TextView mTextCPU;
		// link our declared xml objects with their id
		mTexter = (TextView) findViewById(R.id.textEr);
		mTextCPU = (TextView) findViewById(R.id.cpu);

		// import a random number generator
		Random generator = new Random();
		// declare int roll and roll a number 1-3
		int roll = generator.nextInt(3) + 1;

		// here is where we figure out what to do with the CPU dice roll

		switch (roll) {
		// computer picks...

		// rock
		case 1:
			// sets the top text to what the computer rolls
			mTextCPU.setText(R.string.cpuR);

			// this figured out what the user rolls
			// we got "userinput" by doing RSRoll(numberHere) earlier
			if (userInput == 1) {
				mTexter.setText(R.string.tie);

			} else if (userInput == 2) {
				mTexter.setText(R.string.win);

			} else if (userInput == 3) {
				mTexter.setText(R.string.lose);

			}

			break;

		// paper
		case 2:
			mTextCPU.setText(R.string.cpuP);
			if (userInput == 1) {
				mTexter.setText(R.string.lose);

			} else if (userInput == 2) {
				mTexter.setText(R.string.tie);

			} else if (userInput == 3) {
				mTexter.setText(R.string.win);

			}
			break;
		// scissors
		case 3:
			mTextCPU.setText(R.string.cpuS);
			if (userInput == 1) {
				mTexter.setText(R.string.win);

			} else if (userInput == 2) {
				mTexter.setText(R.string.lose);

			} else if (userInput == 3) {
				mTexter.setText(R.string.tie);

			}
			break;
		}

	}

}
