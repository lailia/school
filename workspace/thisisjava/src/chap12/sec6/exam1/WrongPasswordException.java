package chap12.sec6.exam1;

public class WrongPasswordException extends Exception{
		public WrongPasswordException() {}
		public WrongPasswordException(String message) {
		super(message);
	}
}
