
package colecciones;
//
//Una coleccion en Java es una estructura de datos que permite almacenar muchos valores del mismo tipo, es similar a un array pero con mas
//carateristicas y beneficios, por ej. podemos almacenar objetos, variables, etc., las colecciones mas usadas son los ArrayList, pero tambien
//tenemos Vectores, stack, etc.

import java.util.*;

public class Colecciones {
//
//    Un ArrayList, permite almacenar datos de forma similar a un array, 
//    pero en este  caso no es necesario describir la cantidad de elementos que tendrá este arraylist, 
//    ya que automáticamente crece dinámicamente a medida que se agregan elementos,  el acceso a los elementos es muy rápido.
    public static void main(String[] args) 
    {
//    Fijemonos que al momento de definir el tipo de dato que almacenara lo hacemos de forma diferente, esto es porque int especifica a una
//     variable de tipo primitiva, para poder almacenarlo en el ArrayList lo debemos convertir en un objeto, para ello se lo hace con la forma 
//      wrapper
//        http://www.abelp.net/apuntesjava/17wrapper.html
      Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList();  
        
        //Cargando Arreglo
         int c = 0 ;
       while(c!=10) // como no tenemos un tamaño definido llenamos el ArrayList hasta que el user ingrese un 10
        {
            System.out.println("Ingrese un numero");
            c=sc.nextInt();
            a.add(c);
           
        }
        Collections.sort(a); //Con esta sentencia podemos ordenar el ArrayList, sin necesidad de usar metodos de odenacion como haciamos con Arrays
        for(int numero: a) //Usamos un foreach, lo que hace es sacar los elementos de a e ir introduciendolos en la variable numero 
        {
            System.out.println(numero);
            
        }
        
//        Ahora almacenamos un objeto de tipo Alumno
        ArrayList<Alumno> b=new ArrayList<Alumno>(); 
      
        System.out.println("Ingrese la cant. de Alumnos a ingresar en el ArrayList");
        int z=sc.nextInt();
        
           for(int i=0;i<z;i++)
          {
          Alumno x=new Alumno();  //  Creamos un objto en cada iteracion    
            
            System.out.println("Ingrese el Nombre del Alumno");
            x.setNombre(sc.next());
            
            System.out.println("Ingrese la edad del Alumno");
            x.setEdad(sc.nextInt());
             
            b.add(x);  //Almacenamos ese objt en alguna posicion del ArrayList
          
             
            x=null; //Antes de finalizar limipiamos la variable de Instancia para que pueda alvergar otro Alumno
          }
          
        for(int i=0;i<b.size();i++)
        {
            System.out.println(b.get(i)+"\n");
            
        }
//      Tambien se puede usar un foreach para mostrar un ArrayList de objts. sin embargo debemos pasar todo del array a una v. de instancia de ese objeto, obviamente no se puede usar una v.primitiva  
        for(Alumno aux: b)
        {
            System.out.println(aux+"\n");
        }
        
    }
    
}
