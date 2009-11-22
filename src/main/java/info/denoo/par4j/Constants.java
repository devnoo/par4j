package info.denoo.par4j;

public abstract class Constants {

	public static final byte[] PACKET_START_ID = new byte[] { 'P', 'A', 'R', '2', '\0', 'P', 'K', 'T' };

	public static final byte[] FILE_VERIFCATION_SIGNATURE = new byte[] { 'P', 'A', 'R', ' ', '2', '.', '0', '\0', 'I',
			'F', 'S', 'C', '\0', '\0', '\0', '\0' };
	public static final byte[] FILE_DESCIPTION_SIGNATURE = new byte[] { 'P', 'A', 'R', ' ', '2', '.', '0', '\0', 'F',
			'i', 'l', 'e', 'D', 'e', 's', 'c' };
	public static final byte[] MAIN_PACKET_SIGNATURE = new byte[] { 'P', 'A', 'R', ' ', '2', '.', '0', '\0', 'M', 'a',
			'i', 'n', '\0', '\0', '\0', '\0' };
	public static final byte[] RECOVERY_BLOCK_SIGNATURE = new byte[] { 'P', 'A', 'R', ' ', '2', '.', '0', '\0', 'R',
			'e', 'c', 'v', 'S', 'l', 'i', 'c' };
	public static final byte[] CREATOR_PACKET_SIGNATURE = new byte[] { 'P', 'A', 'R', ' ', '2', '.', '0', '\0', 'C',
			'r', 'e', 'a', 't', 'o', 'r', '\0' };

	private Constants() {

	}
}
