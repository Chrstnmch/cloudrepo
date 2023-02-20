package org.ssglobal.training.codes.item1;

public class InvalidBoaLengthException extends Exception{
	private static final long serialVersionUID = 3597428823846126267L;
	private String message = "Invalid Boa Length";

	public InvalidBoaLengthException() {} // no-argument
	
	public InvalidBoaLengthException(String newMessage) {
		message = newMessage;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
