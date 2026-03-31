package ConstantsData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConstantsData {
	
	public static final String Prop_File_Path="src/main/java/RealTimeProject/Testng/Global.properties";
	public static final String ScreenShotPath="target/FailedImages/"+
			 LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss")) +
			"_Test.png";
}
