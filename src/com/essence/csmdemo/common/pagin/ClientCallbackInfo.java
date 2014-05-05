package com.essence.csmdemo.common.pagin;

public class ClientCallbackInfo
{
	
	protected int callbackType;
	
	protected String openURL;

	public int getCallbackType()
	{
		return callbackType;
	}

	public void setCallbackType(int callbackType)
	{
		this.callbackType = callbackType;
	}

	public String getOpenURL()
	{
		return openURL;
	}

	public void setOpenURL(String openURL)
	{
		this.openURL = openURL;
	}
}
