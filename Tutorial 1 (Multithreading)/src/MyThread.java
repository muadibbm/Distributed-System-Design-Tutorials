
// Extending the Thread class and then implementing it Run method

public class MyThread extends Thread {

	public void run()
	{
		System.out.println("This is myThread extending Thread and my Id is " + this.getId());
	}
	
	public static void main(String[] args) 
	{
		new MyThread().run();
		new MyThread().run();
	}

}
