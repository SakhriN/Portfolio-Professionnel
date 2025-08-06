package org.example.poo.enums;

public class Enumerations {

    public enum Priority {
        HIGH,

        MEDIUM,

        LOW;
        public static Priority getPriority(String test) {
            switch (test){
                case "A":
                    return HIGH;
                case "B":
                    return MEDIUM;
                case "C":
                    return LOW;
                default:
                    return LOW;
            }
        };
    }


}
