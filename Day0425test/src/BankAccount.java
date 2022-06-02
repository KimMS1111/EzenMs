
public class BankAccount {
	
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
	
	void checkBanance() { //잔고확인
		System.out.println("잔액 : " + balance);
	}
	
}	
	
class MainClass{
	public static void main(String[] args) {
		//아래 주석처럼 출력하기 위한 코드를 입력
		//System.out.println(); ----> 사용금지
		
		BankAccount kim = new BankAccount(); // 생성자 호출---> 현재는 디폴트 생성자 호출
		kim.balance = 10000;
		kim.checkBanance();
		kim.withdraw(3000);
		kim.checkBanance();
		System.out.println(); // 줄바꿈용
		
		BankAccount park = new BankAccount(); // 생성자 호출---> 현재는 디폴트 생성자 호출
		park.balance = 0;
		park.checkBanance();
		park.deposit(50000);
		park.checkBanance();
		park.withdraw(35000);
		park.checkBanance();
		System.out.println();
		
		BankAccount lee = new BankAccount(); // 생성자 호출---> 현재는 디폴트 생성자 호출
		lee.balance = 0;
		lee.checkBanance();
		lee.deposit(15000);
		lee.checkBanance();
		lee.withdraw(5000);
		lee.checkBanance();
		System.out.println();
		
		lee = kim;
		lee.checkBanance();
		lee.deposit(10000);
		lee.checkBanance();
		kim.checkBanance();
		park.checkBanance();
		
		
	}

}
// 잔액 : 10000
// 잔액 : 7000   이렇게 출력되게 만들기