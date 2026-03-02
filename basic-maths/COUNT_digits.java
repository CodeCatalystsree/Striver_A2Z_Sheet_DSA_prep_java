 import java.util.*;
// public class COUNT_digits{
    public static int count_dig_num(int num){
        
    if (num == 0) return 1;   // special case
    return (int)(Math.log10(num) + 1);
}
//            int c=0;
//            int rem=0;
//            while(num>0){
//            int d=num%10;
//             c++;
//             //rem=rem+d;
//             System.out.println("the extrcated number is"+d);
//             num=num/10;
//            }
//            System.out.println("number of digits is:"+c);
//     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number you wnt to count the digits of:");
        int num=sc.nextInt();
        count_dig_num(num);
        sc.close();

//     }
// }
//OPTIMIZED WAY
//  int count(int num){
//     int count=(int)(log10((n))+1);
//      return count;
//  }