import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and I will tell you the factorial: ");
        //here's a hint
        Integer X = sc.nextInt();
        for (int i = 1; i <= X; i++){
            factorial = factorial.multiply(i); 
        }
        System.out.println("! = " + factorial);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        //No hint! what do you need to complete this task?
        Integer sum = 0;
        System.out.println("Enter a number ");
        Integer num = sc.nextInt();
        for (int i = 0; i < num.length; i %= 2){
            sum += Character.getNumericValue(number.charAt(i));
            }
            System.out.println(sum);
            


        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
//The reason this loop never stops is because the boolean condition is never false so it will continue to print. A break statement forces the loop to end no matter the circumstances. 
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            break; 
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        //hint
        String reverse = "";
        System.out.println("Enter a string ")
        String input = sc.nectLine();
        for (int i = input.length - 1; i >= 0; i--) {
            reverse = reverse + input.chartAt(i)
            }
            System.out.printnl(reverse)
//charAt gets the character position and based off the for statement (specifically input.length) allows it to start at the end of the word taking the input and printing it out backwords.



//Challenge File

        System.out.print("Enter a string ");
        String input = scanner.nextLine();
        
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

//After researching through stackoverflow along with chatgpt to help me decipher what some of the things like input.charAt(i) and input.length meant, I understand how this problem works. 
//input.length() is used to determine the amount of times the loop runs based on the length of the string input. The input.charAt() grabs the current letter in this case represented by i.
//and of course we get one letter per line because we use println not just print
//the loop starts at 0 ensuring that we pick up the first letter of given sting and will run for the length of however long the string is
    }
}
