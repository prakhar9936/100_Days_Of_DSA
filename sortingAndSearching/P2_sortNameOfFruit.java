package sortingAndSearching;

public class P2_sortNameOfFruit {
    static void sortByselectionSort(String[] fruit){
        int n = fruit.length;
        for(int i = 0;i<n-1;i++){
            int min_index = i;
            for(int j = i+1;j<n;j++){
              if(fruit[j].compareTo(fruit[min_index])<0){
                min_index = j;
              }
            }
            String temp = fruit[i];
            fruit[i] = fruit[min_index];
            fruit[min_index] = temp;

        }
    }
    public static void main(String[] args) {
        String [] fruits ={"papaya","lime","watermelon","mango","apple","kiwi"};
        sortByselectionSort(fruits);
        for(String val:fruits){
            System.out.print(val+" ");
        }

    }
    
}
