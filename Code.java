//Data Types
//Primitive
package karinaPapola;
public class Main{

    public static void main(String[] args) {

        byte age=20;
        int phone=1234567890;
        long phone 2=12345678900L;
        float pi = 3.14F;
        char letter = 'a';
        boolean isAdult = true;
        System.out.println(" Hello " +phone);                   //OUTPUT: Hello 1234567890
    }
}


//Non-Primitive
package karinaPapola;
public class Main{
    public static void main(String[] args){
        string name = "Karina";
        string friend = new String("Darshika");

        System.out.println(name.length());
    }
}


//Variables
package karinaPapola;
public class Main{

    public static void main(String[] args) {
        string name= "Karina"
        int age= 30;
        String neighbour="Darshika";
    }
}


//Arrays
package karinaPapola;
public class Main{

    public static void main(String[] args) {

        int[]marks= new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;

        System.out.println(marks[2]);                             //OUTPUT: 95


//Operators
//1. Arithmetic Operators

package karinaPapola;                                       //Eg:1
        public class Main{

            public static void main(String[] args) {
                int a=5;
                int b=3;
                int add = a+b;
                System.out.println(add);                                 //OUTPUT: 8
            }
        }



package karinaPapola;
        public class Main{                                         //Eg: 2

            public static void main(String[] args) {
                double a=5;
                double b=3;
                double modulo = a%b;

                System.out.println(modulo);                              //OUTPUT: 2.0
            }
        }


//2. Assignment Operators

package karinaPapola;                                      //Eg: 1
        public class Main{

            public static void main(String[] args) {
                int numb = 1;

                System.out.println(numb++);      //Increment             //OUTPUT: 1
                //         2
                System.out.println(numb);

            }
        }



package karinaPapola;                                      //Eg: 2
        public class Main{

            public static void main(String[] args) {
                int numb = 1;

                System.out.println(--numb);     //PreDecrement            //OUTPUT: 0
                //         0
                System.out.println(numb);

            }
        }


package karinaPapola;                                      //Eg: 2
        public class Main{

            public static void main(String[] args) {
                int numb = 1;

                System.out.println(numb--);     //PostDecrement           //OUTPUT: 1
                //         0
                System.out.println(numb);

            }
        }



//3. Comparision Operators

package karinaPapola;                                      //Eg: 1


package karinaPapola;                                      //Eg: 2
        public class Main{

            public static void main(String[] args) {
                int age=30;
                if (age>18)
                    System.out.println("Can Vote.");
                else
                    System.out.println("Can't Vote");                 //OUTPUT: Can Vote
            }
        }



//4. Logical Operators
//AND Operator
package karinaPapola;                                      //Eg: 1
        public class Main{

            public static void main(String[] args) {
                int a=30;
                int b=40;

                if (a<50 && b<50)
                    System.out.println("Both less than 50");
                else
                    System.out.println("Nothing.");
            }
        }                                                                   //OUTPUT: Both less than 50


//OR Operator
package karinaPapola;                                      //Eg: 2
        public class Main{

            public static void main(String[] args) {

                int a=60;
                int b=40;

                if (a<50 || b<50)
                    System.out.println("Atleast one is less than 50");
                else
                    System.out.println("Nothing.");
            }
        }		                                                  //OUTPUT: Atleast one is less than 50


//NOT Operatorpublic class Main {
        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.printf("Hello and welcome!");

            for (int i = 1; i <= 5; i++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                System.out.println("i = " + i);
            }
        }
    }
package karinaPapola;                                      //Eg: 3
    public class Main{

        public static void main(String[] args) {
            boolean isAdult = false;
            if (isAdult)
                System.out.println("isAdult");
            else
                System.out.println("NotAdult");
        }
    }		                                                  //OUTPUT: isAdult





