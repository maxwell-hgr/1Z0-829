import java.io.*;
import java.nio.file.*;

public class FilesAndDirectories{
	public static void main(String... args){
		File novo = new File("/home/maxwell/Desktop/java_certification/c14/novo.txt");
		Path novoPath = novo.toPath();
		File novoFile = novoPath.toFile();

		Path novoLongo = FileSystems.getDefault().getPath("/home/maxwell/Desktop/java_certification/c14/novoLongo.txt");
	}
}