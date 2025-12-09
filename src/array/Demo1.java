package array;

public class Demo1 {

	public static void main(String[] args) {
	//size of array is not fixed, we can select multiple no. of array.
		int arr=16; //arr is variable
		int[] arr1= {10,11,12,13,14,15,16,17,18,19,20};
		System.out.println(arr);
		//System.out.println(arr1[7]); //index value.(start from 0)
		
	//	for(int i =0;i<arr1.length;i++) { //read data using for loop
	//		System.out.println(arr1[i]);
	//	}
		
		for (int num :arr1) { // forEach loop
			System.out.println(num);
		}
		
		
		
		//fixed size array
		int[] arr2= new int[6]; //new object is created for fixed type.array size 6
		arr2[0]=18;             
		arr2[1]=19;
		arr2[2]=20;
		arr2[3]=21;
		arr2[4]=22;
		arr2[5]=23;
		System.out.println(arr2[0]);
		
		//Find size of array
		int a= arr2.length;
		System.out.println("Size of arr2"+ " " +"is" + " " +a);
		
		
		//Find size of array which are not easily countable)
		int[] arr3= {10,11,12,13,14,15,16,17,18,19,20,10,11,12,13,14,15,16,17,18,19,20,10,11,12,13,14,15,16,17,18,19,20,10,11,12,13,14,15,16,17,18,19,20};
		int b = arr3.length;
		System.out.println("Size of arr3 is"+" "+b);
	}

}
