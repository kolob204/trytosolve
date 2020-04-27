package MyLis;


import com.codeborne.selenide.logevents.SimpleReport;
import org.testng.ITestResult;
import org.testng.TestNG;

import org.testng.internal.ExitCodeListener;

public class TextReport extends ExitCodeListener {

    protected SimpleReport report = new SimpleReport();

 
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
