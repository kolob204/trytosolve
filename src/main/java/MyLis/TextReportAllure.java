package MyLis;

import org.testng.ITestResult;
import org.testng.reporters.ExitCodeListener;

import MyU.CustomReport;



public class TextReportAllure extends ExitCodeListener {

    CustomReport report = new CustomReport();

 
    @Override
    public void onTestStart(ITestResult testResult){
        report.start();

    }

 
    @Override
    public void onTestFailure(ITestResult testResult){
        report.finish(testResult.getName());
 
    }

    @Override
    public void onTestSuccess(ITestResult testResult){
        report.finish(testResult.getName());
    }




}
