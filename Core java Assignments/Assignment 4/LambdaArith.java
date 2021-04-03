
public class LambdaArith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithLambda add= (int a, int b) -> a+b;
		System.out.println(add.arith(5, 8));
		ArithLambda sub=(int a, int b) -> a-b;
		System.out.println(sub.arith(10, 8));
		ArithLambda mul= (int a, int b) -> a*b;
		System.out.println(mul.arith(25, 5));
		ArithLambda div=(int a, int b) -> a/b;
		System.out.println(div.arith(40, 5));

	}

	interface ArithLambda{
		int arith(int a, int b);
	}
}
