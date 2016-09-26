package com.freshplanet.ane.android4support
{
	import flash.desktop.NativeApplication;
	import flash.events.Event;
	import flash.events.EventDispatcher;
	import flash.events.StatusEvent;
	import flash.external.ExtensionContext;
	import flash.system.Capabilities;

	public class AndroidExtension extends EventDispatcher
	{
		private static var _instance:AndroidExtension = null;
		private static var extContext:ExtensionContext = null;
		
		public static function getInstance():AndroidExtension
		{
			return _instance != null ? _instance : new AndroidExtension();
		}
		
		public function AndroidExtension()
		{
		}
	}
}