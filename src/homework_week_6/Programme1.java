package homework_week_6;

public class Programme1 {
        //1.1 Declare two instance variables.
        int a = 10;
        int b = 20;

        //1.2Declare one instance method.
        public void instanceMethod(){
            System.out.println(a);
            System.out.println(b);
        }
        //1.4 Declare the main Method
        public static void main(String[] args) {
            homework_week_6.Programme1 programme1 = new homework_week_6.Programme1();
            programme1.instanceMethod();
        }
    }



