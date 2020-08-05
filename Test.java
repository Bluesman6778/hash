import org.apache.commons.codec.digest.DigestUtils;
public class Test{
	public static void main(String[] args){
		System.out.println(args[0]);
		String hexString = DigestUtils.sha256Hex(args[0]);
		System.out.println(hexString);
	}
}