//CONTROL STRUCTURES
//Conditional Branches:- 1. If/Else/Else If
package karinaPapola;                                      //Eg: 1
    public class Main{

        public static void main(String[] args) {
            count=7;
            if (count > 2) {
                System.out.println("Count is higher than 2");
            } else {
                System.out.println("Count is lower or equal than 2");                 //OUTPUT: Count is higher than 2
            }



//2. Ternary Operator
package karinaPapola;
            public class Main{

                public static void main(String[] args) {

                    int count = 1;
                    System.out.println(count > 2 ? "Count is higher than 2" : "Count is lower or equal than 2");

                }                                                                                     //OURTPUT: Count is lower or equal than 2"
            }


//3. Switch
package karinaPapola;
            public class Main{

                public static void main(String[] args){
                    int count = 3;
                    switch (count) {
                        case 0:
                            System.out.println("Count is equal to 0");
                            break;
                        case 1:
                            System.out.println("Count is equal to 1");
                            break;
                        default:
                            System.out.println("Count is either negative, or higher than 1");
                            break;
                    }                                                                             //      output: Count is either negative, or higher than 1
                }
            }




//Loops:-  example of comparable for and while type of loops
package karinaPapola;
            public class Main{

                public static void main(String[] args){
                    for (int i = 1; i <= 50; i++) {
                        methodToRepeat();
                    }

                    int whileCounter = 1;
                    while (whileCounter <= 50) {
                        methodToRepeat();
                        whileCounter++;
                    }	                                                                 // OUTPUT: Both code blocks above will call methodToRepeat 50 times.


                }




                class Main {                                                        //Eg: 1.1
                    public static void main(String[] args) {
                        for ( ; ; ) {
                            // Infinite for loop
                        }
                    }


                    //1.1 Labeled for Loops:- It’s useful if we’ve got nested for loops so that we can break/continue from a specific for loop.
                    class Main {
                        public static void main(String[] args) {

                            aa: for (int i = 1; i <= 3; i++) {
                                if (i == 1)
                                    continue;
                                bb: for (int j = 1; j <= 3; j++) {
                                    if (i == 2 && j == 2) {
                                        break aa;
                                    }
                                    System.out.println(i + " " + j);
                                }                                                                            //OUTPUT: 2 1
                            }
                        }


                        //2. Enhanced for Loops:- which makes it easier to iterate over all elements in an array or a collection.
                        class Main {
                            public static void main(String[] args) {
                                int[] intArr = { 0,1,2,3,4 };                        //Eg: 1
                                for (int num : intArr) {
                                    System.out.println("Enhanced for-each loop: i = " + num);                    /*OUTPUT: Enhanced for-each loop: i = 0
									                           Enhanced for-each loop: i = 1
								                                   Enhanced for-each loop: i = 2
									                           Enhanced for-each loop: i = 3
			                                                                           Enhanced for-each loop: i = 4*/
                                }
                            }
                        }



                        /*We can use it to iterate over various Java data structures:

                        Given a List<String> list object – we can iterate it: */
                        class Main {                                                //Eg: 2
                            public static void main(String[] args) {
                                String[] list = {"Hello KARINA!"};     // Declare and initialize the array
                                for (String item : list) {
                                    System.out.println(item);
                                }
                            }
                        }


//We can similarly iterate over a Set<String> set:
import java.util.HashSet;
import java.util.Set;

                        class Main {
                            public static void main(String[] args) {
                                Set<String> set = new HashSet<>();
                                set.add("Apple");
                                set.add("Banana");
                                set.add("Cherry");

                                for (String item : set) {
                                    System.out.println(item); //The program will print the three fruits, but the order is not guaranteed because HashSet does not maintain insertion order.
                                }
                            }
                        }                                                                                            /*OUTPUT: Apple
												    Banana
												    Cherry*/


//given a Map<String,Integer> map we can iterate over it as well:
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

                        class Main {
                            public static void main(String[] args) {
                                Map<String, Integer> map = new HashMap<>();
                                map.put("Alice", 30);
                                map.put("Bob", 25);
                                map.put("Carol", 27);

                                for (Entry<String, Integer> entry : map.entrySet()) {
                                    System.out.println(
                                            "Key: " + entry.getKey() +
                                                    " - " +
                                                    "Value: " + entry.getValue());
                                }
                            }
                        }                                                                                            /*OUTPUT: Key: Alice - Value: 30
												       Key: Bob - Value: 25
												       Key: Carol - Value: 27


//2.1 Iterable.forEach() : We now have a dedicated forEach() method in the Iterable interface that accepts a lambda expression representing an action we want to perform.

Internally, it simply delegates the job to the standard loop:*/
import java.util.ArrayList;
import java.util.List;

                        class Main {
                            public static void main(String[] args) {
                                List<String> names = new ArrayList<>();
                                names.add("Larry");
                                names.add("Steve");
                                names.add("James");
                                names.add("Conan");
                                names.add("Ellen");

                                // Using Iterable.forEach with a lambda expression to print each name
                                names.forEach(name -> System.out.println(name));
                            }
                        }                                                                                           /*OUTPUT: Larry
												      Steve
												      James
												      Conan
												      Ellen*/




//2. While Loop: The loop’s Boolean-expression(Condition) is evaluated before the first iteration of the loop – which means that if the condition is evaluated to false, the loop might not run even once.

                        class Main {
                            public static void main(String[] args) {
                                int i = 0;
                                while (i < 5) {
                                    System.out.println("While loop: i = " + i++);
                                }
                            }
                        }                                                                                          /*OUTPUT: While loop: i = 0
												     While loop: i = 1
												     While loop: i = 2
												     While loop: i = 3
												     While loop: i = 4*/



                        //3. Do- While Loop: The do-while loop works just like the while loop except for the fact that the first condition evaluation happens after the first iteration of the loop:
                        class Main {
                            public static void main(String[] args) {
                                int i = 0;
                                do {
                                    System.out.println("Do-While loop: i = " + i++);
                                } while (i < 5);
                            }
                        }                                                                                           /*OUTPUT: Do-While loop: i = 0
												      Do-While loop: i = 1
												      Do-While loop: i = 2
												      Do-While loop: i = 3
												      Do-While loop: i = 4*/















//Branching Statements:- used to alter the flow of control in loops.s
//1. Break
package karinaPapola;
                        public class Main{

                            public static void main(String[] args){
                                List<String> names = getNameList();
                                String name = "Karina Papola";
                                int index = 0;
                                for ( ; index < names.length; index++) {
                                    if (names[index].equals(name)) {
                                        break;
                                    }
                                }
                            }
                        }


//2. Continue
package karinaPapola;
                        public class Main{

                            public static void main(String[] args){
                                List<String> names = getNameList();
                                String name = "Karina Papola";
                                String list = "";
                                for (int i = 0; i < names.length; i++) {
                                    if (names[i].equals(name)) {
                                        continue;                                                      //  continue means to skip the rest of the loop we’re in
                                    }
                                    list += names[i];
                                }
                            }                                                                                // OUTPUT: ere, we skip appending the duplicate names into the list.
                        }







                        //String:
// Java Program to demonstrate String
                        public class Geeks {

                            // Main Function
                            public static void main(String args[])
                            {

                                // creating Java string using a new keyword
                                String str = new String("Geeks");

                                System.out.println(str);
                            }                                                                                 //OUTPUT: Geeks
                        }



























