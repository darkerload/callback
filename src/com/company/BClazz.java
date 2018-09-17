package com.company;

public class BClazz {

    private ICallback callbackListener;

    public void registerCallbacklistener(ICallback callbackListener){
        this.callbackListener = callbackListener;
    }

    public void fire(){
        System.out.println("fireeeeee");

        if (this.callbackListener != null){
            callbackListener.call();
        }
    }
}
