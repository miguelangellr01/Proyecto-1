import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
//import java.lang.Double;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Zapateria {

    Zapateria(String opcioString, int codigo){

        String Products[] = {"Zapatos Shein color rosa, talla 8", "Sadak Huarache frozen con tacon, talla 9", "Zapatos shein color negro de vestir, talla 9", "Tenis de moda girls attitude color rosa, talla 8"," Tenis Nike Court Borought color rosa, talla 10",/*Termina Productos Nina */ 
            "Nautica Spinnaker Plebbed plano color blanco, talla 9", "Landhiker color blanco, talla 10", "Marvel botines de spiderman talla 9", "Bruno Marc zappatos Oxford de vestir, talla 9", "Tenis casual para niño Rokino Modelo 3186, talla 11", /*Termina Productos Nino */
            "Dream paris color blanco, talla 24", "Atoshopce color negro, talla 23", "Madden girl color durazno, talla 25", "Shoe land color negro, talla 24", "GUESS loven color blanco, talla 23", /*Termina Productos Mujer */
            "Vans Old Skool color negro, talla 26", "York Team Polo Club color negro, talla 26", "Quirelli modelo 8602 color cafe, talla 26.5", "Zapato casual de piel para hombre color negro, talla 27.5", "Zapato Bordon Serraje color cafe, talla 27" /*Termina Productos Hombre */};
            // Array de todos los nombres de los productos

            int precioProduct[] = {565, 620, 970, 700, 490,
                                    600, 480, 865, 565,700, 
                                    1270, 895, 760, 870, 960,
                                    1600, 800, 950, 650, 500};
                // Array con los precios de todos los productos

        JFrame f = new JFrame("Articulos para comprar");
        //JFrame es nuestra ventana que se emerge, dentro del parentess va el titulo entre comillas

        f.setLayout(null);

        int contador = 0;
        int altura = 0;
        //altura igual a cero para que no se acumula o provoque errores dentro del for
        JCheckBox caja[];
        caja = new JCheckBox[20];
        int precio[];
        precio = new int[10];
        String CompraProductos[];
        CompraProductos = new String[10];

            switch (opcioString) {
                // el Switch me da control sobre las opcione que elige el usuario en el menu desplegable sobre que productos ver
        
                    case "Niña":
                    // cada caso va en String que corresponde a los datos del menu desplegable, son opciones unicas
                        for(int i = 0; i<5;i++){
                            /*Dentro del for vamos de 5 en 5 empezando desde cero porque son 5 articulos por categoria 
                             *y los numeros de i se los asignaremos a los checkbox para que guarden el nombre y precio de cada uno 
                             */
                            caja[i] = new JCheckBox(Products[i] + " Precio: " + precioProduct[i]);
                            /*JCheckbox es la declaracion de un checkbox, donde le asignamos un nombre de variable, despes del 
                             * igual utilzamos lo que es new JchechkBox para indicar que es un nuevo objeto o vista
                             * y dentro del parentesis le damos el valor que queremos darle
                             */
                            altura += 30;
                            caja[i].setBounds(20,altura,500,30);
                            /*setBounds se encarga de acomodar la vista u objerto en algun lado del Jframe o ventana
                             * donde existen 4 valores, (x, y, ancho, largo) y acomodarlos como en un plano cartesiano
                             * dandole valores a x, y para acomodarlos y darles un ancho y largo y que no choquen entre si 
                             * o no se muestren completos los escritos
                             */
                            caja[i].setVisible(true);
                            /*setVisible se encarga de hacerlos visibles, ya que aveces falla y solo se ve el primero o uno a la vez */
                            f.add(caja[i]);
                            /*Con este ultimo agregamos nuestra caja, objeto o vista a la ventana con todos los valores que le dimos
                             * por eso va al ultimo
                             */
                            contador +=1;
                        }
                    break;
                    case "Niño":
                        for (int i = 5; i < 10; i++) {
                            caja[i] = new JCheckBox(Products[i] + " Precio: " + precioProduct[i]);
                            altura += 30;
                            caja[i].setBounds(20,altura,500,30);
                            caja[i].setVisible(true);
                            f.add(caja[i]);
                            contador +=1;
                        }
                    break;
                    case "Mujer":
                        for(int i = 10; i<15;i++){
                            caja[i] = new JCheckBox(Products[i] + " Precio: " + precioProduct[i]);
                            altura += 30;
                            caja[i].setBounds(20,altura,500,30);
                            caja[i].setVisible(true);
                            f.add(caja[i]);
                            contador +=1;
                        }
                    break;
                    case "Hombre":
                        for(int i = 15; i<20;i++){
                            caja[i] = new JCheckBox(Products[i] + " Precio: " + precioProduct[i]);
                            altura += 30;
                            caja[i].setBounds(20,altura,500,30);
                            caja[i].setVisible(true);
                            f.add(caja[i]);
                            contador +=1;
                        }
                    break;
                    default:
                        for(int i = 0; i<20;i++){
                            caja[i] = new JCheckBox(Products[i] + " Precio: " + precioProduct[i]);
                            altura += 30;
                            caja[i].setBounds(20,altura,400,30);
                            caja[i].setVisible(true);
                            f.add(caja[i]);
                            /*En caso de no elegir las otras opciones solo queda la de ver todos los productos, que nos muestra 
                             * los 20 articulos que tenemoscon el mismo formato
                             */
                            contador +=1;
                        }
                    break;
            }
            
        final int limite = contador;

        JCheckBox no = new JCheckBox("No Comprar Nada");   
        altura += 30;
        no.setBounds(20, altura, 400, 30); 
        no.setVisible(true);
        f.add(no);

        JButton aceptar = new JButton("Comprar");
        /*boton para interactuar con la ventana y los checkboxs entre parentesis el titulo del boton */
        aceptar.setBounds(500, altura, 100, 50);
        /*Medidas y posicion de nuestro boton */
        aceptar.setVisible(true);
        /*Ver visible el boton */
        /*Agregar el boton */
        f.add(aceptar);

        JButton cancelar = new JButton("Cancelar Compra");
        cancelar.setBounds(610, altura, 200, 50);
        cancelar.setVisible(true);
        //cancelar.addActionListener((ActionListener) this);
        f.add(cancelar);

        f.setSize(850,altura + 100);
        /*El tamano que tendra de nuetra ventana por default*/
        f.setVisible(true);
        /*Ver la ventana, que sea visible */
        
        ActionListener botones = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder mensaje = new StringBuilder();
                //para armar textos o sintaxis/formatos,  es parecido a StringFormat
                int cont = 0;
                if (e.getSource() == aceptar){
                    Double Total = 0.0;
                    for (int i = 0; i<limite; i++){
                        if (caja[i].isSelected() && cont<10){
                            CompraProductos[i] = Products[i];
                            precio[i] = precioProduct[i];
                            Total += precio[i];
                            cont += 1;
                        }
                    }

                    mensaje.append("Productos seleccionados:\n");
                        for (int i = 0; i < limite; i++) {
                            if (CompraProductos[i] != null && precio[i] != 0) {
                                mensaje.append(CompraProductos[i]).append(" - Precio: ").append(precio[i]).append("\n");
                            }
                        }
                    
                    if (codigo == 277353 ) {
                        Total = Total*0.9;
                        // Agregar el total al mensaje
                        mensaje.append("\nTienes descuento del 10%");
                        mensaje.append("\nTotal: ").append(Total);
                    }else{
                        mensaje.append("\nTotal: ").append(Total);
                    }

                    // Mostrar la cadena en un JOptionPane
                    JOptionPane.showMessageDialog(null, mensaje.toString(), "Lista de Productos y Total", JOptionPane.INFORMATION_MESSAGE);

                } else if (e.getSource() == cancelar){
                    JOptionPane.showMessageDialog(null, "Apretaste que no quieres", "Cancelar", 0);
                }
                
            }
        };
        aceptar.addActionListener(botones);
        cancelar.addActionListener(botones);
        
    }

    

    public static void main(String[] args) {
        
        Scanner respuesta = new Scanner(System.in);
        /*Scanner donde leeremos las respuestas */
        Scanner numeros = new Scanner(System.in);
        /*Scanner donde leeremos los numeros */
        Scanner Articulos = new Scanner(System.in);
        /*Scanner donde leeremos los articulos que compraremos */

        String opcion = "";
        /*opcion para los menus */
        String Opt = "";
        /*opcion para el control de las compras, pudiendo comprar un maximo */
        int codigo = 0;
        /* para validar Codigo de descuento */
        Double total = 0.0;
        /*Calcular el total, con decimales si se usa el codigo de descuento */
        int limite = 2;
        /*Marca el limite de articulos que pued comprar la persona */

        String categorias[] = {"Niña","Niño","Mujer","Hombre","Ver todos los productos"};
        /*Array con la categorias, estas van en el menu desplegable */
        String opciones[] = {"Ver catalogo","Conoce tu talla","Canjear un codigo","Dedicado a mi novia hermosa Kathya<3","Salir"};
        /*Array con las opciones del menu principal, igual mostrarlas en el menu desplegable */


        do{

            opcion = (String) JOptionPane.showInputDialog(null,
            "Que opcion desea realizar? \n",/*mensaje a mostar */
            "Menu Principal",/*titulo de la ventana */
            JOptionPane.DEFAULT_OPTION, null, opciones,opciones); 
            /*default abre el menu desplagable con una opcion por defecto
             * icono nulo porque no elegimos, opciones arrary para las opciones del menu, 
             * el ultimo opciones es la opcion por default, que sera opciones lanzando el primer valor
             */
            int contador = 0;
            /*contador de veces que elige un producto el usuario */

            String Products[] = {"Zapatos Shein color rosa, talla 8", "Sadak Huarache frozen con tacon, talla 9", "Zapatos shein color negro de vestir, talla 9", "Tenis de moda girls attitude color rosa, talla 8"," Tenis Nike Court Borought color rosa, talla 10",//Termina Productos Nina 
            "Nautica Spinnaker Plebbed plano color blanco, talla 9", "Landhiker color blanco, talla 10", "Marvel botines de spiderman talla 9", "Bruno Marc zappatos Oxford de vestir, talla 9", "Tenis casual para niño Rokino Modelo 3186, talla 11", //Termina Productos Nino 
            "Dream paris color blanco, talla 24", "Atoshopce color negro, talla 23", "Madden girl color durazno, talla 25", "Shoe land color negro, talla 24", "GUESS loven color blanco, talla 23", //Termina Productos Mujer 
            "Vans Old Skool color negro, talla 26", "York Team Polo Club color negro, talla 26", "Quirelli modelo 8602 color cafe, talla 26.5", "Zapato casual de piel para hombre color negro, talla 27.5", "Zapato Bordon Serraje color cafe, talla 27"};//Termina Productos Hombre
            
            int precioProduct[] = {565, 620, 970, 700, 490,
                                    600, 480, 865, 565,700, 
                                    1270, 895, 760, 870, 960,
                                    1600, 800, 950, 650, 500};
            
            String productos[];
            int precio[];
            precio = new int[10];
            productos = new String[10];
            /*variables donde guardamos los articulos que compro el usuario, nombre y producto*/
    
            switch (opcion) {
                case "Ver catalogo":

                   opcion = (String) JOptionPane.showInputDialog(null,
                    "Eliga",
                    "Menu De Categorias",
                     JOptionPane.DEFAULT_OPTION, null, categorias,categorias); 
                    /*Menu desplagable de las categorias */

                    new Zapateria(opcion, codigo);
                    /*llamamos la funcion de zapateria donde tenemos el switch segun la accion*/
                              
                    opcion ="Salir";

                break;
                
                case "Conoce tu talla":
                    System.out.println("Bienvenido al modulo para conocer tu talla");
                    System.out.println("Antes de comenzar indique si es hombre, mujer o Infante (H/M/I)");
                    String Sexo = respuesta.next();
                    /*Mostrara una tabla segun sea el sexo del cliente o un infante */

                    System.out.println("Utiliza la regla que se te proporciona en el establecimiento");
                
                    System.out.println("tabla de tallas \n talla 1 \n talla 2\n talla 3\n"); //mostrar tabla de tallas de ninos
                    if (Sexo.equals("H")){
    
                        System.out.println("talla 1 \n talla 2\n talla 3"); 
                        //muestra las tallas de hombre
                    } else if (Sexo.equals("M")) {

                        System.out.println("talla 1 \n talla 2\n talla 3"); 
                        //muestra las tallas de mujer
                    }else{

                        System.out.println("talla 1 \n talla 2\n talla 3"); 
                        //muestra las tallas de infantes
                    }
    
                break;
               
                case "Canjear un codigo":
                    // codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su codigo"));
                    //codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su codigo"));
                    //System.out.println("Bienvenido al menu de codigos canjeables");
                    //System.out.println("Tiene usted un codigo de canje? (y/n)");
                    //String resp = respuesta.next();
                    
                        System.out.println("Ingrese el codigo de canje");
                        codigo = numeros.nextInt();
                        /*Si la respuesta es si a tener un codigo de canje preguntara cual es y verificara 
                         * si es igual al codigo de descuentos, sino arrojara otro mensaje
                         */
                        if (codigo!=277353){
                            JOptionPane.showInputDialog(null, "Tu codigo es invalido, desea intentar de nuevo?");
                            /*En dado que no sea arroja una ventana donde dice que no es correcto y pregunta si desea continuar */
                        }

                break;

                case "Salir":
                        JOptionPane.showMessageDialog(null, "Vuelva Pronto", "Mensaje de Salida", JOptionPane.INFORMATION_MESSAGE);
                        /*opcion de salir, termina el codigo con un mensaje de salida */
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Eres lo mas hermoso y bonito que me ha pasado en la vida amor\n te amo tanto y es enserio cuando lo digo y que eres mi princesa hermosa, preciosa, mi bb,\n mi todo mi amorcito\n TE AMOOOOOOOOOO!!!!!!!");
                    /*Dedicatoria a la novia de Aya --Te Amoooooooo--*/
                break;
            }    
        }while (opcion!="Salir");
        //do while se refiere a repetir mientras la condicion se cumpla
        
    }

    //asi se escribe una funcion
    private static void caseNull() {
        JOptionPane.showMessageDialog(null, "Vuelva Pronto", "Adios Usuario", JOptionPane.CLOSED_OPTION);
            /*Se compone de varias cosas el JOptionPane usamos null para nose, lo siguiente es el mensaje que queremos muestre
            y con eso tenemos un simple messagebox pero para poner titulo lo ponemos entreparentesis seguido de la coma, y despues usamos
            el tipo de mensaje que es, ya que al tener titulo necesita un icono, por ejemplo advertencia, info, salir, aceptar etc. */    
    }

}
