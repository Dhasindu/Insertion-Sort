/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorts;

/**
 *
 * @author user
 */
public class InsertionSorting {
    public static void main(String[] args) {
       
        System.out.println("Insertion Sort Swapping");
        InsertionSortSwapping();
        System.out.println("\n\n");
        
        System.out.println("Insertion Sort Swapping Decrease");
        InsertionSortSwapDescrese();
        System.out.println("\n\n");

        
        System.out.println("Insertion Sort Optimazation");
        InsertionSortOptimize();
        System.out.println("\n\n");
       
        System.out.println("Insertion Sort Optimazation Decrease");
        InsertionSortOpDescrese();
        System.out.println("\n\n");
       
    }
        
public static void InsertionSortSwapping(){
        int arr[] = {1,4,3,5,2};
        int j;
        int i;
        int swap;
    
        for(i=1;i<arr.length;i++){
            j=i-1;
            while(j>=0 && arr[j]>arr[j+1]){
                swap =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= swap;
                j--;
            }        
        }
            for(i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
            }
    
    }
    
public static void InsertionSortOptimize(){
        int arr[] = {1,4,3,5,2};
        int j;
        int key;
        int i;
    
        for(i=1;i<arr.length;i++){
            key = arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
           
        }
        for(i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
        }
        
}
public static void InsertionSortSwapDescrese(){
        int arr[] = {1,4,3,5,2};
        int j;
        int i;
        int swap;
    
        for(i=1;i<arr.length;i++){
            j=i-1;
            while(j>=0 && arr[j]<arr[j+1]){
                swap =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= swap;
                j--;
            }        
      }
        for(i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
        }
    
    
    }
public static void InsertionSortOpDescrese(){
        int arr[] = {1,4,3,5,2};
        int j;
        int key;
        int i;
    
        for(i=1;i<arr.length;i++){
            key = arr[i];
            j=i-1;
            while(j>=0 && arr[j]<key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
           
    }
        for(i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
        }
        
   }

}

