package garbages_collector;

public class GarbageExample {
	
	public void finalize() {
		System.out.println("Garbage collection");
	}

	public static void main(String[] args) {
		GarbageExample g1 = new GarbageExample();
		GarbageExample g2 = new GarbageExample();
		g1 = null;
		g2 = null;
		System.gc();
	}
}
