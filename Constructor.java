class Weight {
  int[] data;
  
  Weight(int[] init) {
    
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.

    for (int j = 0; j < data.length; j++) {
      data[j] = init[j];
    }
  }
  
  int average() {
    int sum = 0;
    for (int i = 0; i < data.length; i++)
      sum += data[i];
    return sum / data.length;
  }
  
  int subAverage(int start, int end) {
    int sum = 0;
    if (end >= data.length) {
    return -1;  
    }
    if (end < start) {
      return -1;
    }
    for (int i = start; i <= end; i++) {
      sum += data[i];
    }
    return sum / (end - start + 1);
  }
  
  // Print
  void print() {
    for (int j = 0; j < data.length; j++) {
      System.out.print(data[j] + " ");
    }
  }
}      