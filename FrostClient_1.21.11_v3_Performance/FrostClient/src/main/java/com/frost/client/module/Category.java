package com.frost.client.module;

public enum Category {
    COMBAT("Combat (Vape/Krypton)"),
    MOVEMENT("Movement"),
    ANARCHY("Anarchy & CPvP (Rusherhack)"),
    WORLD("World & Exploration"),
    MINING("Building & Mining"),
    INVENTORY("Inventory & Gear"),
    UTILITY("Utility & Automation (Meteor)"),
    CHAT("Chat & Social"),
    PHYSICS_EXPLOITS("Physics Exploits"),
    VISUALS("Visuals & Environment"),
    PERFORMANCE("Low-End Performance"),
    SYSTEM("UI & System");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
