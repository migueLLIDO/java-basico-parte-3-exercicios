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
public class Exercicio35 {
record Produto(int id,String nome){} static java.util.Optional<Produto> buscar(java.util.List<Produto> ps,int id){return ps.stream().filter(p->p.id()==id).findFirst();}
 public static void main(String[] args){var ps=java.util.List.of(new Produto(1,"Teclado"),new Produto(2,"Mouse"));Produto p=buscar(ps,2).orElseThrow(()->new IllegalArgumentException("Produto não encontrado"));System.out.println(p);}
}

