package info.denoo.par4j.util;

public class ByteArrayUtils {
	private static final String hexValues[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

	public static String toHexString(byte[] data) {
        if (data == null || data.length <= 0) {
        	return null;
        }
        
        StringBuilder output = new StringBuilder();
        
        for ( int index = 0; index < data.length; index++ ) {
            byte value = (byte) ( data[ index ] & 0xf0 );
            value = (byte) ( value >>> 4 );
            value = (byte) ( value & 0x0f );
            
            output.append( hexValues[ (int) value ] );
            value = (byte) ( data[ index ] & 0x0f );
            output.append( hexValues[ (int) value ] );
        }
        
        return output.toString();
    }


}
