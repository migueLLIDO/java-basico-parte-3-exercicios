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
public class Exercicio50 {
record Aluno(String nome){Aluno{if(nome==null||nome.isBlank())throw new IllegalArgumentException("Nome obrigatório");}}record Curso(String codigo,String nome){}record Matricula(Aluno aluno,Curso curso){}interface MatriculaHook{void registrar(Matricula m);}static class MatriculaService{private final List<Curso> cursos=new ArrayList<>(List.of(new Curso("JAVA","Java Básico")));private final MatriculaHook hook;MatriculaService(MatriculaHook h){hook=h;}Optional<Curso> buscar(String codigo){return cursos.stream().filter(c->c.codigo().equalsIgnoreCase(codigo)).findFirst();}Matricula matricular(Aluno a,String codigo){Curso c=buscar(codigo).orElseThrow();Matricula m=new Matricula(a,c);hook.registrar(m);return m;}static <T> T primeiro(T[] valores){if(valores.length==0)throw new IllegalArgumentException("Array vazio");return valores[0];}}
 public static void main(String[] args){MatriculaService s=new MatriculaService(m->System.out.println("Registrada: "+m));s.matricular(new Aluno("Ana"),"JAVA");System.out.println(MatriculaService.primeiro(new String[]{"x"}));}
}

