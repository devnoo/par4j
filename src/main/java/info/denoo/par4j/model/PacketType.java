package info.denoo.par4j.model;

import java.util.Arrays;

import info.denoo.par4j.Constants;

/**
 * The type of par packet, in principle any packet type is allowed, but this enum defines the supported packet types for par4j.
 * @author Job de Noo
 *
 */
public enum PacketType{
	FILE_VERIFACTION(Constants.FILE_VERIFCATION_SIGNATURE),
	FILE_DESCRIPTION(Constants.FILE_DESCIPTION_SIGNATURE),
	MAIN_PACKET(Constants.MAIN_PACKET_SIGNATURE),
	RECOVERY_BLOCK_PACKET(Constants.RECOVERY_BLOCK_SIGNATURE),
	CREATOR_PACKET(Constants.CREATOR_PACKET_SIGNATURE);

	byte[] typeSignature;
	
	private PacketType(byte[] typeSignature){
		this.typeSignature = typeSignature;
	}

	public static PacketType valueOf(byte[] creatorPacketSignature) {
		for (PacketType packetType: values()){
			if (Arrays.equals(packetType.typeSignature,creatorPacketSignature)){
				return packetType;
			}
		}
		return null;
	}
	
}
