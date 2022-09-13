package main.java.org.agustin.poo.interfaces;

import java.util.List;

public class Libro {

   private List<Hoja> paginas;
   private String autor;
   private String titulo;
   private Genero genero;

   public Libro(String autor, String titulo, Genero genero) {
      this.autor = autor;
      this.titulo = titulo;
      this.genero = genero;


   }

   public Libro addPaginas(Hoja pagina) {
      paginas.add(pagina);
      return this;
   }

   public String imprimir(){
      StringBuilder sb = new StringBuilder("Titulo:" );
      sb.append(this.titulo).append("\n").append(this.autor).append("\n").append(this.genero)
              .append("\n");
      for (Hoja pagina : this.paginas){
         sb.append(pagina.imprimir());
      }

      return sb.toString();
   }


}
