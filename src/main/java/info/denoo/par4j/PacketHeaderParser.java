package info.denoo.par4j;

import info.denoo.par4j.model.DataBuffer;
import info.denoo.par4j.model.Md5Checksum;
import info.denoo.par4j.model.PacketHeader;
import info.denoo.par4j.model.PacketType;

import java.nio.ByteBuffer;

public class PacketHeaderParser {

	public PacketHeader parse(DataBuffer dataBuffer) {
		
		dataBuffer.get8ByteArray();

		// if ( !Packet.isValidPacketSignature(buffer8) ) throw new
		// InvalidPacketException("Unknown packet signature " +
		// ByteArrayUtility.toHexString(buffer8));
		//        
		
		PacketHeader packetHeader = new PacketHeader();
		
		packetHeader.setPacketLength(dataBuffer.getLong());
		packetHeader.setMd5(dataBuffer.getMd5Checksum());
		packetHeader.setRecoverySetId(dataBuffer.getMd5Checksum());
		packetHeader.setPacketType(PacketType.valueOf(dataBuffer.get16ByteArray()));
		return packetHeader;
	}

}
