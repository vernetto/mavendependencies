package org.pierre.moduleB;

import java.net.URL;
import java.net.URLClassLoader;

public class CPTools {
    public static void printClasspath() {
        System.out.println(System.getProperty("java.class.path"));
    }
}
