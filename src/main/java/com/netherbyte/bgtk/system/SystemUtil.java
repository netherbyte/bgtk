package com.netherbyte.bgtk.system;

import com.netherbyte.svlib.Version;

public class SystemUtil {
    public static final String OS_NAME = System.getProperty("os.name").toLowerCase();
    public static final Version OS_VERSION = Version.parse(System.getProperty("os.version").toLowerCase());
    public static final String OS_ARCH = System.getProperty("os.arch").toLowerCase();
    public static final Version OS_SEMVER = Version.parse(System.getProperty("os.version").toLowerCase());

    public static final Version OSVERREQ_WIN = Version.parse("10.0");
    public static final Version OSVERREQ_MAC = Version.parse("11.7.7");
    public static final Version OSVERREQ_LIN = Version.parse("4.14.316");
}
