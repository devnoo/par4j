package info.denoo.par4j;

import info.denoo.par4j.model.PacketHeader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * Simple representation of a par2 file.
 * @author Job
 *
 */
public class Par2File {
	private File file;
	private FileChannel fileChannel;
	
	private int currentPos;

	
	public void open(){
		try {
			fileChannel = new RandomAccessFile(file, "r").getChannel();
		} catch (FileNotFoundException e) {
			throw new Par4JIoException(e);
		}
	}
	
	/**
	 * Reads the next packet header if available. Will return null if no more packet can be found.
	 * 
	 */
	
	public PacketHeader readNextPacketHeader(){

	}
}
