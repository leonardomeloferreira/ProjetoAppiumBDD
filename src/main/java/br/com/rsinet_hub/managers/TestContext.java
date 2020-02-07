package br.com.rsinet_hub.managers;

public class TestContext {
	private DriverManager driverManager;
	private PageFactoryManager pageObjectManager;
	
	public TestContext() {
		driverManager = new DriverManager();
		pageObjectManager = new PageFactoryManager(driverManager.getDriver());
	}

	public DriverManager getDriverManager() {
		return driverManager;
	}

	public PageFactoryManager getPageFactoryManager() {
		return pageObjectManager;
		
	}
}
