package com.netherbyte.bgtk.version;

import com.netherbyte.svlib.Version;

public interface GameVersion {

    String getName();

    Version getVersion();

    SaveVersion getSaveVersion();

    int getDataVersion();

    int getAssetVersion();

    int getProtocolVersion();

    default boolean isStable() {
        return true;
    }
}