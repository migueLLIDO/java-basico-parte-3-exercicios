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
public class Exercicio45 {
interface Desconto{double aplicar(double valor);}static class SemDesconto implements Desconto{public double aplicar(double v){return v;}}static class Vip implements Desconto{public double aplicar(double v){return v*.9;}}static class Cupom implements Desconto{public double aplicar(double v){return Math.max(0,v-25);}}static double totalComDesconto(double v,Desconto d){return d.aplicar(v);}
 public static void main(String[] args){for(Desconto d:List.of(new SemDesconto(),new Vip(),new Cupom()))System.out.println(totalComDesconto(200,d));}
}

