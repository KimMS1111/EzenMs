package LGSamsung;

public class LGTV implements TV{
	@Override
	public void powerON() {
		System.out.println("LG...on");
	}
	@Override
	public void powerOFF() {
		System.out.println("LG...off");
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