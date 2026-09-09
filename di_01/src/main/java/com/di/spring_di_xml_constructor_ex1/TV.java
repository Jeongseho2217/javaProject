package com.di.spring_di_xml_constructor_ex1;

public class TV {
	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void VolumeUp() {
		speaker.VolumeUp();
	}
	
	public void VolumeDown() {
		speaker.VolumeDown();
	}
}
