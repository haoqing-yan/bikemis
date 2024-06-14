package com.donny.bikemis.model;

/**
 * @author Donny
 * @date 2024/6/13
 */
public enum PartType {
    WHEEL("轮"),
    SEAT("座位"),
    HANDLEBAR("车把"),
    FRAME("车架"),
    PEDAL("踏板"),
    BRAKE("刹车");

    private final String description;

    PartType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
