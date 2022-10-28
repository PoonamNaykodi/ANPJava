package question1;

public class ArrayDemo {
	
	public static int[]manipulateIntegerArrary(int[] array){
		int[] newArray=new int[array.length];
		for(int i=0;i<array.length;i++) {
			newArray[i]=array[i]+5;
			
		}
		return newArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1};
		int[]b=manipulateIntegerArrary(a);
		for(int i=0;i<b.length;i++) {
			System.out.println(""+b[i]);
		}

	}

}
