package Example.Demo;

public class Addition {
int Num1= 5;
int Num2=3;
int result=0;
void sum() {
	result=Num1+Num2;
	System.out.println(result);
}
	public static void main(String[] args) {
System.out.println("addition of two numbers is" );
Addition additionObj=new Addition();
additionObj.sum();


	}

}
