package SeventhLecture;
import test.ourThread;
public class Seventh {
	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
        OurThread thread1 = new OurThread("Child 1", 0, 1, 500, false);
		OurThread thread1 = new OurThread("Child 2", 100, 10, 1000, false);
		OurThread thread1 = new OurThread("Child 3", 1000, 100, 2000, false);
        thread1.start();thread2.start();thread3.start();
        System.out.println("Please write a Command: ");
        String commandString = myScanner.nextLine();
        while(!commandString.toLowerCase().equals("exit")) {
        	if (commandString.equals("1")) {
        		System.out.println("Counter in Thread 1:" + thread1.getCounter());
        	}
        	else if(commandString.equals("2")) {
        		System.out.println("Counter in Thread 2:" + thread2.getCounter());
        	}
        	else if(commandString.equals("3")) {
        		System.out.println("Counter in Thread 3:" + thread3.getCounter());
        	}
        	else if(commandString.equals("1S")) {
        		thread1.stopThread();
        		System.out.println("Thread 1 Stopped");
        	}
        	else if(commandString.equals("2S")) {
        		thread2.stopThread();
        		System.out.println("Thread 2 Stopped");
        	}
        	else if(commandString.equals("3S")) {
        		thread3.stopThread();
        		System.out.println("Thread 3 Stopped");
        	}

        }
	}
}