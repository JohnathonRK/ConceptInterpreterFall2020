import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Simple Test Class for the Program
public class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);
		
		//Read in file 
		int tokens = 0;
		int lineNumber = 1;
		ArrayList<String> listOfTokens = new ArrayList<String>();
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			
			//Separate the line with spaces...
			String[] bar = line.split(" ");
			
			for(String s : bar){
				listOfTokens.add("Token " + tokens + ": " + s + " Line : " + lineNumber);
				tokens++;
			}
			
			lineNumber++;
		}
		
		for(String s : listOfTokens) {
			System.out.println(s);
		}
		
		createLexemeList();
	}
	
	public static void createLexemeList() {
		ArrayList<Lexeme> lexemeList = new ArrayList<Lexeme>();
		
		lexemeList.add(new Lexeme("UPDATE", "="));
		
		System.out.println(lexemeList.get(0).getLexeme());
	}
}
