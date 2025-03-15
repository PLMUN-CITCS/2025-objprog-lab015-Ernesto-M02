public class VariablesScope {
     static int globalCount = 100; 
     //... (globalCount variable)...
      public static void main(String[] args) {
         System.out.println("Global Count (from main): " + globalCount); 
         
         //...(other code in main)...
          showScope(); 
          } 
          public static void showScope() {
             //...(main method)... 
             int localCount = 50; 
             System.out.println("Global Count (from showScope): " + globalCount); 
             System.out.println("Local Count (from showScope): " + localCount); } 
    }