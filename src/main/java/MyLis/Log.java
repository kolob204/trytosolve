package MyLis;

import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.internal.ExitCodeListener;

import MyU.Helpers;
 

public class Log extends ExitCodeListener {

    //Logger log = Logger.getLogger(getClass().getName());
    //public static final Logger logger = Logger.getLogger(TestListener.class);
	private static final Logger Log = Logger.getLogger(Log.class.getName());


    @Override
    public void onTestStart(ITestResult testResult){
        super.onTestStart(testResult);
        Log.info("\"" + testResult.getMethod().getMethodName() + "\"" + " test started________");
    }


    @Override
    public void onTestFailure(ITestResult testResult){
        super.onTestFailure(testResult);
        Helpers.tackeScreenshot();
    }

    @Override
    public void onTestSuccess(ITestResult testResult){
        super.onTestSuccess(testResult);
        Log.info("\"" + testResult.getMethod().getMethodName() + "\"" + " test finished with success________");
    }



    //Info Level Logs
    public static void info (String message) {
        Log.info(message);
    }

    //Warn Level Logs
    public static void warn (String message) {
        Log.warn(message);
    }

    //Error Level Logs
    public static void error (String message) {
        Log.error(message);
    }

    //Fatal Level Logs
    public static void fatal (String message) {
        Log.fatal(message);
    }

    //Debug Level Logs
    public static void debug (String message) {
        Log.debug(message);

    }


}
