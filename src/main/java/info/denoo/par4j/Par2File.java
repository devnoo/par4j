package info.denoo.par4j;

import info.denoo.par4j.model.DataBuffer;
import info.denoo.par4j.model.Packet;
import info.denoo.par4j.model.PacketHeader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import javax.swing.text.Position;

/**
 * Simple representation of a par2 file.
 * @author Job
 *
 */
public class Par2File {
	private File file;
	private FileChannel fileChannel;
	
	private int nextHeaderPosition = 0;
	private int currentPos = 0;

	private ByteBuffer headerBuffer = ByteBuffer.allocate(64);
	
	private PacketHeaderParser packetHeaderParser = new PacketHeaderParser();

	
	
	public Par2File(File file){
		this.file = file;
	}
	
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
	public PacketHeader readPacketHeader(){
		try {
			fileChannel.read(headerBuffer, nextHeaderPosition);
			return packetHeaderParser.parse(new DataBuffer(headerBuffer));
		} catch (IOException e) {
			throw new Par4jException(e);
		}
	}
	
	protected Packet readPacketBody(PacketHeader header) {
		long size = header.getPacketLength();
		if (size > Integer.MAX_VALUE){
			throw new UnsupportedOperationException();
		}
		
		ByteBuffer buffer = ByteBuffer.allocate((int)size);
		fileChannel.read(buffer, currentPos);
		 
		return null;
	}


	protected final Packet readPacket() {
		PacketHeader header = readPacketHeader();
		return new Packet();
	}
	
	public static Par2File loadFromDisk(File file){
		Par2File par2File = new Par2File(file);
		return par2File;
	}

}
