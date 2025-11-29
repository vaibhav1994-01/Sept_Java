package stringBufferAndBuilder;

public class Aut {
	public static void main(String[] args) {
		String testName = "Login Test";
		int runCount = 5;

		//using stringbuilder for dynamic logmessage
		StringBuilder logMessage = new StringBuilder();
		logMessage.append("Execution Test: ")
		.append(testName)
		.append("| Run count: ")
		.append(runCount);
		System.out.println(logMessage.toString()); 
		}}

