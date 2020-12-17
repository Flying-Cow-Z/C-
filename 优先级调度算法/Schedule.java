//https://blog.csdn.net/weixin_44035017/article/details/103281702
package xqy_3;

import java.util.*;

public class Schedule {
    private  List<PCB>  queue=new LinkedList<>();   //就绪队列

    private Comparator<PCB> comparator=new Comparator<PCB>() {
        @Override
        public int compare(PCB o1, PCB o2) {
            if(o1.prior>o2.prior)
                return -1;
            else
            if(o1.prior==o2.prior)
                return 0;
            else
                return 1;
        }
    };

    private void printResult(){
        for (PCB p:queue) {
            if(p.next!=null)
                System.out.println("进程名："+p.name+" 进程优先级:"+p.prior+" 进程运行时间："+p.time+" 进程指针："+p.next.name);
            else
                System.out.println("进程名："+p.name+" 进程优先级:"+p.prior+" 进程运行时间："+p.time+" 进程指针：0");
        }
        System.out.println("--------------------------------------------------------");
    }
    private void changeNext(){
        for(int i=0;i<queue.size();i++){
            // System.out.println(queue.get(i).name+" "+queue.get(i).prior+" ");
            if(i<queue.size()-1)
                queue.get(i).next=queue.get(i+1);
            else
                queue.get(i).next=null;
        }
    }


    public void PriorSchedule(){

        //创建进程
        PCB p1=new PCB("p1",null,2,1,"R");
        queue.add(p1);
        PCB p2=new PCB("p2",null,3,5,"R");
        queue.add(p2);
        PCB p3=new PCB("p3",null,1,3,"R");
        queue.add(p3);
        PCB p4=new PCB("p4",null,2,4,"R");
        queue.add(p4);
        PCB p5=new PCB("p5",null,4,2,"R");
        queue.add(p5);

        queue.sort(comparator);     //按优先级排序
        changeNext();               //设置指针
        printResult();              //打印未调度之前的就绪队列

        int i=1;
        while(true){                //调度执行
            PCB p=((LinkedList<PCB>) queue).getFirst();
            p.time--;
            if (p.prior>1) {
                p.prior--;
            }
            if(p.time==0) {
                p.setStatus("E");             //改变状态
                ((LinkedList<PCB>) queue).remove(p);   //移出队列
            }

            queue.sort(comparator);
            changeNext();

            System.out.println("第"+(i++)+"次调度");
            printResult();                                //打印此次调度之后的就绪队列


            if(queue.size()==0)       //当就绪队列为空时退出调度
                break;
        }
    }

    public static void main(String[] args) {
        new Schedule().PriorSchedule();
    }

}


class PCB {
    String name;     //进程名
    PCB next;          //进程指针
    long time;         //运行时间
    int prior;         //进程优先级
    String status;      //进程状态

    public PCB(String name, PCB next, long time, int prior, String status) {
        this.name = name;
        this.next = next;
        this.time = time;
        this.prior = prior;
        this.status = status;
    }
    public PCB() {
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

