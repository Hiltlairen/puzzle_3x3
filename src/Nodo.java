public class Nodo {
    Nodo siguiente;
    int[][] historial=new int[3][3];
    Nodo(int[][] matriz){
        siguiente=null;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                historial[i][j]=matriz[i][j];
            }
        }

    }
    void mostrar(){
        System.out.println("------------Historial-------------");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("\t"+historial[i][j]);
            }
            System.out.println("");
        }
    }
}
