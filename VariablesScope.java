public class VariablesScope {
    // Global variable
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print the global count from the main method
        System.out.println("Global Count (from main): " + globalCount);
        
        // Call the showScope method
        showScope();
    }

    public static void showScope() {
        // Local variable
        int localCount = 50;
        
        // Print the global and local counts
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount); 
    }
}

