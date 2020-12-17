public class Sorts{

  public static void bubbleSort(int[] data){
    for (int i = data.length - 1; i > 0; i--){
      boolean done = true;
      for (int j = 0; j < i; j++){
        if (data[j] > data[j + 1]){
          int temp = data[j + 1];
          data[j + 1] = data[j];
          data[j] = temp;
          done = false;
        }
      }
      if (done) i = 0;
    }
  }

  public static void selectionSort(int[] data){
    for (int i = 0; i < data.length; i++){
      int smallest = i;
      for (int j = i; j < data.length; j++){
        if(data[j] <= data[smallest]) smallest = j;
      }
      int temp = data[i];
      data[i] = data[smallest];
      data[smallest] = temp;
    }
  }
}
