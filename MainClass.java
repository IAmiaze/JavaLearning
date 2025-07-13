public class MainClass {
    public static void main(String[] args) {
        HelperClass helper = new HelperClass();
        MyClass MyClass = new MyClass();
        helper.sayHello();
        MyClass.myMethod();
        String a ="10";
        String b = "20";
        System.out.println("String Concatenation: " + a + b);
        System.out.println("String Addition: " + (Integer.parseInt(a) + Integer.parseInt(b)));
        System.out.println("His Name is \'Miaze\'\nhe is a \"Java Developer\".");
    }
}

class HelperClass {
    public void sayHello() {
        System.out.println("Hello from HelperClass!");
        double myDouble = 5.99d;
        String myString = "Hello, Miaze!";
        int myInt = (int) myDouble;
        System.out.println("MyInit" + myInt);
        System.out.println("The length of the string is: " + myString.length());
        System.out.println("UpperCaseConvert: " + myString.toUpperCase());
        System.out.println("LowerCaseConvert: " + myString.toLowerCase());
        System.out.println("Locate the Miaze " + myString.indexOf("Miaze"));
    }

}

class MyClass {
    public void myMethod() {
        System.out.println("This is my method in MyClass.");
        int myNumber = 10000;
        System.out.println("MyNumber: " + String.valueOf(myNumber).length());

        // Example of concatenating first name and last name
        String firstName = "Ayub";
        // Example of using isEmpty()
        String emptyString = "lll";
        System.out.println("Is emptyString empty? " + emptyString.isEmpty());
        String lastName = "Miaze";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name: " + fullName);
        String[] nameParts = fullName.split(" ");
        System.out.println("First Name Split: " + nameParts[0]);
        System.out.println("Last Name Split: " + nameParts[1]);
    }
}