package org.pierre.moduleB;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.spi.LoggerFactory;

@Slf4j
public class MyTestB {

    public static void main(String[] args) {
        CPTools.printClasspath();
        log.info("moduleB ciao");
    }
}
