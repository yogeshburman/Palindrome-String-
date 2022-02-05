class Test {
  
  public static void main (String[]args){
    
    String str ="malayalam";
    // storing in Array in character form
    char ch[] = str.toCharArray();
    int rotation=0;
    // checking from start and back for similar character
    for(int i=0;i<ch.length/2;i++){
      int count=0;
      for(int j=0;j<ch.length/2;j++){
        
        char fromStart = ch[j];
        char fromback = ch[ch.length-j-1];
        if(fromStart==fromback){
          count++;
          rotation=count;
        }
      }
      
    }
   
    if(rotation==ch.length/2){
      System.out.println("Palindrome string");
    }
    else{
      System.out.println("no it not Palindrome");
    }
  }
}