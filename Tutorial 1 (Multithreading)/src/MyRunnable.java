
// Implementing the Runnable interface, the runnable object is passed to the Thread constructor

public class MyRunnable implements Runnable 
{
	
	public void run() 
	{
		System.out.println("This is myRunnable implementing Runnable");
	}
	
	public static void main(String[] args)
	{
		new Thread(new MyRunnable()).start();
		new Thread(new MyRunnable()).start();
	}

}
