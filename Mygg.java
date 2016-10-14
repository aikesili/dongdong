import java.io.*;
import java.net.*;
public class Mygg{
	public static void main(String[] args) throws Exception{
		URL url=new URL("http://image.tianjimedia.com/uploadImages/2014/320/41/982J0S8K6WSZ.jpg");
		URLConnection con=url.openConnection();
		InputStream in=con.getInputStream();
		FileOutputStream fos=new FileOutputStream("E:\\aay.jpg");
		byte[] b=new byte[1024];
		int len=0;
		while((len=in.read(b))!=-1){
			fos.write(b,0,len);
		}
	}
// 	public static void getText1()throws Exception{

// 	}

// }
// public class MyWebBorser{
// 	public MyWebBorser(String ip,int port){
// 		this.ip=ip;
// 		this.port=port;
// 	}
// 	public void getText(){
// 		Socket s=new Socket(ip,port);
// 		OutputStream os=s.getOutputStream();
// 		PrintWriter pw=new PrintWriter(os,true);
// 		pw.println("GET http://"+ip+":"+port+"/myweb/index.html HTTP/1.1");
// 		pw.println("Host:172.30.31.152:8080");
// 		pw.println("Accept:text/html");
// 		pw.println("Accept-Language:zh-CN,zh;q=0.8");
// 		pw.println();//这个空行代表着请求头的结束符


// 		//打印响应头和返回的数据
// 		InputStream in=s.getInputStream();
// 		byte[] b=new byte[1024];
// 		int len=in.read(b);
// 		System.out.println(new String(b,0,len));

// 		s.close();
// 	}
// 	public void getPic(){
// 		Socket s=new Socket(ip,port);
// 		OutputStream os=s.getOutputStream();
// 		PrintWriter pw=new PrintWriter(os,true);
// 		pw.println("GET http://"+ip+":"+port+"/myweb/index.html HTTP/1.1");
// 		pw.println("Host:172.30.31.152:8080");
// 		pw.println("Accept:text/html");
// 		pw.println("Accept-Language:zh-CN,zh;q=0.8");
// 		pw.println();//这个空行代表着请求头的结束符


// 		//打印响应头和返回的数据
// 		InputStream in=s.getInputStream();
// 		byte[] b=new byte[1024];
// 		int len=in.read(b);
// 		System.out.println(new String(b,0,len));

// 		s.close();
// 	}
}