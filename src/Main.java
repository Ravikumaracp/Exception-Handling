class Main{

    public int execeptionCheck(int n){
        try{
            n=2/1;
            return n;
        }catch(Exception e){
            System.out.println("divided by zero error..");
        }finally{
            System.out.println("finally block is executed.");
        }
        return n;
    }
    public static void main(String[] args){
       int n=0;
       Main a=new Main();
       a.execeptionCheck(n);
    }
}