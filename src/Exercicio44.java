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
public class Exercicio44 {
record Pedido(double subtotal,boolean aprovado,String resumo){}static class PedidoService{void validar(int q){if(q<=0)throw new IllegalArgumentException("Quantidade inválida");}double calcular(double p,int q){validar(q);return p*q;}boolean aprovar(double total,double limite){return total<=limite;}Pedido criar(double p,int q,double limite){double t=calcular(p,q);boolean ok=aprovar(t,limite);return new Pedido(t,ok,"Total R$ "+t+" - "+(ok?"aprovado":"revisar"));}}
 public static void main(String[] args){System.out.println(new PedidoService().criar(85,3,300));}
}

