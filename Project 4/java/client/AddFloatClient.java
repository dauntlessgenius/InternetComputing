import localhost.axis.AddFloatServer_jws.*; 
public class AddFloatClient { 
 public static void main(String[] args) throws Exception { 
 double x = 0.0;
 double y = 0.0;
 if (args.length == 2) 
 {
 x = Double.parseDouble(args[0]); 
 y = Double.parseDouble(args[1]);
 }
 else { 
 System.out.println("Usage: java AddFloatClient [double]"); 
 System.exit(-1);
 } 
  
 AddFloatServerServiceLocator factory = 
 new AddFloatServerServiceLocator();  
 AddFloatServer proxy = factory.getAddFloatServer(); 
 double result = proxy.add(x,y);  
 System.out.println("Summation of " + x + " and " + y + " is " + result); 
 } 
}
