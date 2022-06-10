package com.company.MagicBox_bounded;

public class MagicBox_bounded<T extends Animal> {
private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
