/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_clases;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Rolando
 */
public class Tarea_clases {
    static Scanner entrada = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        boolean finPrograma = false;
        while (finPrograma==false)
        {
            int opcion;
            System.out.println("Ingrese opcion:");
            System.out.println("1.Agregar producto:");
            System.out.println("2.Editar producto:");
            System.out.println("3.Eliminar producto:");
            System.out.println("4.Reporte");
            System.out.println("5.Salir");
            opcion = entrada.nextInt();
            switch (opcion)
            {
                case 1:
                {
                    char op;
                    System.out.println("Que tipo de producto desea agregar?");
                    System.out.println("A.Grano");
                    System.out.println("B.Limpieza");
                    System.out.println("C.Liquido");
                    System.out.println("D.Carne/embutido");
                    System.out.println("E.Frutas y verduras");
                    op = entrada.next().charAt(0);
                    switch (op)
                    {
                        case 'A':
                        {
                            String nombre;
                            System.out.println("Ingrese el nombre del producto:");
                            nombre = entrada.next();
                            int cantidad;
                            System.out.println("Ingrese la cantida del producto:");
                            cantidad = entrada.nextInt();
                            String medida;
                            System.out.println("Ingrese la unidad de medida:");
                            medida = entrada.next();
                            String procedencia;
                            System.out.println("Ingrese la procedencia del producto:");
                            procedencia = entrada.next();
                            lista.add(new granos(nombre,cantidad,medida,procedencia));
                        }
                        break;
                        case 'B':
                        {
                            String tipo;
                            System.out.println("Ingrese el tipo del producto: liquido/polvo");
                            tipo = entrada.next();
                            String codigo;
                            System.out.println("Ingrese codigo del producto:");
                            codigo = entrada.next();
                            int precio;
                            System.out.println("Ingrese el precio del producto:");
                            precio = entrada.nextInt();
                            int cantidad;
                            System.out.println("Ingrese la cantidad del producto:");
                            cantidad = entrada.nextInt();
                            String proveedor;
                            System.out.println("Ingrese nombre del proveedor:");
                            proveedor = entrada.next();
                            String nombre;
                            System.out.println("Ingrese nombre del producto:");
                            nombre = entrada.next();
                            lista.add(new limpieza(tipo,codigo,precio,cantidad,proveedor,nombre));
                        }
                        break;
                        case 'C':
                        {
                            String categoria;
                            System.out.println("Ingrese categoria: lacteos/gaseosa/jugos/agua");
                            categoria = entrada.next();
                            String empaque;
                            System.out.println("Ingrese tipo de empaque: botella/lata/carton");
                            empaque = entrada.next();
                            String tamano;
                            System.out.println("Ingrese tamaño del empaque: pequeño/mediano/grande");
                            tamano = entrada.next();
                            String nombre;
                            System.out.println("Ingrese el nombre del producto:");
                            nombre = entrada.next();
                            int precio;
                            System.out.println("Ingrese el precio del producto:");
                            precio = entrada.nextInt();
                            lista.add(new liquidos(categoria,empaque,tamano,nombre,precio));
                        }
                        break;
                        case 'D':
                        {
                            String procedencia;
                            System.out.println("Ingrese la procedencia del producto:");
                            procedencia = entrada.next();
                            int cantidad;
                            System.out.println("Ingrese cantidad del producto:");
                            cantidad = entrada.nextInt();
                            String tipo;
                            System.out.println("Ingrese el tipo de carne: res/carne blanca/cerdo");
                            tipo = entrada.next();
                            int precio;
                            System.out.println("Ingrese el precio:LPS.");
                            precio = entrada.nextInt();
                            lista.add(new carnes(procedencia,cantidad,tipo,precio));
                        }
                        break;
                        case 'E':
                        {
                            int precio;
                            System.out.println("Ingrese el precio del producto:LPS.");
                            precio = entrada.nextInt();
                            int cantidad;
                            System.out.println("Ingrese la cantidad deel producto:");
                            cantidad = entrada.nextInt();
                            String categoria;
                            String tipo;
                            System.out.println("Fruta o verdura?");
                            tipo = entrada.next();
                            if (tipo.equalsIgnoreCase("Fruta"))
                            {
                                System.out.println("Ingrese categoria: citrico/tropical/grano/fibra");
                                categoria = entrada.next();
                            }
                            else
                            {
                                if (tipo.equalsIgnoreCase("Verdura"))
                                {
                                    System.out.println("Ingrese categoria: tuberculo/legumbre/hoja");
                                    categoria = entrada.next();
                                }
                                else
                                {
                                    categoria = "no disponible";
                                }
                            }
                            lista.add(new frutas_verduras(precio,cantidad,categoria));
                        }
                        break;
                        default: System.out.println("Error");
                    }
                }
                break;
                case 2:
                {
                    char s;
                    System.out.println("Seleccione producto a editar:");
                    System.out.println("A.Grano");
                    System.out.println("B.Limpieza");
                    System.out.println("C.Liquido");
                    System.out.println("D.Carne/embutido");
                    System.out.println("E.Frutas y verduras");
                    s = entrada.next().charAt(0);
                    switch (s)
                    {
                        case 'A':
                        {
                            int pos;
                            System.out.println("Ingrese la posicion a editar:");
                            pos = entrada.nextInt();
                            if (lista.get(pos) instanceof granos)
                            {
                                String nombre;
                                System.out.println("Ingrese el nuevo nombre del producto:");
                                nombre = entrada.next();
                                int cantidad;
                                System.out.println("Ingrese la nueva cantida del producto:");
                                cantidad = entrada.nextInt();
                                String medida;
                                System.out.println("Ingrese la mueva unidad de medida:");
                                medida = entrada.next();
                                String procedencia;
                                System.out.println("Ingrese la nueva procedencia del producto:");
                                procedencia = entrada.next();
                                lista.remove(pos);
                                lista.add(pos,new granos(nombre,cantidad,medida,procedencia));
                            }
                            else
                            {
                                System.out.println("El producto en la posicion "+pos+" no es de granos");
                            }
                        }
                        break;
                        case 'B':
                        {
                            int pos;
                            System.out.println("Ingrese la nueva posicion a editar:");
                            pos = entrada.nextInt();
                            if (lista.get(pos) instanceof limpieza)
                            {
                                String tipo;
                                System.out.println("Ingrese el nuevo tipo del producto: liquido/polvo");
                                tipo = entrada.next();
                                String codigo;
                                System.out.println("Ingrese nuevo codigo del producto:");
                                codigo = entrada.next();
                                int precio;
                                System.out.println("Ingrese el nuevo precio del producto:");
                                precio = entrada.nextInt();
                                int cantidad;
                                System.out.println("Ingrese la nueva cantidad del producto:");
                                cantidad = entrada.nextInt();
                                String proveedor;
                                System.out.println("Ingrese nuevo nombre del proveedor:");
                                proveedor = entrada.next();
                                String nombre;
                                System.out.println("Ingrese nuevo nombre del producto:");
                                nombre = entrada.next();
                                lista.remove(pos);
                                lista.add(pos,new limpieza(tipo,codigo,precio,cantidad,proveedor,nombre));
                            }
                            else
                            {
                                System.out.println("El producto de la posicion "+pos+" no es de limpieza");
                            }
                        }
                        break;
                        case 'C':
                        {
                            int pos;
                            System.out.println("Ingrese la nueva posicion a editar:");
                            pos = entrada.nextInt();
                            if (lista.get(pos) instanceof liquidos)
                            {
                                String categoria;
                                System.out.println("Ingrese nueva categoria: lacteos/gaseosa/jugos/agua");
                                categoria = entrada.next();
                                String empaque;
                                System.out.println("Ingrese nuevo tipo de empaque: botella/lata/carton");
                                empaque = entrada.next();
                                String tamano;
                                System.out.println("Ingrese nuevo tamaño del empaque: pequeño/mediano/grande");
                                tamano = entrada.next();
                                String nombre;
                                System.out.println("Ingrese el nuevo nombre del producto:");
                                nombre = entrada.next();
                                int precio;
                                System.out.println("Ingrese el nuevo precio del producto:");
                                precio = entrada.nextInt();
                                lista.remove(pos);
                                lista.add(pos,new liquidos(categoria,empaque,tamano,nombre,precio));
                            }
                            else
                            {
                                System.out.println("El producto de la posicion "+pos+" no es de liquidos");
                            }
                        }
                        break;
                        case 'D':
                        {
                            int pos;
                            System.out.println("Ingrese la nueva posicion a editar:");
                            pos = entrada.nextInt();
                            if (lista.get(pos) instanceof carnes)
                            {
                                String procedencia;
                                System.out.println("Ingrese la nueva procedencia del producto:");
                                procedencia = entrada.next();
                                int cantidad;
                                System.out.println("Ingrese nueva cantidad del producto:");
                                cantidad = entrada.nextInt();
                                String tipo;
                                System.out.println("Ingrese el nuevo tipo de carne: res/carne blanca/cerdo");
                                tipo = entrada.next();
                                int precio;
                                System.out.println("Ingrese el nuevo precio:LPS.");
                                precio = entrada.nextInt();
                                lista.remove(pos);
                                lista.add(pos,new carnes(procedencia,cantidad,tipo,precio));
                            }
                            else
                            {
                                System.out.println("El producto de la posicion "+pos+" no es de carnes");
                            }
                        }
                        break;
                        case 'E':
                        {
                            int pos;
                            System.out.println("Ingrese la nueva posicion a editar:");
                            pos = entrada.nextInt();
                            if (lista.get(pos) instanceof frutas_verduras)
                            {
                                int precio;
                                System.out.println("Ingrese el precio del producto:LPS.");
                                precio = entrada.nextInt();
                                int cantidad;
                                System.out.println("Ingrese la cantidad deel producto:");
                                cantidad = entrada.nextInt();
                                String categoria;
                                String tipo;
                                System.out.println("Fruta o verdura?");
                                tipo = entrada.next();
                                if (tipo.equalsIgnoreCase("Fruta"))
                                {
                                    System.out.println("Ingrese categoria: citrico/tropical/grano/fibra");
                                    categoria = entrada.next();
                                }
                                else
                                {
                                    if (tipo.equalsIgnoreCase("Verdura"))
                                    {
                                        System.out.println("Ingrese categoria: tuberculo/legumbre/hoja");
                                        categoria = entrada.next();
                                    }
                                    else
                                    {
                                        categoria = "no disponible";
                                    }
                                }
                                lista.remove(pos);
                                lista.add(pos,new frutas_verduras(precio,cantidad,categoria));
                            }
                            else
                            {
                                System.out.println("El producto de la posicion "+pos+" no es de frutas y verduras");
                            }
                        }
                        break;
                        default: System.out.println("Opcion no valida");
                    }
                }
                break;
                case 3:
                {
                    int pos;
                    System.out.println("Ingrese la posicion a eliminar:");
                    pos = entrada.nextInt();
                    lista.remove(pos);
                }
                break;
                case 4:
                {
                    System.out.println("Granos:");
                    for (int i = 0; i < lista.size(); i++) 
                    {
                        if (lista.get(i) instanceof granos)
                        {
                            System.out.println(lista.get(i));
                        }
                    }
                    System.out.println("Limpieza");
                    for (int i = 0; i < lista.size(); i++) 
                    {
                        if (lista.get(i) instanceof limpieza)
                        {
                            System.out.println(lista.get(i));
                        }
                    }
                    System.out.println("Liquidos:");
                    for (int i = 0; i < lista.size(); i++) 
                    {
                        if (lista.get(i) instanceof liquidos)
                        {
                            System.out.println(lista.get(i));
                        }
                    }
                    System.out.println("Carnes:");
                    for (int i = 0; i < lista.size(); i++) 
                    {
                        if (lista.get(i) instanceof carnes)
                        {
                            System.out.println(lista.get(i));
                        }
                    }
                    System.out.println("Frutas y verduras");
                    for (int i = 0; i < lista.size(); i++) 
                    {
                        if (lista.get(i) instanceof frutas_verduras)
                        {
                            System.out.println(lista.get(i));
                        }
                    }
                }
                break;
                case 5:
                {
                    System.out.println("Fin del programa");
                    finPrograma = true;
                }
                break;
                default: System.out.println("Error, opcion no valida");
            }
        }
    }
    
}