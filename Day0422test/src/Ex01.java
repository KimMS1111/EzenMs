
public class Ex01 {

	public static void main(String[] args) {

		
		System.out.println("매개변수의 개수 : " + args.length);
		
		for(int i=0;i<args.length;i++)
			System.out.println("args[" + i + "] =\"" + args[i] + "\"" );
		
		
		/*
		 * Run --> Run configurations --> Argument 에서 단어 입력
		 * 입력하고 실행을 누르면 args로 들어온다.
		 */
	}

}