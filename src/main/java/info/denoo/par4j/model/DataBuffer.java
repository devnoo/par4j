package info.denoo.par4j.model;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class DataBuffer {

	private ByteBuffer buffer;
	
	private byte[] byte8 = new byte[8];
	private byte[] byte16 = new byte[16];

	public DataBuffer(ByteBuffer buffer) {
		buffer.rewind();
		buffer.order(ByteOrder.LITTLE_ENDIAN);
		this.buffer = buffer;
	}
	
	public long getLong(){
		return buffer.getLong();
	}
	
	public Md5Checksum getMd5Checksum(){
		buffer.get(byte16);
		return new Md5Checksum(byte16);
	}
	
	public byte[] get8ByteArray(){
		buffer.get(byte8);
		return Arrays.copyOf(byte8, 8);
	}
	
	public byte[] get16ByteArray(){
		buffer.get(byte16);
		return Arrays.copyOf(byte16, 16);
	}

	public ByteBuffer getByteBuffer(){
		return buffer;
	}
	
}
