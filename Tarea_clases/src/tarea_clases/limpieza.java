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
public class limpieza 
{
    public String tipo;
    public String codigo;
    public int precio;
    public int cantidad;
    public String proveedor;
    public String nombre;
    public limpieza (String a, String b, int c, int d, String e, String f)
    {
        tipo = a;
        codigo = b;
        precio = c;
        cantidad = d;
        proveedor = e;
        nombre = f;
    }
    public void setTipo (String x)
    {
        tipo = x;
    }
    public void setCodigo (String x)
    {
        codigo = x;
    }
    public void setPrecio (int x)
    {
        precio = x;
    }
    public void setCantidad (int x)
    {
        cantidad = x;
    }
    public void setProveedor (String x)
    {
        proveedor = x;
    }
    public void setNombre (String x)
    {
        nombre = x;
    }
    @Override
    public String toString ()
    {
        return "Tipo de producto: "+tipo+" codigo: "+codigo+" Precio:LPS."+precio+" cantidad en inventario: "+cantidad+" proveedor: "+proveedor+" nombre del producto: "+nombre;
    }
}
