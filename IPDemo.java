import java.net.*;
public class IPDemo{
	public static void main(String[] args) throws Exception{
		InetAddress id=InetAddress.getByName("www.baidu.com");
		System.out.println(id);
	}
}