package com.tv;

class TVex1 {
		
	protected boolean power;
		protected int channel;
		protected int volume;
		
		public void power() {power = !power;}
		public void channelUP() {channel++;}
		public void channelDown() {channel--;}
		public void volumeUP() {volume++;}
		public void volumeDown() {volume--;}
}		

class VCR {
	
	protected int counter;
	
	public void play() {}
	public void stop() {}
	public void reset() {counter=0;}
	public int getCounter() {return counter;}
	public void setCOunter(int counter) {
		this.counter = counter;
	}
}

interface ICVR {
	public void play();
	public void	stop();
	public void	reset();
	public int getCounter();
	public void setCounter(int c);
}

class TCVR extends TVex1 implements ICVR {
	
	VCR vcr = new VCR();
	
	public static void main(String[] args) {
		TCVR tv = new TCVR();
		tv.play();
		tv.stop();
		tv.channelDown();
		System.out.println(tv.getCounter());
		
	}

	@Override
	public void play() { vcr.play();}

	@Override
	public void stop() { vcr.stop();}

	@Override
	public void reset() { vcr.reset();}

	@Override
	public int getCounter() {
		return vcr.getCounter();
	}

	@Override
	public void setCounter(int c) {
		vcr.setCOunter(c);
	}
	
}

