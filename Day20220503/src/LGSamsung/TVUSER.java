package LGSamsung;

public class TVUSER {

	public static void main(String[] args) {
		TV tv = new SamsungTv();
		tv.powerON();
		tv.powerOFF();
		tv.volumeUP();
		tv.volumeDOWN();
		
//		BeanFactory fac = new BeanFactory();
//		TV tv = (TV)fac.getBean(args[0]);
//		tv.powerON();
//		tv.powerOFF();
//		tv.volumeUP();
//		tv.volumeDOWN();
		
	}

}
