package com.di.spring_di_annotation_ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// Speaker 객체 필요 DI(생성자)
@Component
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