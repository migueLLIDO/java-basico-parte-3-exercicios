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
public class Exercicio40 {
static class Animal{String som(){return "som genérico";}}static class Cao extends Animal{@Override String som(){return "au au";}}static class Gato extends Animal{@Override String som(){return "miau";}}
 public static void main(String[] args){Animal[] animais={new Cao(),new Gato()};for(Animal a:animais)System.out.println(a.som());}
}

