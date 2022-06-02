package SamsungLG;

public class TestUser {

	public static void main(String[] args) {

//		SamsungTV  tv = new SamsungTV();
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
		
		LGTV tv = new LGTV();
		tv.TurnOn();
		tv.TurnOff();
		tv.SoundUp();
		tv.SoundDown();
	}

}
