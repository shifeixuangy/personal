package com.sfx.design.Facade;

public interface LetterProcess
{
	public void writeContext(String context);
	public void fillEnvelope(String address);
	public void letterInotoEnvelope();
	public void sendLeter();
}
