package com.sii.academy.javaweek4_1.movielibrary.movie.worker;

public class Actor extends MovieWorker{

    public Actor(String name, String lastName) {
        super(name, lastName);
    }

    public void play() {
        System.out.println("Lalalala");
    }

    @Override
    public String toString() {
        return String.format("%s %s,",this.getName(), this.getLastName());
    }
}
