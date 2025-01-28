class MediaPlayer {
    public static void main(String[] args) {
        // Thread 1: Handles user input
        Thread userInputThread = new Thread(() -> {
            System.out.println("User pressed 'Play'. Playing video...");
            try {
                Thread.sleep(5000); // Simulate user watching video
                System.out.println("User pressed 'Pause'. Video paused.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread 2: Processes video frames in the background
        Thread videoProcessingThread = new Thread(() -> {
            try {
                for (int frame = 1; frame <= 10; frame++) {
                    System.out.println("Processing video frame " + frame);
                    Thread.sleep(500); // Simulate frame decoding delay
                }
                System.out.println("Video playback completed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        userInputThread.start();
        videoProcessingThread.start();
    }
}
