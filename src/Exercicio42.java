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
public class Exercicio42 {
static int somarDigitos(long n){n=Math.abs(n);return n<10?(int)n:(int)(n%10)+somarDigitos(n/10);}
 public static void main(String[] args){System.out.println(somarDigitos(482));System.out.println(somarDigitos(-905));}
}

