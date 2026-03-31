package utilities;

import java.io.FileReader;

import java.io.IOException;
import java.util.Properties;

import ConstantsData.ConstantsData;

public class Fetchdatafromproperty {
    
	public static Properties getDataFromProperty() throws IOException
	{
		FileReader reader=new FileReader(ConstantsData.Prop_File_Path);
		Properties prop=new Properties();
		prop.load(reader);
		return(prop);
		
		
	}
	
	
	
}
