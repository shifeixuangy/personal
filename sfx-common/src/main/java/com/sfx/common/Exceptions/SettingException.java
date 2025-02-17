package com.sfx.common.Exceptions;

/**
 * 设置异常
 * @author sfx
 */
public class SettingException extends Exception{
	private static final long serialVersionUID = -4134588858314744501L;

	public SettingException(Throwable e) {
		super(e);
	}
	
	public SettingException(String message) {
		super(message);
	}
	
	public SettingException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
