package accessSpecifier1;

import accessSpecifier.CallingVariables;

public class Demo2 extends CallingVariables{

	public static void main(String[] args) {
		
		CallingVariables d= new CallingVariables();
		System.out.println(d.publicVar); //calling variable from different package

	}
	}


