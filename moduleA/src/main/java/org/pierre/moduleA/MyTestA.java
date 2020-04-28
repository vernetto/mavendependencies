package org.pierre.moduleA;

import lombok.extern.slf4j.Slf4j;
import org.pierre.moduleB.CPTools;

@Slf4j
public class MyTestA {
    public static void main(String[] args) {
        CPTools.printClasspath();
        log.info("moduleA ciao");
    }
}
