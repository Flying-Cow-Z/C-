import java.util.Arrays;
import java.util.Scanner;

public class BankerAlgorithm {

        int Available[]; // 系统可用资源
        int Max[][]; // 进程需要资源的最大数目
        int Allocation[][]; //进程当前已经获得资源的数目
        int need[][];       //进程尚需的资源数
        int Request[][];     //存放请求
        int Work[];         //试分配
        int tmp[];         //进程执行顺序
        int num = 0; //进程编号


        Scanner sc = new Scanner(System.in);

        //含参构造函数，proc是进程数形参，sour是资源种类数形参
        public BankerAlgorithm(int proc,int sour) {
            Available = new int[sour];
            Max = new int[proc][sour];
            Allocation = new int[proc][sour];
            need = new int[proc][sour];
            Request = new int[proc][sour];
            Work = new int[sour];
            tmp = new int[proc];
        }

        //设置各初始系统变量，并判断是否处于安全状态
        public void start(int proc,int sour) {
            setAvailable(sour);
            setMax(proc,sour);
            setAllocation(proc,sour);
            printSystemVariable(proc,sour); //打印矩阵
            securityAlgorithm(proc,sour);
        }

        //设置Available数组
        public void setAvailable(int sour){
            System.out.println("请设置各资源总数：");
            for (int i=0; i<sour; i++) {
                Available[i] = sc.nextInt();
            }
        }

        //设置Max矩阵
        public void setMax(int proc, int sour) {
            System.out.println("请设置各进程的最大需求矩阵：");
            System.out.println("请输入各进程的最大资源需求量");
            for (int i = 0; i < proc; i++) {
                for (int j = 0; j < sour; j++) {
                    Max[i][j] = sc.nextInt();
                }
            }
        }

        //设置已分配资源矩阵Allocation
        public void setAllocation(int proc, int sour) {
            System.out.println("请设置各进程分配矩阵Alloction：");
            System.out.println("请输入各进程的已分配资源量：");
            for (int i = 0; i < proc; i++) {
                for (int j = 0; j < sour; j++) {
                    Allocation[i][j] = sc.nextInt();
                }
            }

            //修改这两个变量中的值
            System.out.println("Available = Available - Allocation.");
            System.out.println("Need = Max - Allocation.");

            //设置Allocation矩阵
            for (int i = 0; i < sour; i++) {
                for (int j = 0; j < proc; j++) {
                    Available[i] = Available[i] - Allocation[j][i];
                }
            }

            //设置need矩阵
            for (int i = 0; i < proc; i++) {
                for (int j = 0; j < sour; j++) {
                    need[i][j] = Max[i][j] - Allocation[i][j];
                }
            }
        }

        //打印矩阵
        public void printSystemVariable(int proc, int sour) {
            System.out.println("此时资源分配量如下：");
            System.out.println("进程  "+"   Max   "+"   Alloction "+"    Need  "+"     Available ");
            for (int i = 0; i < proc; i++) {
                System.out.print("P"+i+" ");
                for (int j = 0; j < sour; j++) {
                    System.out.print(Max[i][j]+" ");
                }
                System.out.println("| ");
                for (int j = 0; j < sour; j++) {
                    System.out.print(Allocation[i][j]+" ");
                }
                System.out.println("+ ");
                for (int j = 0; j < sour; j++) {
                    System.out.print(need[i][j] + " ");
                }
                System.out.println("+ ");
                if (i == 0) {
                    for (int j = 0; j < sour; j++) {
                        System.out.println(Available[j]+" ");
                    }
                }
                System.out.println();
            }
        }

        //设置请求资源量
        public void setRequest(int proc, int sour) {
            System.out.println("请输入请求资源的进程编号：");
            num = sc.nextInt();//设置全局变量进程编号num,在开头
            System.out.println("请输入请求各资源的数量：");

            for (int i = 0; i < sour; i++) {
                Request[num][i] = sc.nextInt();
            }

            String str = Arrays.toString(Request[num]);
            System.out.println("即进程P" + num + "对各资源请求Request：(" +
                    str+")");
            BankerAlgorithmReal(proc,sour);
        }

