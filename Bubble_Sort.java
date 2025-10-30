package sorting_dsa;
import java.util.Scanner;
class Sorting1{
    int []arr;
    Sorting1(int[] arr){
        this.arr = arr;
    }
    void sorting(){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of input : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the element no "+i+" : ");
            arr[i] = sc.nextInt();
        }
        Sorting1 srt = new Sorting1(arr);
        srt.Display();
        System.out.println("After Sorting Elements");
        srt.sorting();
        srt.Display();
    }
}
