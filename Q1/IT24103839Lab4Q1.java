import java.util.Scanner;
	
	public class IT24103839Lab4Q1{
		
		public static void main(String[]args){

			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter a Number:");

			int num1=scanner.nextInt();
	
			if(num1==0) //Check if the number is zero
			{ 
			System.out.print("The number is zero");
			} else{ //by adding a another if else in the 1st else statment to make the above output works

				if(num1>0){
					System.out.print("The number is positive:"+num1);
			    } 	else{
				System.out.print("The number is Negative:" +num1);
			}
		}	
						 
	scanner.close();
	}

}