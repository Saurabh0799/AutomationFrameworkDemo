package com.assignments.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	 private static ExtentReports extent;

	    public static ExtentReports getExtentReports() {
	        if (extent == null) {
	            extent = new ExtentReports();
	            ExtentSparkReporter spark = new ExtentSparkReporter("target/SparkReport.html");
	            extent.attachReporter(spark);
	        }
	        return extent;
	    }

}
