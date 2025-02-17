package com.sfx.spring.theory.Config.imports.select;

public class Desk {

    public static void main(String[] args) {
        Desk desk =new Desk();
        desk.setLength(2L);

    }

    private Long length;

    public Long getLength() {

        class Pencil {

            private String color;

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }
        }
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }





}



