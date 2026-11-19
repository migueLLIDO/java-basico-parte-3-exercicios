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
public class Exercicio39 {
static class Pedido{private final String codigo=gerarCodigo();private int itens;void adicionarItem(){itens++;}static String gerarCodigo(){return "PED-"+UUID.randomUUID().toString().substring(0,8);}String resumo(){return codigo+" itens="+itens;}}
 public static void main(String[] args){Pedido p=new Pedido();p.adicionarItem();p.adicionarItem();System.out.println(p.resumo());}
}

