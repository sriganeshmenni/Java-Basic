import java.util.Scanner;
class oddoreven{
    public static void know(int k){
        if(k%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        know(k);
        sc.close();
    }
}