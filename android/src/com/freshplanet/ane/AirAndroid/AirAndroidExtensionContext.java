package com.freshplanet.ane.AirAndroid;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class AirAndroidExtensionContext extends FREContext
{
	@Override
	public void dispose()
	{
		AirAndroidExtension.context = null;
	}

	@Override
	public Map<String, FREFunction> getFunctions()
	{
		Map<String, FREFunction> functions = new HashMap<String, FREFunction>();

		
		return functions;
	}
}
