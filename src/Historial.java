public class Historial {
    Nodo puntero;
    int cant=0;
    int[][] falsa=new int[3][3];
    int historial[][];
    Historial(){
        puntero=null;
    }
    void nuevo(int[][]matriz){
        if(puntero==null){
            puntero=new Nodo(matriz);
            cant++;
            return;
        }
        Nodo actual=puntero;
        while(actual.siguiente!=null){
            actual=actual.siguiente;
        }
        cant++;
        actual.siguiente=new Nodo(matriz);
    }
    void Buscar(int[][]matriz,int dato){
        Nodo actual=puntero;
        while(actual.siguiente.siguiente!=null){
            actual=actual.siguiente;
        }
        System.out.println("b");
        regi(matriz,actual.historial);

    }
    void mostrar(){
        if(puntero==null){
            System.out.println("no existe ningun elemento en la fila");
            return;
        }
        else{
            Nodo actual=puntero;
            System.out.println("-."+cant);
            for(int c=0;c<cant;c++){
                System.out.println((c+1)+".-");
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        System.out.print("-"+actual.historial[i][j]);
                    }
                    System.out.println("");
                }  
                actual=actual.siguiente;  
                
            }
        }
    }
    void regi(int[][] matriz,int[][] historial){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j]=historial[i][j];
            } 
        }
    }
}
