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
public class Exercicio46 {
static <T> void trocar(T[] a,int i,int j){Objects.requireNonNull(a);if(i<0||j<0||i>=a.length||j>=a.length)throw new IndexOutOfBoundsException();T x=a[i];a[i]=a[j];a[j]=x;}
 public static void main(String[] args){String[] a={"A","B","C"};trocar(a,0,2);System.out.println(Arrays.toString(a));}
}

