package com.jue.getdimen;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.TextView;

/**
 * 获取手机分辨率和读取的资源文件
 * 
 * @author Jooper
 *
 */
public class MainActivity extends Activity {

	private TextView mTextView1;
	private TextView mTextView2;

	private int screenWidth;
	private int screenHeight;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mTextView1 = (TextView) findViewById(R.id.screen_size);
		mTextView2 = (TextView) findViewById(R.id.screen_density);

		DisplayMetrics dm = new DisplayMetrics();
		dm = getResources().getDisplayMetrics();

		float density = dm.density; // 屏幕密度（像素比例：0.75/1.0/1.5/2.0）
		int densityDPI = dm.densityDpi; // 屏幕密度（每寸像素：120/160/240/320）
		float xdpi = dm.xdpi;
		float ydpi = dm.ydpi;

		screenWidth = dm.widthPixels; // 屏幕宽（像素，如：480px）
		screenHeight = dm.heightPixels; // 屏幕高（像素，如：800px）

		mTextView1.setText(screenWidth + " x " + screenHeight);
		mTextView2.setText(density + "");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.d("Jooper", "onRestart");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d("Jooper", "onStop");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d("Jooper", "onPause");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d("Jooper", "onResume");
	}
}
