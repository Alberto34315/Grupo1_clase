/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_video_clone;

import java.io.Serializable;

/**
 *
 * @author alberto
 */
public interface INodo<T> extends Serializable,Comparable<INodo<T>>{
    T getValue();
    void setValue(T value);
}
