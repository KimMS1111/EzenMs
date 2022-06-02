
public class BankAccount2 {
	
	int balance; // 잔액
	//멤버변수, 인스턴스변수
	// 원칙적으로 변수는 외부에서 직접 접근을 금지, 정보은닉 목적 중 무결성

	
	
//	private int sum; // 이렇게 private을 추가
//	// getter, setter ===> get값 출력,  set값 입력
//	void setSum(int sum) {
//		this.sum = sum;
//	}
//	
//	int getSum() {
//		return this.sum;
//	}
	
	
	int deposit(int amount) {  //입급
		balance += amount;
		
		return balance;
	}
	
	int withdraw(int amount) { //출금
		balance -= amount;
		return balance;
	}
	
	int checkBanance() { //잔고확인
		System.out.println("잔액 : " + balance);
		return 0;
		
	}
}	
	
class MainClass2 {
	public static void main(String[] args) {
		//아래 주석처럼 출력하기 위한 코드를 입력
		//System.out.println(); ----> 사용금지
		
		BankAccount2[] bank = new BankAccount2[3];		
		
		bank[0] = new BankAccount2();
		bank[1] = new BankAccount2();
		bank[2] = new BankAccount2();
		
		bank[0].deposit(10000);
		bank[0].withdraw(3000);
		bank[0].checkBanance();
		
		System.out.println(bank[0].checkBanance());
	}

}
// 잔액 : 10000
// 잔액 : 7000   이렇게 출력되게 만들기