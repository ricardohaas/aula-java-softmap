
public class Threads {

	public static void main(String[] args) throws InterruptedException {
		ThreadExemplo t = new ThreadExemplo();
		t.start();
		
		int c =0;
		while(true){
			c++;
			Thread.sleep(1000);
			System.out.println("Loop Principal");
			if( c >= 3 ){
				//return;
				//System.exit(0);
			}
		}		
		
	}

}

class ThreadExemplo extends Thread{
	public void run(){
		while(true){
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Loop Thread");
		}
	}

}

class ThreadExemplo2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Loop Thread Runnable");
	}
}
