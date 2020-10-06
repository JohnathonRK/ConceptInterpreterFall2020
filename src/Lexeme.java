
public class Lexeme {
	private String lexemeName;
	private String tokenType;
	
	public Lexeme(String lexName, String tokenType) {
		lexemeName = lexName;
		this.tokenType = tokenType;
	}
	
	public String getLexeme() {
		return "Lexeme" + "." + lexemeName;
	}
	
	/*
	 * Token 
	 * ID
	 * Type of Lexeme/Non-Lexeme
	 * S
	 * 
	 */
}
