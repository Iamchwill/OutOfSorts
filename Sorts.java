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
}
