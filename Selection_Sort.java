package sorting_dsa;
import java.util.Scanner;

class Sorting3{
    int []arr;
    Sorting3(int []arr){
        this.arr = arr;
    }
    void sort(){
        for(int i = 0 ; i < arr.length ; i++){
            int minindex = i;
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
    }
    void Display(){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Element at "+i+" is "+arr[i]);
        }
    }
}

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of input : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the Element "+i+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Element Before Sort");
        Sorting3 srt = new Sorting3(arr);
        srt.Display();
        System.out.println("Element After Sort");
        srt.sort();
        srt.Display();
    }
}
