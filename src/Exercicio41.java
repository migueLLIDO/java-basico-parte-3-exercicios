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
public class Exercicio41 {
static BigInteger fatRec(int n){if(n<0)throw new IllegalArgumentException("n>=0");return n<2?BigInteger.ONE:BigInteger.valueOf(n).multiply(fatRec(n-1));}static BigInteger fatIter(int n){BigInteger r=BigInteger.ONE;for(int i=2;i<=n;i++)r=r.multiply(BigInteger.valueOf(i));return r;}
 public static void main(String[] args){for(int n:new int[]{0,1,5,100})System.out.println(n+"! rec="+fatRec(n)+" iter="+fatIter(n));}
}

