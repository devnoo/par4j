package info.denoo.par4j;

import static org.junit.Assert.*;

import java.util.List;

import info.denoo.par4j.model.Packet;
import info.denoo.par4j.model.PacketHeader;
import info.denoo.par4j.util.ClasspathResource;

import org.junit.Test;

public class Par2FileTest {

	@Test
	public void testReadPacketHeader() {
		Par2File par2File = new Par2File(new ClasspathResource("valid/test.par2").getFile());
		par2File.open();
		PacketHeader packetHeader = par2File.readPacketHeader();
		assertNotNull(packetHeader);
		System.out.println(par2File.readPacketHeader());
	}
	
	@Test
	public void testReadPacket() {
		Par2File par2File = new Par2File(new ClasspathResource("valid/test.par2").getFile());
		par2File.open();
		Packet packet = par2File.readPacket();
		assertNotNull(packet);
	}
	

	@Test
	public void getAllPackets() {
		Par2File par2File =  Par2File.loadFromDisk(new ClasspathResource("valid/test.par2").getFile());
		List<Packet> packets = par2File.getPackets();
		assertNotNull(packets);
		assertEquals(10, packets.size());
		System.out.println(packets);

	}

}
