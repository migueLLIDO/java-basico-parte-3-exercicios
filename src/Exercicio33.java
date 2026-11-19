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
public class Exercicio33 {
static <T extends Comparable<T>> T maior(T a,T b){return a.compareTo(b)>=0?a:b;}
 public static void main(String[] args){System.out.println(maior("Java","Go"));System.out.println(maior(9,12));}
}

