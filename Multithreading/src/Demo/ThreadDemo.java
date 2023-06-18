package Demo;

class ThreadDemo extends Thread {
	   
	   ThreadDemo( String name) {
		   super();
	      System.out.println("Creating " +  getName() );
	      start ();
	         System.out.println("Created " + getName());
	   }
	   
	   public void run() {
	      System.out.println("Running " +  getName() );
	      try {
	         for(int i = 1; i < 5; i++) {
	            System.out.println(getName() + ", " + i);
	            // Let the thread sleep for a while.
	            Thread.sleep(1000);
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Thread " +  getName() + " interrupted.");
	      }
	      System.out.println(getName() + " exiting.");	
	   }
	   
	}

