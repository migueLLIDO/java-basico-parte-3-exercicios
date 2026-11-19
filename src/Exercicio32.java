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
public class Exercicio32 {
interface Notificador{void enviar(String mensagem);default void enviarBoasVindas(String nome){enviar("Bem-vindo, "+nome);}} static class Email implements Notificador{public void enviar(String m){System.out.println("E-mail: "+m);}} static class SMS implements Notificador{public void enviar(String m){System.out.println("SMS: "+m);}}
 public static void main(String[] args){new Email().enviarBoasVindas("Ana");new SMS().enviarBoasVindas("Beto");}
}

