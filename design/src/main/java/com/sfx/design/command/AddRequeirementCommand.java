package com.sfx.design.command;

public class AddRequeirementCommand extends Command
{

	@Override
	public void execute()
	{
		super.rg.find();
		super.rg.add();
		super.rg.plan();
		
	}

}
