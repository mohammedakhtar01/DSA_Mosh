public class Array {

    private int count; // Count Of Items in array
    private int[] arr;

    public Array (int size){
        arr = new int[size];
    }

    public void insert (int num){

        if(count == arr.length){
            resizeArray(arr);
            arr[count] = num;
        }else{
            arr[count] = num;
        }
        count++;

    }

    public void removeAt (int idx){

        if(idx <0 || idx >= count){
            System.out.println("Error -Invalid idx");
            return;
        }

        for(int startIdx = idx ; startIdx < count ; startIdx++ ){
            arr[startIdx] = arr[startIdx+1];
        }
        count--;
        System.out.println("Item removed successfully");


    }

   public int indexOf (int num){

        for(int idx=0 ; idx <count ; idx++){
            if (arr[idx] == num)
                return idx;
        }
        return -1;
   }

    public void printNumbers(){

        for (int idx =0; idx <count ; idx++){
            System.out.print(arr[idx]+",");
        }
        System.out.println();
    }

    private void resizeArray(int[] OldArr){

        int[] newArr = new int[count*2];
        System.out.println("hello");
        for (int idx=0; idx<OldArr.length ; idx++){
            newArr[idx] = OldArr[idx];
        }

        arr = newArr;
    }



}
