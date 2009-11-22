package info.denoo.par4j.model;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;

import org.junit.Before;
import org.junit.Test;


public class DataBufferTest {

	private DataBuffer buffer;
	
	@Before
	public void setup() throws Exception{
		byte[] array = new byte[]{12, 0, 0, 0, 0, 0, 0, 0,
				'M', 'D', '5', 'C', 'H', 'E', 'C', 'K',
				'S', 'U', 'M', '1', '2', '3', '4', '5'
		};
		
		
		buffer = new DataBuffer(ByteBuffer.wrap(array));
		
	}
	
	@Test
	public void testGetLong() {
		assertEquals(12, buffer.getLong());
	}

	@Test
	public void testGetMd5Checksum() {
		buffer.get8ByteArray();
		Md5Checksum expected = new Md5Checksum(new byte[]{'M', 'D', '5', 'C', 'H', 'E', 'C', 'K','S', 'U', 'M', '1', '2', '3', '4', '5'});
		assertEquals(expected, buffer.getMd5Checksum());
	}

	@Test
	public void testGet8ByteArray() {
		assertArrayEquals(new byte[]{ 12,0 ,0,0,0,0,0,0}, buffer.get8ByteArray());
	}

	@Test
	public void testGet16ByteArray() {
		assertArrayEquals(new byte[]{ 12, 0, 0, 0, 0, 0, 0, 0, 'M', 'D', '5', 'C', 'H', 'E', 'C', 'K'}, buffer.get16ByteArray());
	}
}
