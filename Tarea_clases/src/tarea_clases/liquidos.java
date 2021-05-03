/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_clases;

/**
 *
 * @author Rolando
 */
public class liquidos 
{
    public String categoria;
    public String empaque;
    public String tamano;
    public String nombre;
    public int precio;
    public liquidos (String a, String b, String c, String d, int e)
    {
        categoria = a;
        empaque = b;
        tamano = c;
        nombre = d;
        precio = e;
    }
    public void setCategoria (String x)
    {
        categoria = x;
    }
    public void setEmpaque (String x)
    {
        empaque = x;
    }
    public void setTamano (String x)
    {
        tamano = x;
    }
    public void setNombre (String x)
    {
        nombre = x;
    }
    public void setPrecio (int x)
    {
        precio = x;
    }
    @Override
    public String toString ()
    {
        return "Categoria: "+categoria+" Tipo de empaque: "+empaque+" tamaño: "+tamano+" nombre del producto: "+nombre+" Precio:LPS."+precio;
    }
}
