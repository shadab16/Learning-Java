import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

class Producer extends Thread {

	private final BlockingQueue<String> queue;
	private int counter = 0;

	Producer(BlockingQueue<String> q) {
		queue = q;
	}

	public void run() {
		try {
			while (true) {
				queue.put(produce());
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			System.out.println("Producer Interrupted.");
		}
	}

	private String produce() {
		String val = Integer.toString(counter++);
		System.out.println("[" + getName() + "] Produced " + val);
		return val;
	}
}

class Consumer extends Thread {

	private final BlockingQueue<String> queue;

	Consumer(BlockingQueue<String> q) {
		queue = q;
	}

	public void run() {
		try {
			while (true) {
				consume(queue.take());
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			System.out.println("Consumer Interrupted.");
		}
	}

	private void consume(String value) {
		System.out.println("[" + getName() + "] Consumed " + value);
	}
}

class Concurrent {

	public static void main(String[] args) {

		BlockingQueue<String> q = new ArrayBlockingQueue<String>(5);

		Thread t1 = new Producer(q);
		t1.start();

		Thread t2 = new Consumer(q);
		t2.start();

		Thread t3 = new Consumer(q);
		t3.start();
	}
}

