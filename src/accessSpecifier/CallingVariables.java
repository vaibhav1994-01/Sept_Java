package accessSpecifier;

public class CallingVariables {

	
		
		//Calling variable in same class.
		public String publicVar = "Live, Laugh, Love (Public Variable)";
		private String privateVar = "Be the change (Private Variable)";
		protected String protectedVar = "Follow your heart (Protected Variable)";
		String defaultVar = "Dream without fear (Default Variable)"; // no keyword required for default
																	
		public static void main(String[] args) {
			CallingVariables d =new CallingVariables();
			d.callingVariables();
			
	}
		public void callingVariables() {
			System.out.println(publicVar);
			System.out.println(privateVar);
			System.out.println(protectedVar);
			System.out.println(defaultVar);
			
		}
}
