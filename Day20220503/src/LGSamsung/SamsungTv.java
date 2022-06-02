package LGSamsung;

public class SamsungTv implements TV {
	@Override
	public void powerON() {
		System.out.println("sam...on");
	}
	@Override
	public void powerOFF() {
		System.out.println("sam...off");
	}
	@Override
	public void volumeUP() {
		System.out.println("vol...up");
	}
	@Override
	public void volumeDOWN() {
		System.out.println("vol...down");
	}
}