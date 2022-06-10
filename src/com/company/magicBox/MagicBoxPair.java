package com.company.magicBox;

public class  MagicBoxPair<S,T> {
    private S first;
    private T second;

    public MagicBoxPair(S first, T second) {
        this.first = first;
        this.second = second;
    }

    public S getFirst(){
        return first;
    }

    public  T getSecond(){
        return second;
    }


}
