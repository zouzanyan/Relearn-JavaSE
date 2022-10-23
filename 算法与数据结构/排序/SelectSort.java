class SelectSort{
    public static void main(String[] args){
        /* selectSort */
        SelectSort selectSort = new SelectSort();

        int[] array = {45,85,24,47,9,0,1,2};


        int[] array1 = selectSort.sort(array);
        for(int num:array1){
            System.out.println(num);
        }


    }

    public int[] sort(int[] array){
        int length = array.length;
        int temp = 0;
        for(int i = 0; i < length; i++){
            for(int j = i + 1; j < length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
        
    }
}