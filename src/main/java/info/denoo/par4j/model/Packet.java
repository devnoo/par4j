package info.denoo.par4j.model;

public class Packet {
	private PacketHeader header;

	private DataBuffer packetData;

	public PacketHeader getHeader() {
		return header;
	}
	
	public void setHeader(PacketHeader header) {
		this.header = header;
	}
	
	public DataBuffer getPacketData() {
		return packetData;
	}
	
	public void setPacketData(DataBuffer packetData) {
		this.packetData = packetData;
	}
	
	
	public static Packet createPacket(PacketHeader header, DataBuffer dataBuffer){
		
	}
	
	
}
