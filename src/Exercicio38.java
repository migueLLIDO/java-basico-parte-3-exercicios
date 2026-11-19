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
public class Exercicio38 {
static double paraMetros(double metros){return metros;} static double paraMetros(int km){return km*1000.0;} static double milhasParaMetros(double milhas){return milhas*1609.344;}
 public static void main(String[] args){System.out.println(paraMetros(1200));System.out.println(paraMetros(3));System.out.println(milhasParaMetros(1));}
}

