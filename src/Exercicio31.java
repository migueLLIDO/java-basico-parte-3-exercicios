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
public class Exercicio31 {
interface FormaPagamento{boolean pagar(double valor);} static class Pix implements FormaPagamento{public boolean pagar(double v){return v>0;}} static class Cartao implements FormaPagamento{public boolean pagar(double v){return v>0&&v<=5000;}}
 public static void main(String[] args){FormaPagamento[] opcoes={new Pix(),new Cartao()};for(FormaPagamento p:opcoes)System.out.println(p.pagar(250));}
}

