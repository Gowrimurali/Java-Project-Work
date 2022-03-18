package com.spartaglobal.gm.Log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SortLogger {
    public static Logger logger = Logger.getLogger("sorterLogger");

    public static void createHandler(){
            try {
                Handler fileHandler = new FileHandler("src/main/java/com/spartaglobal/gm/Log/SorterLog.log",true);
                logger.addHandler(fileHandler);
                fileHandler.setFormatter(new CustomFormatter());

            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public static void InfoMessage(String Message){
        logger.log(Level.INFO,Message);
    }

    public static void warningMessage(String Message){
        logger.log(Level.WARNING,Message);
    }


}
