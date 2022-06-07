package com.company.magicBox;

class MagicBox {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "MagicBox{" +
                "object=" + object +
                '}';
    }
}
