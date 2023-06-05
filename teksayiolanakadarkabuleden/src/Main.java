import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner berke = new Scanner(System.in);
int number;
int endpoint=0;
        do {
            System.out.println("Entry the number :");  number = berke.nextInt();
            if (number%2==0 && number%4==0)
            {
                endpoint = endpoint + number;
            }
        }

        while ((number%2)==0);
        {

            System.out.println("System off.."+endpoint);
        }

}}