


    @Test
	public void poscredendials() throws Exception
	{
	    String url = "http://www.magento.com";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		Main m = new Main(driver);
		m.clickOnMyAcc();
		
		Thread.sleep(3000);
		
		Login l = new Login(driver);
		l.typeEmail("sucheendra.abc@gmail.com");
		l.typePassword("Welcome123");
		l.clickOnLogin();
		
		Thread.sleep(3000);
		
		Logout logout = new Logout(driver);
		logout.clickLogOut();
		Thread.sleep(3000);
		driver.quit();

	

}
