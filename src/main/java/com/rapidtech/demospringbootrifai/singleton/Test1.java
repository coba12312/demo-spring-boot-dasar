package com.rapidtech.demospringbootrifai.singleton;

public class Test1 {
    private static Test1 test1;

    public static Test1 getInstance(){
        if(test1 == null){
            test1 = new Test1();
        }
        return test1;
    }

    private Test1(){

    }
}
