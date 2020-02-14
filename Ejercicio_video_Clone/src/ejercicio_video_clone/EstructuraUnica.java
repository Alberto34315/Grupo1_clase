/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_video_clone;


public class EstructuraUnica<T> extends Estructura<T> {
    @Override
    public int put(T v, int pos) {
        if(contains(v)>-1)
            return lenght();
        return super.put(v, pos); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int unshift(T v) {
        if(contains(v)>-1)
            return lenght();
        return super.unshift(v); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int push(T v) {
        if(contains(v)>-1)
            return lenght();
        return super.push(v); //To change body of generated methods, choose Tools | Templates.
    }
}
