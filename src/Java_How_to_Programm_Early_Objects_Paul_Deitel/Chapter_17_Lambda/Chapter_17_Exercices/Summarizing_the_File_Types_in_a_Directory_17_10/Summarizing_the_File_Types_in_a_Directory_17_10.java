package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_17_Lambda.Chapter_17_Exercices.Summarizing_the_File_Types_in_a_Directory_17_10;
/*
17.10 (Summarizing the File Types in a Directory) Section 15.3 demonstrated how to get information
about files and directories on disk. In addition, you used a DirectoryStream to display the
contents of a directory. Interface DirectoryStream now contains default method entries, which
returns a Stream. Use the techniques from Section 15.3, DirectoryStream method entries, lambdas
and streams to summarize the types of files in a specified directory.*/

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.Files;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Summarizing_the_File_Types_in_a_Directory_17_10 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Path path = Paths.get("/Users/Alexei/Downloads");
        String[] i = new String[4];

//        Map<String, Long> wordCounts = Files.lines(Paths.get("/Users/Alexei/Downloads"))
        Stream<Path> entries = Files.list(path);
        Stream<Path> test = Files.list(path);
        Stream<Path> test1 = Files.list(path);

        System.out.printf("\tAll the files:\n");
        test.sorted().map(pathName-> pathName.getFileName().toString()).forEach(v -> System.out.printf("%s\n", v));
        System.out.printf("-----------------------------\n");

        System.out.printf("\tAll the files ending with .pdf:\n");
        test1.sorted().map(Path::getFileName).map(Path::toString).filter(s->s.endsWith(".pdf")).forEach(v -> System.out.printf("%s\n", v));
        System.out.printf("-----------------------------\n");

        System.out.printf("\tFiles sorted by extension:\n");
        entries.sorted().filter(v->!v.toFile().isDirectory()).map(Path::getFileName).map(Path::toString).
                collect(Collectors.groupingBy(extension -> extension.substring(extension.lastIndexOf(".")+1), Collectors.toList())).
                forEach((v, s) ->System.out.printf("%s:\n\t%s\n",v,s));
//                {
//                    System.out.printf("%s\n",v);
//                    test.sorted().filter(value->!value.toFile().isDirectory()).map(Path::getFileName).map(Path::toString).map(p->p.substring(p.lastIndexOf(".") + 1))
//                            .forEach(t-> System.out.printf("%s\n",t));
//                });


    }
}