        //银行家算法
        public void BankerAlgorithmReal(int proc, int sour) {
            //定义布尔类型变量，如果银行家算法执行成功即true，就进行安全检查
            boolean T = true;
            int count = 0;
            int number = 0;

            //判断request是否小于need
            for (int i = 0; i < sour; i++) {
                if (Request[num][i] <= need[num][i]) {
                    count++;
                }
            }

            //判断request是否小于available
            for (int i = 0; i < sour; i++) {
                if (Request[num][i] <= Available[i]) {
                    number++;
                }
            }

            //执行第二步，改变数据
            if (count == sour) {
                if (number == sour) {
                    for (int i = 0; i < sour; i++) {
                        Available[i] -= Request[num][i];
                        Allocation[num][i] += Request[num][i];
                        need[num][i] -= Request[num][i];
                    }
                }else {
                    System.out.println("当前系统没有多余资源可分配，请等待");
                    T = false;
                }
            }else {
                System.out.println("进程P"+num+"请求的资源量已经超过最大需求量need");
                T = false;
            }

            //现在是T == true了，要执行安全算法
            int b = 0;
            if (T == true) {
                printSystemVariable(proc,sour);
                System.out.println("现在进入安全算法");
                boolean Q = securityAlgorithm(proc,sour);
                if(Q == false) {
                    System.out.println("进程" + num + "申请资源后，系统进入死锁状态，分配失败!");
                    for (int i = 0; i < sour; i++) {
                        Available[i] += Request[num][i];
                        Allocation[num][i] -= Request[num][i];
                        need[num][i] += Request[num][i];
                    }
                }else {
                    for (int i = 0; i < sour; i++) {
                        if (need[num][i] == 0) {  //说明已经不需要分配了
                            b++;
                        }
                    }
                    if(b == sour) {
                        for (int i = 0; i < sour; i++) {
                            Available[i] += Allocation[num][i];
                        }
                        printSystemVariable(proc, sour);
                    }
                }

            }

        }

        //安全性算法
        public boolean securityAlgorithm(int proc, int sour) {
            //初始化finish
            boolean finish[] = new boolean[proc];
            for (int i = 0; i < proc; i++) {
                finish[i] = false;
            }
            boolean lable = false;
            int apply = 0; // 计数标志
            int circle = 0;
            int count = 0; // 完成进程数

            for (int i = 0; i < sour; i++) {
                Work[i] = Available[i];
            }

            boolean flag = true;

            while(count < proc) {
                if (flag) {
                    System.out.println("进程  " + "   Work  " + "   Alloction " + "    Need  " + "     Work+Alloction "+"  Finish");
                    flag = false;
                }

                //遍历进程
                for (int i = 0; i < proc; i++) {
                    apply = 0;
                    for (int n = 0; n < sour; n++) {
                        //判断进程是否已分配成功
                        if (finish[i] == false && need[i][n] <= Work[n]) {
                            // 若没有分配，且资源需求数小于可用资源数，输出
                            apply++;
                            if (apply == sour) {
                                System.out.print("P" + i + "  ");

                                for (int m = 0; m < sour; m++) {
                                    System.out.print(Work[m] + "  ");
                                }

                                System.out.print("|  ");

                                for (int j = 0; j < sour; j++) {
                                    Work[j] += Allocation[i][j];
                                }

                                finish[i] = true;//当前进程能满足时，设为true
                                tmp[count] = i;
                                count++;//满足，进程数加1

                                for (int j = 0; j < sour; j++) {
                                    System.out.print(Allocation[i][j] + "  ");
                                }

                                System.out.print("|  ");

                                for (int j = 0; j < sour; j++) {
                                    System.out.print(need[i][j] + "  ");
                                }

                                System.out.print("|  ");

                                for (int j = 0; j < sour; j++) {
                                    System.out.print(Work[j] + "  ");
                                }

                                System.out.print("\t" + " |  ");


                                System.out.print("\t" + finish[i]);

                                System.out.println();
                            }

                        }
                    }
                }
                circle++;

                if (count == proc) {
                    lable = true;
                    System.out.println("系统是安全的");
                    System.out.print("此时存在一个安全序列：");
                    for (int i = 0; i < proc; i++) {
                        System.out.print("P" + tmp[i]);
                        if (i < proc - 1) {
                            System.out.print("->");
                        }
                    }
                    System.out.println();
                    break;
                }
                if (count < circle) {
                    count = proc;
                    lable = false;
                    for (int i = 0; i < proc; i++) {
                        if (finish[i] == false) {
                            System.out.println("当前系统处于不安全状态,故不存在安全序列");
                            break;
                        }
                    }
                }
            }
            return lable;
        }
}
