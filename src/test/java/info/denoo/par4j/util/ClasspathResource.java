package info.denoo.par4j.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.net.URL;

/**
 * 
 * @author Job de Noo
 *
 */
public class ClasspathResource {
	
	private String resource;
	
	public ClasspathResource(String resource){
		this.resource = resource;
	}
	
	public File getFile(){
		return new File(getURL().getFile());
	}
	
	public RandomAccessFile getRandomAccessFile(String mode) throws FileNotFoundException{
		return new RandomAccessFile(getURL().getFile(), mode);
	}
	
	public URL getURL(){
		return Thread.currentThread().getContextClassLoader().getResource(resource);
	}
	

}
