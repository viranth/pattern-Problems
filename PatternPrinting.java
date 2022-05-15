import java.util.Scanner;
class PatternPrinting{
    static Scanner sc = new Scanner(System. in );
    static void pattern1(){
        System.out.println("Enter the numbers of rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     static void pattern2(){
        System.out.println("Enter the word to limit the Pattern (In Capitals) : ");
        char c = sc.next().charAt(0);
            for (char i = 'A'; i <= c; i++) {
                for (char j = 'A'; j <= i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
    }
    static void pattern3(){
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int odd = 1,even = 2;
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    System.out.print(odd + " ");
                    odd = odd + 2;
                } else {
                    System.out.print(even + " ");
                    even = even + 2;
                }
            }
        System.out.println();
        }
    }

    static void pattern4(){
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt(),k=0;
        for (int i = 1; i <= n; i++) {
            k = k + i;
            for (int j = k; j > k - i; j--) {
                System.out.print(j + " ");
            }
             System.out.println();
        }
    }

    static void pattern5(){
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        for(int i = n;i >= 1;i--){
            for(int j = i;j >= 1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

     static void pattern6(){
        System.out.println("Enter the word to limit the Pattern (In Capitals) : ");
        char c = sc.next().charAt(0);
        for(char i = 'A';i <= c;i++){
            for(int j = c-i+1;j > 0;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern7(){
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 2 * i - 1; k >= 1; k--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static void pattern8(){
        System.out.println("Enter the word to limit the Pattern (In Capitals) : ");
        char c = sc.next().charAt(0);
        int var = 1;
        for (char i = 'A'; i <= c; i++) {
            char word = 'A';
            for (int j = c; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = (2*var - 1); k> 0; k--) {
                System.out.print((char)(word + k - 1) + " ");
            }
            var++;
            System.out.println();
        }
    }
    static void pattern9(){
        System.out.println("Enter the word to limit the Pattern (In Capitals) : ");
        char c = sc.next().charAt(0);
        for (char i = 'A'; i <= c; i++) {
            
            for (int j = c; j > i; j--) {
                System.out.print(" ");
            }
            for (char k = 'A'; k <= i; k++) {
                System.out.print(k+" ");
            }
            
            for (char l = 'A'; l < i; l++) {
                System.out.print(l+" ");
            }
            
            System.out.println();
        }
    }
        static void pattern10(){
            System.out.println("Enter the word to limit the Pattern (In Capitals) : ");
            char c = sc.next().charAt(0);
            for (char i = 'A'; i <= c; i++) {
                for (int j = c; j > i; j--) {
                    System.out.print(" ");
                }
                for (char k = i; k >= 'A'; k--) {
                    System.out.print(k+" ");
                }
                for (char l = 'B'; l <= i; l++) {
                    System.out.print(l+" ");
                }
                System.out.println();
            }
    }
  public static void main(String[] args) {
    pattern1();
    pattern2();
    pattern3();
    pattern4();
    pattern5();
    pattern6();
    pattern7();
    pattern8();
    pattern9();
    pattern10();
  }
}



    