package com.sii.academy.javaweek4_1.movielibrary.movie.worker;

public class Director extends MovieWorker {

    public Director(String name, String lastName) {
        super(name, lastName);
    }

    public void doDirectorWork() {
        System.out.print("Something");
    }


    @Override
    public String toString() {
        return String.format("%s %s,", this.getName(), this.getLastName());
    }
}
