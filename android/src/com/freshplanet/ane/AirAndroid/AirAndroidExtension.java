package com.freshplanet.ane.AirAndroid;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class AirAndroidExtension implements FREExtension
{
	
	public static String TAG = "AirAndroid";
	public static Boolean nativeLogEnabled = true;
	
	public static AirAndroidExtensionContext context;

	public FREContext createContext(String extId)
	{
		return context = new AirAndroidExtensionContext();
	}

	public void dispose()
	{
		context = null;
	}
	
	public void initialize() {}
	
	
	public static int getResourceId(String name)
	{
		return context != null ? context.getResourceId(name) : 0;
	}
}
