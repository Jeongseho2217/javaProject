package com.di.spring_di_xml_annotation_ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class TV {
    private Speaker speaker;
  
    @Autowired
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