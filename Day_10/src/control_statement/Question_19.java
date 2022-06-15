package control_statement;

public class Question_19 {

	public static void main(String[] args) {
		int number = 5;

        int factorial = 1;

        for(int i = 2; i <= number; i++ )
        {
            factorial *= factorial;
        }
     System.out.println("Factorial of 5:"+factorial);


	}

}
