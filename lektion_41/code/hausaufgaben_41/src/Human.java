//package de.ait.objekt.models;

public class Human {

    public int age;
    public boolean isWorker;

    public Human(int age, boolean isWorker) {
        this.age = age;
        this.isWorker = isWorker;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Human that = (Human) obj;
        return this.age == that.age && this.isWorker == that.isWorker;
    }
}
