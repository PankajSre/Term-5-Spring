import java.nio.*;
import java.nio.channels.*;
import java.io.*;

public class NIOChannel
{
	
	public static void main(String ... args)throws IOException
	{
		FileInputStream fin = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Core_Java\\nio\\LambdaExpression.txt");
		
		ReadableByteChannel source = fin.getChannel();
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Core_Java\\nio\\Lambda.txt");
		
		WritableByteChannel destination = fout.getChannel();
		
		copyData(source,destination);
		source.close();
		destination.close();
	}
	
	private static void copyData(ReadableByteChannel src ,WritableByteChannel dest) throws IOException
	{
		
		ByteBuffer buffer= ByteBuffer.allocateDirect(20*1024);
		
		while(src.read(buffer) !=-1)
		{
			buffer.flip();
			
			while(buffer.hasRemaining())
			{
				dest.write(buffer);
			}
			buffer.clear();
		}
	}
}