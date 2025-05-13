import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class OperatingFileAndPath{
	public static void main(String... args) throws IOException {
		File novo = new File("/home/maxwell/Desktop/java_certification/c14/novo.txt");

		if(novo.exists()){
			System.out.println("Caminho absoluto: " + novo.getAbsolutePath());
			System.out.println("É diretório: " + novo.isDirectory());
			System.out.println("Caminho-pai: " + novo.getParent());
			if(novo.isFile()){
				System.out.println("Tamanho: " + novo.length());
				System.out.println("Modificado em: " + novo.lastModified());
			} else {
				for(File arquivo : novo.listFiles()){
					System.out.println("    " + arquivo.getName());
				}
			}
		} else {
			System.out.println("Não existe!");
		}


		Path novoPath = Path.of("/home/maxwell/Desktop/java_certification/c14/novo.txt");
		if(Files.exists(novoPath)){
			System.out.println("Caminho absoluto: " + novoPath.toAbsolutePath());
			System.out.println("É diretório: " + Files.isDirectory(novoPath));
			System.out.println("Caminho-pai: " + novoPath.getParent());
			if(Files.isRegularFile(novoPath)){
				System.out.println("Tamanho: " + Files.size(novoPath));
				System.out.println("Modificado em: " + Files.getLastModifiedTime(novoPath));
			} else {
				try(Stream<Path> stream = Files.list(novoPath)){
					stream.forEach(p -> System.out.println("    " + p.getFileName()));
				}
			}
		}

		Path pathOperations = Paths.get("/land/hippo/harry.happy");
		System.out.println("Nome do path: " + pathOperations);
		for(int i = 0; i< pathOperations.getNameCount(); i++) System.out.println("    Elemento " + i + " é: " + pathOperations.getName(i));

		var path1 = Path.of("/felino/../pantera");
		var path2 = Path.of("comida");
		System.out.println("Paths concatenados: " + path1.resolve(path2));

		var relative1 = Path.of("endereco1");
		var relative2 = Path.of("rua1/rua2/endereco2");
		System.out.println("Caminho de dentro do endereco 1 para o endereco 2: " + relative1.relativize(relative2));
		System.out.println("Caminho de dentro do endereco 2 para o endereco 1: " + relative2.relativize(relative1));

		var diretorio = Path.of("/home/maxwell/Desktop/java_certification/c14/diretorio");
		Files.createDirectory(diretorio);

		var target = diretorio.resolve(Path.of("novo.txt"));
		var source = novoPath.resolve(Path.of("novo.txt"));
		Files.copy(source, target);

		var sourceMove = target;
		var targetMove = Path.of("/home/maxwell/Desktop/java_certification/c14/novo.txt/novoMoved.txt");
		Files.move(sourceMove, targetMove);
	}

	void copy(Path source, Path target) throws IOException{
		Files.move(source, target, LinkOption.NOFOLLOW_LINKS, StandardCopyOption.ATOMIC_MOVE);
	}
}