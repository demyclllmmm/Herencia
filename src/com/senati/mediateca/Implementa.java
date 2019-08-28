package com.senati.mediateca;
import java.util.Set;
import java.util.HashSet;
public class Implementa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//añadir nuevos socios
		//clase objeto=new clase
		Socio socio1=new Socio();
		socio1.id=101;
		socio1.nombre="Jorge Antonio";
		socio1.apellido="Luque Chambi";
		socio1.distrito="Los olivos";
		
		Socio socio2=new Socio();
		socio2.id=102;
		socio2.nombre="Antonio Luis";
		socio2.apellido="Torres Chavez";
		socio2.distrito="Los pinos";
		
		Socio socio3=new Socio(103,"Alicia","Gomez Avalos","Comas");
		System.out.println(socio1.toString());
		System.out.println(socio2.toString());
		System.out.println(socio3.toString());
		
		Libros libro1= new Libros (11,"Matalache","Alvaro Vargas Llosa", 50f , 300 ,123);
		System.out.println(libro1.toString());
		
		
		System.out.println("Lista de socios");
		Socio soc1 = new Socio(104,"Jorge"," Luque","Comas");
		Socio soc2 = new Socio(105,"Maria"," Luna","Comas");
		Socio soc3 = new Socio(106,"Gerardo"," Luque","Comas");
		Socio soc4 = new Socio(107,"Alex"," Lopez","Comas");
		Socio soc5 = new Socio(108,"Alex"," Lopez","Comas");
		Set <Socio> sociosinscritos = new HashSet<Socio>();
		
		sociosinscritos.add(soc1);
		sociosinscritos.add(soc2);
		sociosinscritos.add(soc3);
		sociosinscritos.add(soc4);
		
		for (Socio socio : sociosinscritos) {
			System.out.println(socio.id +" "+socio.nombre + " " + socio.apellido + " " + socio.distrito);
		}
		
		System.out.println("Lista de Libros");
		Libros libro6 = new Libros(12,"Heraldos Negros","Olivares",80f,420,114);
		Libros libro2 = new Libros(13,"Heraldos Negros","Olivares",80f,420,114);
		Libros libro3 = new Libros(14,"Heraldos Negros","Olivares",80f,420,114);
		Libros libro4 = new Libros(15,"Heraldos Negros","Olivares",80f,420,114);
		Libros libro5 = new Libros(16,"Heraldos Negros","Olivares",80f,420,114);
		Set <Libros> librososinscritos = new HashSet<Libros>();
		
		librososinscritos.add(libro6);
		librososinscritos.add(libro2);
		librososinscritos.add(libro3);
		librososinscritos.add(libro4);
		librososinscritos.add(libro5);
		
		byte contador=0;
		float preciototal=0f;
		for (Libros libro :librososinscritos) {
			System.out.println(libro.id +" "+libro.titulo+" "+libro.autor + " " + libro.precio + " " + libro.nropag+""+libro.nroisbn+"");
			contador++;
			preciototal=preciototal+libro.precio;
		}
		System.out.println("Libros prestados:  "+contador);
		System.out.println("Monto acumulado:  "+preciototal);
		
		
		
		
		System.out.println("Lista de Cinta videos");
		Cintavideos cintavideo1 = new Cintavideos(12,"Asumare","Cachin",100f,"Carlos",114);
		Cintavideos cintavideo2 = new Cintavideos(13,"Asumare","Cachin",100f,"Carlos",114);
		Cintavideos cintavideo3 = new Cintavideos(14,"Asumare","Cachin",100f,"Carlos",114);
		Cintavideos cintavideo4 = new Cintavideos(15,"Asumare","Cachin",100f,"Carlos",114);
		Cintavideos cintavideo5 = new Cintavideos(16,"Asumare","Cachin",100f,"Carlos",114);
		Set <Cintavideos> listavideos = new HashSet<Cintavideos>();
		
		listavideos.add(cintavideo1);
		listavideos.add(cintavideo2);
		listavideos.add(cintavideo3);
		listavideos.add(cintavideo4);
		listavideos.add(cintavideo5);
		
		for (Cintavideos cintavideos :listavideos) {
			System.out.println(cintavideos.id +" "+cintavideos.titulo+" "+cintavideos.autor + " " + cintavideos.precio + " " + cintavideos.actores+" "+cintavideos.duracion+" ");
		}
	}

}
