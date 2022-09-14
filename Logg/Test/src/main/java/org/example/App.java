package org.example;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App
{
    private static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.trace("This is trace msg");
        logger.info("This is information");
        logger.error("this is an error message");
        logger.warn("this is a warning message");
        logger.fatal("This is a fatal msg");

        System.out.println( "Hello World!" );
    }
}
