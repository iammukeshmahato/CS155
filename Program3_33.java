import java.util.Scanner;

class Program3_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight and price for package 1: ");
        double weight1 = sc.nextDouble();
        double price1 = sc.nextDouble();
        
        System.out.print("Enter the weight and price for package 2: ");
        double weight2 = sc.nextDouble();
        double price2 = sc.nextDouble();
        
        double rate1 = price1/weight1;
        double rate2 = price2/weight2;
        
        sc.close();

        if(rate1 < rate2){
            System.out.println("Package 1 has better price");
        }else{
            System.out.println("Package 2 has better price");
        }
    }
}