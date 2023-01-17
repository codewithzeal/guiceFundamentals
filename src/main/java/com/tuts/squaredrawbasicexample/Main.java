package com.tuts.squaredrawbasicexample;

import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        //this is how we draw square consuming draw interface
        drawShape d=new drawSquareImpl();
        drawShape d1=new drawCircleImpl();
        d.draw();
        d1.draw();
        //but instansiating our draw is not our job
        //thus we will use injector for the same
        Injector injector=null;
    }
}
