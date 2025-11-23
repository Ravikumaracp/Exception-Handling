public class EH4 {
    public static void main(String[] args){
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new ArithmeticException("dividing with zero");
            }
        }catch(ArithmeticException e){
            j=18/1;
            System.out.println("device by zero "+ e);
        }
        System.out.println(j);
//        catch(Exception e){
//            System.out.println("something went wrong..."+ e);
//        }
//        System.out.println("Done");
    }
}
