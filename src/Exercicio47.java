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
public class Exercicio47 {
static String normalizar(String s){return s.trim().toLowerCase(Locale.ROOT);}
 public static void main(String[] args){List<String> nomes=List.of(" Ana ","", " Beto ","  ");Function<String,String> pipeline=String::trim;List<String> saida=nomes.stream().map(pipeline.andThen(Exercicio47::normalizar)).filter(s->!s.isEmpty()).toList();System.out.println(saida);}
}

