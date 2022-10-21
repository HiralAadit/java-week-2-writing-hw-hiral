package homework_week_6;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme3 {
    // Declare one instance and one static variable.
    String name = "Prime";
    static String surname = "Testing";

    //3.2Declare one instance method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        Programme3 programme3 = new Programme3();
        System.out.println(programme3.surname);

    }
    // 3.3 Declare one static method.
    public static void staticMethod(){
        Programme3 programme3 = new Programme3();
        System.out.println(programme3.name);
        System.out.println(surname);
    }
//3.5 Declare the main method
// 3.6 Declare both instance and static method into the main method and run the programme.
    public static void main(String[] args) {
        staticMethod();
        Programme3 programme3 = new Programme3();
        programme3.instanceMethod();
    }
}
