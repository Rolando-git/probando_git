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
public class frutas_verduras 
{
    public int precio;
    public int cantidad;
    public String categoria;
    public frutas_verduras (int a, int b, String c)
    {
        precio = a;
        cantidad = b;
        categoria = c;
    }
    public void setPrecio (int x)
    {
        precio = x;
    }
    public void setCantidad (int x)
    {
        cantidad = x;
    }
    public void setCategoria (String x)
    {
        categoria = x;
    }
    @Override
    public String toString ()
    {
        return "Precio:LPS."+precio+" cantidad en inventario: "+cantidad+" Categoria: "+categoria;
    }
}
