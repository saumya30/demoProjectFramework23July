package dataProvider;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class ConfigDataProvider {

		Properties pro;
		
		public ConfigDataProvider() throws IOException{
			try
			{
				File src=new File("./Configuration/config.property");
			
			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch(Exception e)
		{
			System.out.println("Exception is" +e.getMessage());
		}
		
		}
	public String getChromepath()
	{
		String path=pro.getProperty("ChromeDriver");
		return path;
	}

	public String getApplicationURL()
	{
		String url=pro.getProperty("URL");
		return url;
	}
	}



