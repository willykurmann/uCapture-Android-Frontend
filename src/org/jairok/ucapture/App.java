package org.jairok.ucapture;

import com.phonegap.DroidGap;

import android.os.Bundle;

public class App extends DroidGap {

	private final static String ANDROID_ASSET = "file:///android_asset/www/index.html";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl(ANDROID_ASSET);
	}
}