import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer;
        int cat=0;
        int op=0,elegido=0,resultado=0,c_i,c_j;
        //elegido importante sis
        op_matriz operacion=new op_matriz(); 
        //game_matriz;
        game_matriz game=new game_matriz();
        //Nodos
        Historial movimientos=new Historial();
        //
        System.out.println("a");
        int[][] matriz=new int[4][4];
        op_matriz.llenar_M(matriz);
        while(op!=7){
            System.out.println("____________________________");
            operacion.mostrar_M(matriz);
            //do{
            //    System.out.println("Escoga un numero para mover");
            //    leer=new Scanner(System.in);
//                elegido=leer.nextInt();

//            }while(elegido>=10);
            c_i=op_matriz.buscar_i(matriz, elegido, resultado);
            c_j=op_matriz.buscar_j(matriz, elegido, resultado);
            //9System.out.println(c_i+"-"+c_j+" coordenadas de "+elegido);
            System.out.println("1.- Arriba");
            System.out.println("2.- Abajo");
            System.out.println("3.- Derecha");
            System.out.println("4.- Izquierda");
            System.out.println("5.- Mostrar historial de partidas jugadas");
            System.out.println("6.- Desacer una jugada");
            System.out.println("eliga una opcion");
            leer=new Scanner(System.in);
            op=leer.nextInt();
            switch(op){
                case 1:{
                    game.arriba(c_i, c_j, elegido, matriz);
                    movimientos.nuevo(matriz);
                    cat++;
                    break;
                }
                case 2:{
                    game.abajo(c_i, c_j, elegido, matriz);
                    movimientos.nuevo(matriz);
                    cat++;
                    break;
                }
                case 3:{
                    game.derecha(c_i, c_j, elegido, matriz);
                    movimientos.nuevo(matriz);
                    cat++;
                    break;
                }
                case 4:{
                    game.izquierda(c_i, c_j, elegido, matriz);
                    movimientos.nuevo(matriz);
                    cat++;
                    break;
                }
                case 5:{
                    movimientos.mostrar();
                    System.out.println("cantidad="+cat);
                    break;
                }
                case 6:{
                    movimientos.Buscar(matriz, cat);
                    break;
                }
            }
        }
    }
}