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
public class Exercicio34 {

 public static void main(String[] args){java.util.List<String> nomes=java.util.List.of("ana","beto","caio");nomes.forEach(System.out::println);java.util.List<String> maiusculos=nomes.stream().map(String::toUpperCase).toList();System.out.println(maiusculos);}
}

