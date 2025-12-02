package accessModifiers;

     class Default1 { // used in same package
    	void show() {
    		System.out.println("Default Class - package only");
	
	 }
    	public static void main(String[] args) {
    		Default1 D1 = new Default1();
    		D1.show();
    	}
	 
     }
