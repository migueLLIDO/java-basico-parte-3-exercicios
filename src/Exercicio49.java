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
public class Exercicio49 {
static double subtotal(double preco,int quantidade){validar(preco,quantidade);return preco*quantidade;}private static void validar(double preco,int quantidade){if(preco<0||quantidade<0)throw new IllegalArgumentException("Preço/quantidade inválido");}private static double desconto(double valor){return valor>=100?valor*.1:0;}static double total(double preco,int quantidade){double s=subtotal(preco,quantidade);return s-desconto(s);}
 public static void main(String[] args){System.out.println(total(80,2));}
}

