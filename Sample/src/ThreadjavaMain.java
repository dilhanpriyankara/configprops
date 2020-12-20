
public class ThreadjavaMain {

	public static void main(String[] args) throws InterruptedException {
		javaThread javaThread=new javaThread();
		javaThread.start();
		
		for(int i=0;i<=100;i++) {
			System.out.println("Main thread");	
			
		}
		
		
	}

}
