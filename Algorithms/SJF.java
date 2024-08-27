/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import Components.CurrentProcess;
import Components.Job;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.ArrayList;

public class SJF extends Algorithm {

    private PriorityQueue<Job> readyQueue;

    public SJF(ArrayList<Job> jobList) {
        super(jobList);
        readyQueue = new PriorityQueue<>(Comparator.comparingInt(Job::getBurstTime));
    }

    @Override
    public CurrentProcess nextStep(int currentTime) {
        Job currentJob = null;
        addArrivedToTempQ(currentTime);

        if (tempQueue.isEmpty() && readyQueue.isEmpty()) {
            currentJob = new Job(0, 0, 0); // No jobs available
            currentProcess.setCurrentJob(currentJob);
        } else if (!tempQueue.isEmpty() && readyQueue.isEmpty()) {
            currentJob = new Job(11, 0, 0); // Waiting for jobs to arrive
            currentProcess.setCurrentJob(currentJob);
        } else if (!readyQueue.isEmpty()) {
            currentJob = readyQueue.poll(); // Get the job with the shortest burst time
            if (!currentJob.isStarted()) {
                currentJob.setStartTime(currentTime);
                currentJob.setStarted(true);
            }
            currentJob.setRemainingTime(currentJob.getRemainingTime() - 1);

            if (currentJob.getRemainingTime() > 0) {
                readyQueue.add(currentJob); // Re-add the job if it's not finished
            } else {
                currentJob.setFinishedTime(currentTime + 1);
                currentJob.setWaitTime();
                currentJob.setTurnAroundTime();
                currentProcess.getTableData().set(currentJob.getJobNo() - 1, currentJob);
            }
            currentProcess.setCurrentJob(currentJob);
        }
        return currentProcess;
    }
}
