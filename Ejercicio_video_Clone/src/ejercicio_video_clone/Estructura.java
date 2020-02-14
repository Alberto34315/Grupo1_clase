/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_video_clone;

import java.util.Iterator;

/**
 *
 * @author alberto
 */
public class Estructura<T> implements IEstructura<T>, Iterable<T> {

    private Nodo<T> raiz;
    private Nodo<T> last;
    private int size;
    
    //Iterator
    int posicion;

    public Estructura() {
        raiz = null;
        last = null;
        size = 0;
        posicion = 0;
    }

    public int lenght() {
        return size;
    }

    @Override
    public int push(T v) {
        if (v != null) {
            Nodo<T> nuevo = new Nodo<>(v);
            if (raiz == null) {
                raiz = nuevo;
            } else {
                last = getElement(size - 1);
                /*    Nodo<T> aux = raiz;
                while (aux.sig != null) {
                    aux = aux.sig;
                }
                //aux es el último nodo*/
                last.sig = nuevo;
                nuevo.ant = last;
            }
            size++;
        }
        return size;
    }

    @Override
    public int unshift(T v) {
        if (v != null) {
            Nodo<T> nuevo = new Nodo<>(v);
            if (raiz != null) {
                nuevo.sig = raiz;
                raiz.ant = nuevo;
            }
            raiz = nuevo;
            size++;
        }
        return size;
    }

    @Override
    public T pop() {
        T result = null;
        if (raiz != null) {
            last = getElement(size - 1);
            /* Nodo<T> aux = raiz;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            //aux es el ultimo elemento*/
            result = last.getValue();
            if (last.ant != null) {
                last.ant.sig = null;
            } else {
                raiz = null;
            }
            last = null;
            size--;
        }
        return result;
    }

    @Override
    public T shift() {
        T result = null;
        if (raiz != null) {
            result = raiz.getValue();
            raiz = raiz.sig;
            if (raiz != null) {
                raiz.ant = null;
            }
            size--;
        }
        return result;
    }

    @Override
    public int contains(T v) {
        int pos = -1;
        boolean found = false;
        Nodo<T> buscado = new Nodo<>(v);
        Nodo<T> aux = raiz;
        while (aux != null && !found) {
            pos++;
            if (aux.equals(buscado)) {
                found = true;
            }
            aux = aux.sig;
        }
        if (!found) {
            pos = -1;
        }
        return pos;
    }

    @Override
    public T get(int pos) {
        T result = null;
        if (pos >= 0 && pos < size) {
            Nodo<T> aux1 = raiz;
            Nodo<T> aux2 = last = getElement(size - 1);
            int index = 0;
            if (pos >= contains(aux1.getValue()) && pos<=size/2) {
                while (aux1 != null && index != pos) {
                    index++;
                    aux1 = aux1.sig;
                }
                if (index == pos && aux1 != null) {
                    result = aux1.getValue();
                }
            }else if(pos <= contains(aux2.getValue())&& pos>size/2){
                index=size-1;
            while (aux2 != null && index != pos) {
                    index--;
                    aux2 = aux2.ant;
                }
                if (index == pos && aux2 != null) {
                    result = aux2.getValue();
                }
            }
            
        }
        return result;
    }

    @Override
    public Nodo<T> getElement(int pos) {
        Nodo<T> result = null;
        if (pos >= 0 && pos < size) {
            Nodo<T> aux = raiz;
            int index = 0;
            while (aux != null && index != pos) {
                index++;
                aux = aux.sig;
            }
            if (index == pos && aux != null) {
                result = aux;
            }
        }
        return result;
    }

    @Override
    public int put(T value, int pos) {
        if (value != null) {
            Nodo<T> nuevo = new Nodo<>(value);
            if (raiz == null) {
                size = push(value);
            } else if (pos >= 0 && pos < size) {
                Nodo<T> enPosicion = getElement(pos);
                if (enPosicion.ant != null) {
                    nuevo.ant = enPosicion.ant;
                    enPosicion.ant.sig = nuevo;
                }
                nuevo.sig = enPosicion;
                enPosicion.ant = nuevo;
                if (nuevo.ant == null) {
                    raiz = nuevo;
                }
                size++;
            }
        }
        return size;
    }

    @Override
    public int remove(int pos) {
        if (pos >= 0 && pos < size) {
            Nodo<T> current = getElement(pos);
            if (current != null) {
                if (current.ant != null) {
                    current.ant.sig = current.sig;
                }
                if (current.sig != null) {
                    current.sig.ant = current.ant;
                }
                current = null;
                size--;
            }
        }
        return size;
    }

    @Override
    public int removeElement(T v) {
        if (v != null) {
            int pos = contains(v);
            if (pos != -1) {
                remove(pos);
            }
        }
        return size;
    }

    @Override
    public int removeAllElements(T v) {
        int originalSize = 0;
        while (originalSize != removeElement(v)) {
            originalSize = size;
        }
        return size;
    }

    @Override
    public void reverse() {
        if (raiz != null && size > 1) {
            Nodo<T> aux;
            last = aux = getElement(size - 1);
            do {
                Nodo<T> tmp = aux.ant;
                aux.ant = aux.sig;
                aux.sig = tmp;
                aux = tmp;
            } while (aux != null);
            raiz = last;
        }
    }

    @Override
    public void sort() {
       /* int intercambios = 0, comparaciones = 0;
		
		int aux = 0;*/
        if (raiz != null && size > 1) {
            for (int i = 0; i < size; i++) {
                for (int j = 1; j < (size - i); j++) {
                    Nodo<T> a = getElement(j - 1);
                    Nodo<T> b = getElement(j);
                   if (a != null && a.compareTo(b) > 0) {

                        //Bridge the prev and next elements
                        if (a.ant != null) {
                            a.ant.sig = a.sig;
                        }
                        if (b.sig != null) {
                            b.sig.ant = b.ant;
                        }

                        //swap elements
                        a.sig = b.sig;
                        b.sig = a;
                        b.ant = a.ant;
                        a.ant = b;

                        //check if a or b is a new root
                        if (a.ant == null) {
                            raiz = a;
                        }
                        if (b.ant == null) {
                            raiz = b;
                        }

                    }
                     /*    comparaciones++;
               if (a[j-1]>arreglo[j]){
                    intercambios++;
                    aux = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j] = aux;
                    */
                }
            }
        }

    }

    @Override
    public Iterator<T> iterator() {
        posicion = 0;
        Nodo<T> current = this.raiz;
        Iterator<T> i = new Iterator<T>() {
            @Override
            public boolean hasNext() {
                if (posicion < size && current != null) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public T next() {
                return get(posicion++);
            }
        };
        return i;
    }
    
   public void clear(){ 
            raiz=null;
            size=0;
   }
    
    public Object[] toArray(){
    Object[] lista =new Object[size];
        int i=0;
        for (T nodo : this) {
            lista[i++]=(Object)nodo;
        }
    return lista;
    }
    
    @Override
    public String toString() {
        String result = "";
        Nodo<T> aux = raiz;
        while (aux != null) {
            result += " > " + aux;
            aux = aux.sig;
        }
        return result;
    }

}
