package info.denoo.par4j.model;


/**
 * Representation of the packet header within Par2 files.
 * @author Job de Noo
 *
 */
public class PacketHeader {
	private long packetLength;
	private PacketType packetType;
	private Md5Checksum md5;
	private Md5Checksum recoverySetId;
	
	public long getPacketLength() {
		return packetLength;
	}

	public void setPacketLength(long packetLength) {
		this.packetLength = packetLength;
	}

	public PacketType getPacketType() {
		return packetType;
	}

	public void setPacketType(PacketType packetType) {
		this.packetType = packetType;
	}

	public Md5Checksum getMd5() {
		return md5;
	}

	public void setMd5(Md5Checksum md5) {
		this.md5 = md5;
	}

	public Md5Checksum getRecoverySetId() {
		return recoverySetId;
	}

	public void setRecoverySetId(Md5Checksum recoverySetId) {
		this.recoverySetId = recoverySetId;
	}

	@Override
	public String toString() {
		return "PacketHeader [md5=" + md5 + ", packetLength=" + packetLength + ", packetType=" + packetType
				+ ", recoverySetId=" + recoverySetId + "]";
	}
	
	
}
