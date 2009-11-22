package info.denoo.par4j.model;

import info.denoo.par4j.util.ByteArrayUtils;

import java.util.Arrays;

/**
 * 
 * @author Job
 *
 */
public class Md5Checksum {
	private byte[] data;
	
	
	public Md5Checksum(byte[] data){
		this.data = Arrays.copyOf(data, data.length);
	}
	
	public byte[] getData() {
		return data;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(data);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Md5Checksum other = (Md5Checksum) obj;
		if (!Arrays.equals(data, other.data))
			return false;
		return true;
	}

	@Override
	public String toString() {
		System.out.println(Arrays.toString(data));
		return "Md5Checksum [data=" + ByteArrayUtils.toHexString(data) + "]";
	}
	
	

}
