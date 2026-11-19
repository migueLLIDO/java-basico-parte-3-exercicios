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
public class Exercicio48 {
static class SaldoInsuficienteException extends Exception{SaldoInsuficienteException(double saldo,double valor){super("Saldo "+saldo+" insuficiente para saque de "+valor);}}static double sacar(double saldo,double valor)throws SaldoInsuficienteException{if(valor<=0)throw new IllegalArgumentException("Valor deve ser positivo");if(valor>saldo)throw new SaldoInsuficienteException(saldo,valor);return saldo-valor;}
 public static void main(String[] args){try{System.out.println(sacar(100,130));}catch(SaldoInsuficienteException e){System.out.println(e.getMessage());}}
}

