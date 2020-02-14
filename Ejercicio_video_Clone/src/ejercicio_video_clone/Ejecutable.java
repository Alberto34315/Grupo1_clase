package ejercicio_video_clone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlbertoRS
 */
public class Ejecutable {

    public static void main(String[] args) {
        Estructura<Person> lista = new EstructuraUnica<>();
        lista.push(new Person(1, "Carlos", 40));
        lista.push(new Person(2, "Marta", 9));
        lista.push(new Person(3, "Gloria", 6));
        lista.push(new Person(4, "Paco", 20));
        lista.push(new Person(5, "Mario", 30));
        lista.push(new Person(6, "María", 35));
        lista.push(new Person(7, "Sandra", 36));

        //System.out.println(lista.pop());
       // System.out.println(lista);
    
        //lista.clear();
       // System.out.println(lista);
        
        Object[] a=lista.toArray();
        for (Object person : a) {
            System.out.println(person);
        }
        /*
        FileOutputStream f = null;
        try {
            f = new FileOutputStream(new File("myObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(lista);
            o.close();
            f.close();
            System.out.println("---------   SAVED --------");
            
            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            // Read objects
            Estructura nueva = (Estructura) oi.readObject();
            oi.close();
            fi.close();
            System.out.println(nueva);
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {    
            Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         */
 /* lista.unshift(99); //99->1->2->3
        lista.push(2);//99->1->2->3->2
        System.out.println(lista);*/
        // lista.sort();
        /* for (Person elemento : lista) {
            System.out.println(elemento);
        }*/
 /* 
        lista.reverse();
        System.out.println(lista);//2,3,2,1,99
         */
 /*      
        lista.removeAllElements(2);
        System.out.println(lista);
         */
 /*
        System.out.println(lista.pop());// 3
        System.out.println(lista.shift());//99 
        System.out.println(lista);//1->2
         */

 /*
        System.out.println(lista.contains(3)); //3
        System.out.println(lista.contains(77));//-1
        System.out.println(lista.get(0));//99
        System.out.println(lista.get(77));//null
        
        lista.put(77,0);//77,99,1,2,3
        lista.put(100,4);
        System.out.println(lista);
         */
    }
}
