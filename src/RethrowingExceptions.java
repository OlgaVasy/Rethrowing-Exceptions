/** Ex. 11.20: RethrowingExceptions.java */

public class RethrowingExceptions {

   public static void main(String[] args){

      try{
         someMethod();
      }
      catch (Exception exception){
         System.err.printf("%s%n%n", exception.getMessage());
         exception.printStackTrace();

         StackTraceElement[] traceElements = exception.getStackTrace();

         System.out.printf("%nStack trace from getStackTrace:%n");
         System.out.println("Class\t\tFile\t\tLine\tMethod");

         for (StackTraceElement element : traceElements){

            System.out.printf("%s\t", element.getClassName());
            System.out.printf("%s\t", element.getFileName());
            System.out.printf("%s\t", element.getLineNumber());
            System.out.printf("%s%n", element.getMethodName());
         }
      }
   }

   public static void someMethod() throws Exception{

      someMethod2();
   }

   public static void someMethod2() throws Exception{

      throw new Exception("Exception thrown");
   }
}
