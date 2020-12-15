//https://www.cnblogs.com/daheww/p/10154455.html
package xqy_1;

import java.util.ArrayList;
import java.util.Scanner;

public class FCFS {
    private int processNumber;
    private ArrayList<Process> processList;

    public FCFS() {
        init();
        calc();
        Tools.printResult(processList);
    }

    private void init() {
        Scanner sc = new Scanner(System.in);

        System.out.print("<FCFS> Please enter the process num:");
        processNumber = sc.nextInt();

        processList = new ArrayList<Process>();
        for (int i = 0; i < processNumber; i++) {
            processList.add(new Process());
        }

        System.out.println("<FCFS> Please enter each process arrival time:");
        for (int i = 0; i < processNumber; i++) {
            System.out.print("    Process" + (i + 1) + ":");
            processList.get(i).setArrivalTime(sc.nextInt());
        }

        System.out.println("<FCFS> Please enter each process service time:");
        for (int i = 0; i < processNumber; i++) {
            System.out.print("    Process" + (i + 1) + ":");
            processList.get(i).setServicesTime(sc.nextInt());
        }
    }

    private void calc() {
        int timeNow = 0;
        Process opProcess;

        for (int i = 0; i < processNumber; i++) {
            opProcess = processList.get(i);

            int waitTime = timeNow - opProcess.getArrivalTime();
            int completionTime = timeNow + opProcess.getServicesTime();
            int turnAroundTime = completionTime
                    - opProcess.getArrivalTime();
            double turnAroundTimeWithWeight = (double) turnAroundTime
                    / opProcess.getServicesTime();

            opProcess.setStartTime(timeNow);
            opProcess.setWaitTime(waitTime);
            opProcess.setCompletionTime(completionTime);
            opProcess.setTurnAroundTime(turnAroundTime);
            opProcess.setTurnAroundTimeWithWeight(
                    turnAroundTimeWithWeight);

            timeNow += opProcess.getServicesTime();
        }
    }

    public static void main(String [] args) {
        new FCFS();
    }
}