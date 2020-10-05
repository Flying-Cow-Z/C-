public class HelloWorld {
 public static void  main(String[] args) {

   int a = 10;
   int b = 20;
   int c = 50;
   int max = 0;
   if(a > b)
   {

   	max = c > a ? c:a;
     // if(c > a)
     //   {
     //   	max = c;
     //   }
     //  else
     //   {

     //    max = a;
     //   }
   }
   else
   {
   	max = c > b ? c:b;
       // if(c > b)
       // {
       //   max = c;
       // }
       // else 
       // {
       // 	max = b;
       // }
       System.out.println("最大值是 " + max);
   }

 	// int a = 10;
 	// int b = 20;
 	// int temp = 0;
  //   temp = b;
  //   b = a;
  //   a = temp; 
  //   System.out.println("a的值 "+ a +" b的值为 "+b);
 	 }
}