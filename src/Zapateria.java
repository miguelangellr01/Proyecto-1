import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.util.Scanner;

public class Zapateria {

    public static void main(String[] args) {
        
        Scanner respuesta = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        Scanner Articulos = new Scanner(System.in);
        String opcion = "";
        String Opt = "";
        Double codigo = 0.0;
        Double total = 0.0;
        
        String categorias[] = {"Niña","Niño","Mujer","Hombre","Ver todos los productos"};
        //ImageIcon icono = new ImageIcon("bin/IMG_0523.jpg");
        //JOptionPane.showMessageDialog(null, "Foto de Hu tao", "Hu Tao", JOptionPane.INFORMATION_MESSAGE, icono);

        //funciones();

        //JOptionPane.showMessageDialog(null, "Soy una ventana emergente");

        do{

           /*  System.out.println("Bienvenido a la zapateria 3 hermanos");
            System.out.println("Que opcion desea realizar?");
            System.out.println("1) Ver catalogo");
            System.out.println("2) Conoce tu talla");
            System.out.println("3) Canjear un codigo");
            System.out.println("4) Dedicado a mi novia hermosa Kathya<3");
            System.out.println("5) Salir");
            
            opcion = respuesta.nextInt();*/
            opcion = JOptionPane.showInputDialog(null,
            "Que opcion desea realizar? \n"
            + "1) Ver catalogo \n"
            + "2) Conoce tu talla \n"
            + "3) Canjear un codigo \n"
            + "4) Dedicado a mi novia hermosa Kathya<3 \n"
            + "5) Salir");
            int contador = 0;

            String Products[] = {"Zapatos Shein color rosa, talla 8", "Sadak Huarache frozen con tacon, talla 9", "Zapatos shein color negro de vestir, talla 9", "Tenis de moda girls attitude color rosa, talla 8"," Tenis Nike Court Borought color rosa, talla 10",/*Termina Productos Nina */ 
            "Nautica Spinnaker Plebbed plano color blanco, talla 9", "Landhiker color blanco, talla 10", "Marvel botines de spiderman talla 9", "Bruno Marc zappatos Oxford de vestir, talla 9", "Tenis casual para niño Rokino Modelo 3186, talla 11", /*Termina Productos Nino */
            "Dream paris color blanco, talla 24", "Atoshopce color negro, talla 23", "Madden girl color durazno, talla 25", "Shoe land color negro, talla 24", "GUESS loven color blanco, talla 23", /*Termina Productos Mujer */
            "Vans Old Skool color negro, talla 26", "York Team Polo Club color negro, talla 26", "Quirelli modelo 8602 color cafe, talla 26.5", "Zapato casual de piel para hombre color negro, talla 27.5", "Zapato Bordon Serraje color cafe, talla 27" /*Termina Productos Hombre */};
            
            int precioProduct[] = {565, 620, 970, 700, 490,
                                    600, 480, 865, 565,700, 
                                    1270, 895, 760, 870, 960,
                                    1600, 800, 950, 650, 500};
            
            String productos[];
            int precio[];
            precio = new int[10];
            productos = new String[10];
    
            switch (opcion) {
                case "1":
                   /* System.out.println("A continuacion se muestras las suiguientes categorias:");
                    System.out.println("1)Niña");
                    System.out.println("2)Niño");
                    System.out.println("3)Mujer");
                    System.out.println("4)Hombre");
                    System.out.println("5)Ver todos los Productos");

                    opcion = respuesta.nextInt();*/

                   opcion = JOptionPane.showInputDialog(null,
                     "1) Niña \n" 
                    + "2) Niño \n"
                    + "3) Mujer \n"
                    + "4) Hombre \n"
                    + "5) Ver todos los productos" ); 
    
                    switch (opcion) {
                        case "1":
                            System.out.println("Aqui estan los productos de Niña");
                            JOptionPane.showInputDialog(null,Products,"Mensaje");
                            
                        break;
                        case "2":
                            System.out.println("Aqui estan los productos de Niño");
                             for (int inicio = 5; inicio < 9; inicio++){
                                System.out.println("No.Articulo: " + (inicio+1) + ".-" + Products[inicio] + " Precio: " + precioProduct[inicio]);
                            }

                        break;
                        case "3":
                            System.out.println("Aqui estan los productos de Mujer");
                             for (int inicio = 9; inicio < 14; inicio++){
                                System.out.println("No.Articulo: " + (inicio+1) + ".-" + Products[inicio] + " Precio: " + precioProduct[inicio]);
                            }
                        break;
                        case "4":
                            System.out.println("Aqui estan los productos de Hombre");
                             for (int inicio = 14; inicio < 20; inicio++){
                                System.out.println("No.Articulo: " + (inicio+1) + ".-" + Products[inicio] + " Precio: " + precioProduct[inicio]);
                            }
                        break;
                        default:
                            System.out.println("Aqui estan todos los productos");
                             for (int inicio = 0; inicio < 20; inicio++){
                                System.out.println("No.Articulo: " + (inicio+1) + ".-" + Products[inicio] + " Precio: " + precioProduct[inicio]);
                            }
                            break;
                    }

                   
                    do {
                        if (contador == 2)  {
                            System.out.println("Has Alcanzado el limite de articulos");
                            Opt = "N";
                        }else{                            
                            System.out.println("Desea comprar algo del catalogo? (Y/N)");
                            Opt = respuesta.next();
                        }

                        if (Opt.equals("Y")){

                            if (contador !=0){
                                System.out.println("Recuerde solo puede comprar un maximo de 10 articulos");
                                System.out.println("Que otro producto desea comprar?");
                            }else{
                                System.out.println("Solo puede comprar un maximo de 10 articulos");
                                System.out.println("Que producto desea comprar?");
                            }
                                int articulos = Articulos.nextInt();    
                                productos[contador] =  Products[articulos-1];
                                precio[contador] = precioProduct[articulos-1];
                                total = total + precio[contador];
                                contador += 1;
                                
                        }   
                        
                    } while (Opt.equals("Y"));
                    
    
                    if (contador!=0){
                        System.out.println("Usted compro:");
                        for (int i = 0; i<contador;i++){

                            System.out.println(productos[i] + " Precio: " + precio[i]);

                        }

                        System.out.print("\n Su total es de: ");
                        if (codigo == 277353 ) {
                            total = total*0.9;
                            System.out.println(total);
                            System.out.println("Tuvo un descuento del 10%");

                        }else{
                            System.out.println(total);
                        }
                    }                      

                break;
                
                case "2":
                    System.out.println("Bienvenido al modulo para conocer tu talla");
                    System.out.println("Antes de comenzar indique si es honbre o mujer (H/M)");
                    String Sexo = respuesta.next();
    
                    System.out.println("Utiliza la regla que se te proporciona en el establecimiento");
                
                    System.out.println("tabla de tallas \n talla 1 \n talla 2\n talla 3\n"); //mostrar tabla de tallas de ninos
                    if (Sexo.equals("H")){
    
                        System.out.println("talla 1 \n talla 2\n talla 3"); //muestra las tallas de hombre aparte de las de ninos
                    } else{
                        System.out.println("talla 1 \n talla 2\n talla 3"); //muestra las tallas de mujer aparte de las de ninos
                    }
    
                break;
               
                case "3":

                    System.out.println("Bienvenido al menu de codigos canjeables");
                    System.out.println("Tiene usted un codigo de canje? (y/n)");
                    String resp = respuesta.next();

                    if (resp.equals("y")) {
                        System.out.println("Ingrese el codigo de canje");
                        codigo = numeros.nextDouble();

                    }else{
                        System.out.println("Tu ere pobre no tiene aifon");
                    }

                break;

                default:
                    System.out.println("Escribe un valor valido");
                break;
            }    
        }while (opcion!="5");
        //do while se refiere a repetir mientras la condicion se cumpla
        
    }

    private static void funciones() {
        // soy una funcion
        //JOptionPane.showMessageDialog(null,"mensaje", "titulo", joptionpane.icono);
        JOptionPane.showMessageDialog(null,"No se acptan peruanos", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
