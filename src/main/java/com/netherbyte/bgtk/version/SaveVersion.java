package com.netherbyte.bgtk.version;

public class SaveVersion {
    public final int number;
    public final boolean backwardsCompatible;

    public SaveVersion(int number, boolean backwardsCompatible) {
        this.number = number;
        this.backwardsCompatible = backwardsCompatible;
    }
}
