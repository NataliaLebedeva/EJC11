package com.epam.homework3.posibilities;

public class MuteQuacl implements IQuackable {

    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
