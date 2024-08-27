/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import Components.CurrentProcess;
import Components.Job;
import Main.CPU;
import java.util.ArrayList;
import java.util.LinkedList; // Import LinkedList
import java.util.Queue;


public class RR extends Algorithm {

    private int iterations = 0;
    private LinkedList<Job> readyQueue = new LinkedList<>(); // Change to LinkedList implementation

    public RR(ArrayList<Job> jobList) {
        super(jobList);
        this.readyQueue.addAll(jobList); // Initialize readyQueue with jobList

    }

    @Override
    public CurrentProcess nextStep(int currentTime) {
        if (!readyQueue.isEmpty()) {
            Job currentJob = readyQueue.poll();

            if (!currentJob.isStarted()) {
                currentJob.setStartTime(currentTime);
                currentJob.setStarted(true);
            }

            // Process the job for one time unit
            currentJob.setRemainingTime(currentJob.getRemainingTime() - 1);
            iterations++;

            // Check if the job's quantum is exhausted or job is completed
            if (currentJob.getRemainingTime() > 0 && iterations < CPU.getQuantum()) {
                readyQueue.add(0, currentJob); // Continue at the front
            } else {
                if (currentJob.getRemainingTime() > 0) {
                    readyQueue.add(currentJob); // Move to the back of the queue
                }
                iterations = 0; // Reset quantum counter for the next job
            }

            currentProcess.setCurrentJob(currentJob);
        }
        return currentProcess;
    }

}
