package com.fanzhao.stream;

public class Methods {
    public Actors apply(String s) {
        return new Actors(s.split("，")[0],Integer.parseInt(s.split("，")[1]));
    }

}
