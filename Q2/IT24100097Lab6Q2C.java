import java.util.Scanner;

public classIT24100097Lab6Q2C {
	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        
        	int[] numbers = new int[10];
		int sum = 0 ;
        
        	System.out.println("Please enter the 10 numbers:");
        	int count = 0;
 
		while (count < 10) {
		System.out.print("Enter number " + (count + 1) + ": ");
		numbers[count] = scanner.nextInt();
		sum += numbers[count];
		count++;
		}
        
        	System.out.println("The numbers you entered are:");

        	for (int i = 0; i < 10; i++) {
		System.out.print(numbers[i] + " ");
		}

		double average = (sum / 10);

		System.out.println("Sum of the numbers: " + sum);
		System.out.println("Average of the numbers: " + average);
	}
}

		

		
    