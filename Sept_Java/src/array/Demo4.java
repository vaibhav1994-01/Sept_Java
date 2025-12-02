package array;

public class Demo4 {

	public static void main(String[] args) {
		Object obj[] = new Object[8]; 			//object array
		
		obj[0]= 10;
		obj[1]= "Sachin Tendulkar";
		obj[2]= 'G';
		obj[3]= 18426;
		obj[4]= 34283;
		obj[5]= 184261592134283l;
		obj[6]= 2011.001;
		obj[7]= 100100.100;
		
		for (Object o:obj) {
			System.out.println("God of Cricket Stats" +" "+o);
		}

	}
	}