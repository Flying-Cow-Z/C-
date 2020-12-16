//https://www.cnblogs.com/daheww/p/10154576.html
package xqy_2;

import java.util.ArrayList;
import java.util.Scanner;

public class RR {
    private int processNumber;
    private ArrayList<Process> processList;
    private int timeSlice;

    public RR() {
        init();
        calc();
        Tools.printResult(processList);
    }

    private void init() {
        Scanner sc = new Scanner(System.in);

        System.out.print("<RR> Please enter the slice time:");
        timeSlice = sc.nextInt();
        System.out.print("<RR> please enter the process num:");
        processNumber = sc.nextInt();

        processList = new ArrayList<Process>();
        for (int i = 0; i < processNumber; i++) {
            processList.add(new Process());
        }

        System.out.println("<RR> Please enter each process arrival time:");
        for (int i = 0; i < processNumber; i++) {
            System.out.print("    Process" + (i + 1) + ":");
            processList.get(i).setArrivalTime(sc.nextInt());
        }

        System.out.println("<RR> Please enter each process service time:");
        for (int i = 0; i < processNumber; i++) {
            System.out.print("    Process" + (i + 1) + ":");
            int servicesTime = sc.nextInt();

            processList.get(i).setServicesTime(servicesTime);
            processList.get(i).setRemainServiceTime(servicesTime);
        }
    }

    private void calc() {
        int timeNow = 0;
        int processRemain = processNumber;
        boolean noProcessRunInThisTurn;
        Process opProcess;

        while (processRemain != 0) {
            noProcessRunInThisTurn = true;

            for (int i = 0; i < processNumber; i++) {
                opProcess = processList.get(i);

                if ((opProcess.getRemainServiceTime() > 0)
                        && (timeNow >= opProcess.getArrivalTime())) {
                    // First time
                    if (opProcess.getServicesTime() == opProcess
                            .getRemainServiceTime()) {
                        int waitTime = timeNow - opProcess.getArrivalTime();

                        opProcess.setStartTime(timeNow);
                        opProcess.setWaitTime(waitTime);
                    }

                    // Calculating remain service time
                    int remainServiceTime = opProcess.getRemainServiceTime()
                            - timeSlice;
                    opProcess.setRemainServiceTime(remainServiceTime);

                    // Last time
                    if (remainServiceTime <= 0) {
                        int completionTime = timeNow + timeSlice; // The process ends when the current slice is completed.
                        int turnAroundTime = completionTime
                                - opProcess.getArrivalTime();
                        double turnAroundTimeWithWeight = 1.0 * turnAroundTime
                                / opProcess.getServicesTime();

                        opProcess.setCompletionTime(completionTime);
                        opProcess.setTurnAroundTime(turnAroundTime);
                        opProcess
                                .setTurnAroundTimeWithWeight(turnAroundTimeWithWeight);
                        processRemain--;
                    }

                    timeNow += timeSlice;
                    noProcessRunInThisTurn = false;

                    System.out.println("    #STEP# Process" + (i + 1)
                            + " remain service time:"
                            + opProcess.getRemainServiceTime()
                            + " , timeBefore:" + (timeNow - 1) + ", timeNow:"
                            + timeNow
                            + ((remainServiceTime <= 0) ? " Finish" : ""));
                } else {
                    // do noting, because this process has been completed or hasn`t arrived.
                }
            }

            // Means no process could run, because they have arrived.
            if ((processRemain > 0) && noProcessRunInThisTurn) {
                timeNow += timeSlice;
            }
        }
    }
}