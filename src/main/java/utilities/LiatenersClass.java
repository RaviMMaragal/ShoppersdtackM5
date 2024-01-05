package utilities;

public class ListenersUtility extends BaseClass implements ITestListener{
	public void onTestFailure (ITestResult result) {

		String failedMethod-result.getMethod().getMethodName().toString();

		TakesScreenshot ts (TakesScreenshot) driver:

		File tempFile-ts.getScreenshotAs ( OutputType. FILE);

		String currentTime LocalDateTime.now().toString().replace(':','')

		File permanentFile

		try {

		new File("./src/test/resources/screenshots/"+currentTime+failedMethod+".png");

		FileHandler.copy(tempFile, permanentFile);

		} catch (IOException e) {
			e.printStackTrace();

			@Override

			public void onTestStart (ITestResult result) ( // TODO Auto-generated method stub

			@Override

			public void onTestSuccess (ITestResult result) (

			// TODO Auto-generated method stub
		}

}
