// Task1: Simulates a download operation
class DownloadTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Starting download...");
        try {
            Thread.sleep(3000); // Simulating time taken to download
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": Download completed!");
    }
}

// Task2: Simulates a file reading operation
class FileReadingTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Reading file...");
        try {
            Thread.sleep(2000); // Simulating time taken to read a file
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": File reading completed!");
    }
}

// Task3: Simulates data processing
class DataProcessingTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Processing data...");
        try {
            Thread.sleep(1000); // Simulating time taken for data processing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": Data processing completed!");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Create threads for each task
        Thread downloadThread = new Thread(new DownloadTask(), "DownloadThread");
        Thread fileReadingThread = new Thread(new FileReadingTask(), "FileReadingThread");
        Thread dataProcessingThread = new Thread(new DataProcessingTask(), "DataProcessingThread");

        // Start the threads (tasks will now execute concurrently)
        downloadThread.start();
        fileReadingThread.start();
        dataProcessingThread.start();

        // Main thread message
        System.out.println(Thread.currentThread().getName() + ": Main thread is free to perform other operations.");
    }
}
