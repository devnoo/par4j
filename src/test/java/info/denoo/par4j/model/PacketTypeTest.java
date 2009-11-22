package info.denoo.par4j.model;

import static org.junit.Assert.*;
import info.denoo.par4j.Constants;

import org.junit.Test;


public class PacketTypeTest {
	
	@Test
	public void testValueOf() throws Exception {
		assertEquals(PacketType.CREATOR_PACKET, PacketType.valueOf(Constants.CREATOR_PACKET_SIGNATURE));
	}
	
	@Test
	public void testValueOf_unknown() throws Exception {
		assertEquals(PacketType.CREATOR_PACKET, PacketType.valueOf(Constants.CREATOR_PACKET_SIGNATURE));
	}


}
