package com.frost.client.module;

public abstract class Module {
    private final String name;
    private final String description;
    private final Category category;
    private boolean enabled;
    private String keybind;

    public Module(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.enabled = false;
        this.keybind = "None";
    }

    public void toggle() {
        this.enabled = !this.enabled;
        if (this.enabled) onEnable();
        else onDisable();
    }

    public void onEnable() {}
    public void onDisable() {}
    public void onUpdate() {}

    public String getName() { return name; }
    public String getDescription() { return description; }
    public Category getCategory() { return category; }
    public boolean isEnabled() { return enabled; }
    public String getKeybind() { return keybind; }
    public void setKeybind(String keybind) { this.keybind = keybind; }
}
