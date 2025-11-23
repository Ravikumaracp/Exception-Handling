//Custom Exception
class RaviException extends Exception{
    public RaviException(String str){
        super(str);
    }
}
public class EH5 {
    public static void main(String[] args){
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new RaviException("dividing with zero");
            }
        }catch(RaviException e){
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
