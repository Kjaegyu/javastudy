package ch17.sec04.exam04;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) throws Exception {
		Path path =Paths.get(StreamExample.class.getResource("data.txt").toURI());
		Stream<String>stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line -> System.out.println(line)  );
		stream.close();

	}

}
