package Engine;

import java.util.List;
import java.util.ArrayList;

public class CardEffect {
	public static void doEffects(String script) {
		String[] statements = script.split(";");
		for (int i = 0; i < statements.length; i++) {
			//executeStatement(statements[i]);
		}
	}
	
	public static void test() {
		String testSource = "TRASH 1 treasure hand ;GAIN 1 treasure +3;";
		parse(testSource);
	}
	public static void parse(String source) {
		// Delimit by ;
		
		String[] statementStrings = source.split(";");
		List<Statement> statements = new ArrayList<Statement>();
		for (int i = 0; i < statementStrings.length; i++) {
			String[] words = statementStrings[i].trim().split(" ");
			statements.add(new Statement(words));
		}
	}
	
	public static void main(String[] args) {
		test();
	}
}