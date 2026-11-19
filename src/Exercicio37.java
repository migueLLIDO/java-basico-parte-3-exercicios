import java.io.*;
import java.math.*;
import java.net.*;
import java.net.http.*;
import java.nio.file.*;
import java.sql.*;
import java.time.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.sql.DataSource;
public class Exercicio37 {
static String ler(Path caminho) throws IOException{return Files.readString(caminho);}
 public static void main(String[] args){try{System.out.println(ler(Path.of("README.md")));}catch(IOException e){System.err.println("Falha ao ler arquivo: "+e.getMessage());}}
}

