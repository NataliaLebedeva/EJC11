package com.epam.strategy;

public abstract class AbstractDuck {
    protected SpeakBehavior speakBehavior;
    private Object voice;

    public abstract void getInfo();
    
    public AbstractDuck(SpeakBehavior speakBehavior) {
        
    }


    public Object getVoice() {
        return voice;
    }
}
