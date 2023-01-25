package corejava;

public class Multiplication_Thread extends Thread{
	public void run() {
		try 
		{
			int n=5;
			int k;
			for(int i=1;i<=10;i++) {
				k=n*i;
				Thread.sleep(50);
				//System.out.println(n + " * " + i +  " = " + n * i);
				
				System.out.println(k);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String args[]) {
		Multiplication_Thread mt=new Multiplication_Thread();
		mt.start();
	}

}
