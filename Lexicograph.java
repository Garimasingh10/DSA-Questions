public class Lexicograph {
    static void sortarr(String[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index=i;
            for (int j = i+1; j < n; j++) {
                if(arr[j].compareTo(arr[min_index])<0){
                    min_index=j;
                }
            }

            String temp = arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        String[] arr = {"papaya","watermelon","kiwi","apple","banana"};
        sortarr(arr);
        for (String val: arr) {
            System.out.print(val+ " ");
            
        }
    }
    
}
