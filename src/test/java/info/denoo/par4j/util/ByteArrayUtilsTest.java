package info.denoo.par4j.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ByteArrayUtilsTest {

	@Test
	public void testToHexString() throws Exception {
		assertEquals("50415220322e30004946534300000000", ByteArrayUtils.toHexString(new byte[] { 'P', 'A', 'R', ' ',
				'2', '.', '0', '\0', 'I', 'F', 'S', 'C', '\0', '\0', '\0', '\0' }));
	}

}
