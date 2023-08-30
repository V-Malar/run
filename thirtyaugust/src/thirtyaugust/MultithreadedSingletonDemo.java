package thirtyaugust;

class Logger {
	private static Logger instance;

	private Logger() {
		// Private constructor to prevent instantiation
	}

	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	public void log(String message) {
		System.out.println(message);
	}
}

public class MultithreadedSingletonDemo {
	public static void main(String[] args) {
		Runnable task = () -> {
			Logger logger = Logger.getInstance();
			logger.log("Logging a message.");
		};

		// Creating multiple threads that use the Singleton
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);

		thread1.start();
		thread2.start();
	}
}
