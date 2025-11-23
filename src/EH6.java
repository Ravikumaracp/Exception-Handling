class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Ravi");
    }
}

public class EH6 {
    public static void main(String[] args){
        A obj1=new A();
        try {
            obj1.show();
        }catch(ClassNotFoundException e){
            System.out.println("Class is not found." + e);
            e.printStackTrace();
        }
    }
}
