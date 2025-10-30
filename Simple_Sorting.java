package sorting_dsa;
import java.util.Scanner;
class Sorting{
    int[] arr;
    Sorting(int[] arr){
        this.arr = arr;
    }
    void sort(){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    void Display(){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Element at "+i+" is "+arr[i]);
        }
    }
}
public class Simple_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of input : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("\nEnter the input no "+i+" : ");
            arr[i] = sc.nextInt();
        }
        Sorting srt = new Sorting(arr);
        srt.Display();
        System.out.println("After Sorting Elements");
        srt.sort();
        srt.Display();
    }
}
