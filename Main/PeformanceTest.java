package Main; // Add this line to declare the package

import Components.Job;
import java.util.ArrayList;
import java.util.Random;

class PerformanceTest {
    public static void main(String[] args) {
        int[] testCases = {10, 20, 50, 100}; // Different sizes of job lists
        for (int numJobs : testCases) {
            ArrayList<Job> jobs = generateJobs(numJobs);
            runAndMeasure("FCFS", jobs);
            runAndMeasure("SJF", jobs);
            runAndMeasure("RR", jobs);
            runAndMeasure("SRTF", jobs);
        }
    }

    private static ArrayList<Job> generateJobs(int num) {
        ArrayList<Job> jobs = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            int arrivalTime = rand.nextInt(100);
            int burstTime = rand.nextInt(10) + 1; // Ensure no zero burst time
            jobs.add(new Job(i, arrivalTime, burstTime));
        }
        return jobs;
    }

    private static void runAndMeasure(String algorithmType, ArrayList<Job> jobs) {
        CPU.setJobList(jobs);
        CPU.setAlgorithm(algorithmType);
        long startTime = System.currentTimeMillis();
        long currentTime = startTime; // Initialize currentTime
        while (!allJobsCompleted()) {
            CPU.nextStep((int) currentTime++); // Cast currentTime to int
        }
        long endTime = System.currentTimeMillis();
        System.out.println(algorithmType + " - Execution Time: " + (endTime - startTime) + "ms");
        // Further metrics calculations here
    }

    private static boolean allJobsCompleted() {
        // Implementation to check if all jobs are completed
        return false;
    }
}