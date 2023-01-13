package ch11;

import java.rmi.Remote;

public class TV implements Controllable, RemoteControllable, Remote {

	@Override
	public void remoteOn() {
		System.out.println("리모콘으로 TV를 켠다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void remoteOff() {
		System.out.println("리모콘으로 TV를 끈다.");
		// TODO Auto-generated method stub

	}
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켠다.");
		// TODO Auto-generated method stub

	}
	public void turnOff() {
		System.out.println("TV를 끈다.");
		// TODO Auto-generated method stub
		
	}

}
