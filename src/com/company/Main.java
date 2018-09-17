package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BClazz bClazz = new BClazz();
        ICallback callbackListener = new AClazz();
        bClazz.registerCallbacklistener(callbackListener);
        bClazz.fire();
    }
}


