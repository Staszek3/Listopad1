class TestGC {
	public static void main(String[] args) throws InterruptedException {
		for (long i=0; i<100000; i++) {
			String tmp = new String("test");
			Thread.sleep(1000);
		}
	}
}


