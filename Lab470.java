public class Lab470{
    public static void main(String as[]){
         
        int arr[]={23,43,11,56,34,55};
        System.out.println(arr.length);
        for(int x:arr){
            System.out.println(x);
        }
       int arr1[]=arrSort(arr);
        System.out.println("after sorting");
        System.out.println("------------------");
        for(int x:arr){
            System.out.println(x);
        }
        int element=searching(arr1, 34);
        System.out.println(element);
    }
    public static int[] arrSort(int arr[]){
    for(int i=0;i<=arr.length-1;i++){
        for(int j=i+1;j<=arr.length-1;j++){
            if(arr[i]>=arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    return arr;
}
    public static int searching(int arr[],int ele){
        for(int i=0;i<=arr.length-1;i++){
            if(ele==arr[i]){
                System.out.println("Element found at "+i);
            }
            
            }
    
        return ele;
       
    }
}