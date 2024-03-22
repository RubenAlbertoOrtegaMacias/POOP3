/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;
/**
 * Blibliotemas importadas
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Programa para aprender utilerías, clases de uso general y bibliotecas
 * @author estudiante
 */
public class POOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("######## Arreglos #########");
        /**
        * le damos valor al arreglo
        */
        int nums[];
        int[] nums2;
        int [] nums3;
        int []nums4;
        int[] nums5={1,2,3,4,5,6,7,8,9,10}; 
        System.out.println("########### For ###########");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento ["+i+"]="+i);
        }
        System.out.println("#####");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento ["+i+"]="+nums5[i]);
        }
        System.out.println("#####");
        for (int i = 0; i < nums5.length; i++) {
            System.out.println("Elemento ["+i+"]="+nums5[i]);
        }
        System.out.println("########### For ###########");
        for (int temp : nums5) {
            System.out.println("Elemento: "+temp);
        }
        System.out.println("########### String ###########");
        /**
        * forma correcta, los objetos van con mayuscula se almacena en la memoria principal y nos da una referencia en la variable s
        */
        String s = new String("Hola mundo");
        /**
        * forma recomendada
        */
        String s1= "Hola mundo"; 
        System.out.println(s);
        System.out.println(s1);
        System.out.println("########## Operador mas ###########");
        String nombre="Ruben";
        String apellido="Ortega";
        /**
        * necesitamos agregar un espacio porque si no queda junto la concatenacion
        */
        String nombreCompleto = nombre+" "+apellido;
        System.out.println(nombreCompleto);
        System.out.println("########### Operador punto ###########");
        /**
        * .length variable que se almacena con un contador
        */
        System.out.println("Arreglo nums5 tiene "+nums5.length+" elementos");
        /**
        * .length() es un metodo
        */
        System.out.println(nombre.length());
        System.out.println(nombreCompleto.length());
        System.out.println("########### Wrapper y Autoboxing ###########");
        int a=3;
        /**
        * forma correcta, es inecesario y por eso java lo tacha si no lo ocupamos
        * b.
        */
        Integer b = new Integer(22);
        Integer c= 33;
        int d=c;
        System.out.println(d);
        /**
        * String cadena=a; no se puede porque los datos no son compatibles
        */
        Integer e=a;
        /**
        * pasamos el valor de integer y lo transformamos en un String
        */
        String cadena=e.toString();
        System.out.println("Valor de a = "+cadena);
        /**
        * String f=a+null java no entiende lo que queremos hacer ya que estas concatenando nada
        * asignamos la variable y la concatenamos con una cadena vacia
        */
        String f=a+""; 
        System.out.println("elementos de f "+f.length());
        System.out.println("########## Colecciones ###########");
        System.out.println("########## ArrayList ###########");
        
        ArrayList<Integer> miArrayList= new ArrayList<Integer>();
        miArrayList.add(11);
        miArrayList.add(33);
        miArrayList.add(44);
        System.out.println("Tamaño de ArrayList: "+miArrayList.size());
        miArrayList.add(1, 22);
        System.out.println("Tamaño de ArrayList: "+miArrayList.size());
        System.out.println("***");
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
        miArrayList.add(1, 15);
        System.out.println("***");
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
        System.out.println("########## Hashtable ###########");
        Hashtable <String,Integer> miTabla = new Hashtable<String,Integer>();
        miTabla.put("Uno",1);
        miTabla.put("Antonio",55667788);
        miTabla.put("Jorge", 55993322);
        System.out.println("Elementos en la tabla: "+miTabla.size());
        for (Integer value : miTabla.values()) {
            System.out.println(value);
        }
        for (String string : miTabla.keySet()) {
            System.out.println(string);
        }
        System.out.println("########## Enumeracion ###########");
        String llave;
        Integer valor;
        Enumeration<String> llavesEnumeradas = miTabla.keys();
        while(llavesEnumeradas.hasMoreElements()){
            llave=llavesEnumeradas.nextElement();
            valor=miTabla.get(llave);
            System.out.println("llave: "+llave+" valor: "+valor);
        }
        System.out.println("########## math ###########");
        /**
        * las constantes van en mayusculas
        */
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 2));
        System.out.println( Math.sqrt(9));
        System.out.println(Math.max(44, 121));
        System.out.println("########## Date ###########");
        Date hoy = new Date();
        System.out.println(hoy);
        System.out.println("########## Calendar ###########");
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);
        /**
        * realizar un diccionario con 5 palabras usando hashtable e imprimirlo y una agenda con 5 registros nombre cumpleaños usando
        * cumpleaños de tipo calendar (nos dara el formato el profe) y nombre string
        */
         
    }
    
}
