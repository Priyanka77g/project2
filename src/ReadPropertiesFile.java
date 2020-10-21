
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadPropertiesFile {
@Test
public void m1() throws Exception {
	Properties p = new Properties();
	FileInputStream fis =new FileInputStream("./AnyName.properties");
	p.load(fis);
	String val = p.getProperty("Browser");
	String xval = p.getProperty("XL_SheetName");
	Reporter.log(val+" "+xval, true);
			
	
}
}
