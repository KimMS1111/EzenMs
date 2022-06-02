
public class DiceGame {
/*
 *  주사위 2개를 던진다.
 *  (1,2)
 *  (4,5)
 *  (6,6)
 *  (3,2) ==> break 두 수 합이 5가되면 종료.
 * 
 */
	public static void main(String[] args) {

		while(true) {
		
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
		
			System.out.println("(" + dice1 + " , " + dice2 + ")");
		
		if((dice1 + dice2) == 6) 
			break;
		
		}
	}

}
