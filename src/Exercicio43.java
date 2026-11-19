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
public class Exercicio43 {
static int rec(int[] a,int x,int i,int f){if(i>f)return -1;int m=i+(f-i)/2;if(a[m]==x)return m;return a[m]>x?rec(a,x,i,m-1):rec(a,x,m+1,f);}static int iter(int[] a,int x){int i=0,f=a.length-1;while(i<=f){int m=i+(f-i)/2;if(a[m]==x)return m;if(a[m]<x)i=m+1;else f=m-1;}return -1;}
 public static void main(String[] args){int[] a={2,5,9,13,18,27};System.out.println(rec(a,13,0,a.length-1));System.out.println(iter(a,7));}
}

