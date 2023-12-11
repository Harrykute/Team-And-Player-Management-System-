package IPLTeam;

public class TeamCodeNotFound extends Exception{

	private int invalidCode;
	public TeamCodeNotFound(String errorMessage, int invalidCode) {
		super(errorMessage);
		this.invalidCode = invalidCode;
	}
	
	@Override
	public String getMessage() {
		String message = super.getMessage();//Invokes getMessage from Exception class
		String finalMessage = message + ": " + invalidCode;
		return finalMessage;
	}
}

