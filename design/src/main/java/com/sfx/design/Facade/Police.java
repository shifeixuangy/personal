package com.sfx.design.Facade;

public class Police
{
	public boolean checkLetter(String content, String address)
	{
		if(address.equals("fuck"))
		{
			return false;
		}
		return true;
	}
}
