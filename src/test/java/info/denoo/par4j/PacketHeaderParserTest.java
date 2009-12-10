package info.denoo.par4j;

import static org.junit.Assert.assertEquals;
import info.denoo.par4j.model.DataBuffer;
import info.denoo.par4j.model.Md5Checksum;
import info.denoo.par4j.model.PacketHeader;
import info.denoo.par4j.model.PacketType;
import info.denoo.par4j.util.ClasspathResource;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the {@link PacketHeaderParser} class.
 * @author Job de Noo
 *
 */
public class PacketHeaderParserTest {
	
	private DataBuffer buffer;
	private PacketHeaderParser parser;
	
	@Before
	public void setup() throws Exception{
		FileChannel channel = new ClasspathResource("valid/test.par2").getRandomAccessFile("rw").getChannel();
		ByteBuffer byteBuffer = ByteBuffer.allocate(64);
		channel.read(byteBuffer);
		parser = new PacketHeaderParser();
		buffer = new DataBuffer(byteBuffer);
	}

	@Test
	public void testParse() throws Exception {
		PacketHeader header = parser.parse(buffer);
		assertEquals(132, header.getPacketLength());
		assertEquals(PacketType.FILE_DESCRIPTION, header.getPacketType());
		byte[] md5 = new byte[]{-63, -39, 127, -8, -92, -105, -78, -34, -36, -105, 9, -121, 20, 66, -77, 87};
		assertEquals(new Md5Checksum(md5), header.getMd5());
		byte[] recoverySetId = new byte[]{-67, -4, -121, -37, -24, -19, -35, -67, 62, 84, 108, 57, -18, -93, -9, 45};
		assertEquals(new Md5Checksum(recoverySetId), header.getRecoverySetId());
	}
}
