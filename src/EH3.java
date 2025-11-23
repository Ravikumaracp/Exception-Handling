public class EH3 {
    public static void main(String[] args){
        int i=2;
        int j=0;
        int[] num=new int[5];
        String name=null;
        try{
            j=18/i;
            System.out.println(num[4]);
            System.out.println(name.length());
        }catch(ArithmeticException e){
            System.out.println("divide by zero "+ e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("limit is exceed of the array.. "+ e);
        }catch (NullPointerException e){
            System.out.println("string is a null "+ e);
        }catch (Exception e){
            //exception is the parent of all exception it should be last if we mention first it will gives compile time error
            System.out.println("something went wrong.. "+ e);
        }
    }

}
