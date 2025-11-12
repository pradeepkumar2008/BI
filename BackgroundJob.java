// File: BackgroundJob.java
public class BackgroundJob {
    public static void main(String[] args) {
        // Runnable represents a task to be run in background
        Runnable backgroundTask = () -> {
            try {
                System.out.println("Background job started...");
                Thread.sleep(2000); // simulate work
                System.out.println("Background job finished ✅");
            } catch (InterruptedException e) {
                System.out.println("Job interrupted!");
            }
        };

        // Run the task asynchronously
        Thread worker = new Thread(backgroundTask);
        worker.start();

        System.out.println("Main thread continues running...");
    }
}
