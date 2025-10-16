public class Calculator implements SampleCalculator {

     private int sum=0;
     private int difference=0; 
     private int product=0; 
     private int quotient=0;

     public void add(int i) {
        sum+=i;
    } 
     
     public void subtract(int i) {
         difference-=i; 
    } 
    
    public void multiply(int i) { 
        product*=i; 
    
    } public void divide(int i) { 
        quotient/=i; 
    
    } public static void main(String args[]) { 
        
        Calculator calc = new Calculator(); 
        calc.add(12); System.out.println("Add result:"+ calc.sum); 

        calc.subtract(12); 
        System.out.println("Subtract result:"+ calc.difference); 
        
        calc.multiply(12); 
        System.out.println("Multiply result:"+ calc.product); 

        calc.divide(12); 
        System.out.println("Divide result:"+ calc.quotient); 
    }
}