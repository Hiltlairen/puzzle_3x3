class game_matriz{
    void arriba(int c_i,int c_j,int elegido,int[][]matriz){
        //para i-
        if(c_i>0){
            c_i--;
            cambiar(c_i, c_j, elegido, matriz);
        }
        else{
            System.out.println("limite alcanzado");
        }

    }
    void abajo(int c_i,int c_j,int elegido,int[][]matriz){
        //para i+
        if(c_i<4){
            c_i++;
            cambiar(c_i, c_j, elegido, matriz);
        }
        else{
            System.out.println("limite alcanzado");
        }
    }
    void derecha(int c_i,int c_j,int elegido,int[][]matriz){
        //para j+
        if(c_j<4){
            c_j++;
            cambiar(c_i, c_j, elegido, matriz);
        }
        else{
            System.out.println("limite alcanzado");
        }
    }
    void izquierda(int c_i,int c_j,int elegido,int[][]matriz){
        //para j-
        if(c_j>0){
            c_j--;
            cambiar(c_i, c_j, elegido, matriz);
        }
        else{
            System.out.println("limite alcanzado");
        }
    }
    void cambiar(int c_i,int c_j,int elegido,int[][]matriz){
        int old;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matriz[i][j]==elegido){
                    //ya seleccionado cambiamos con las nuevas coordenadas 
                    old=matriz[i][j];
                    matriz[i][j]=matriz[c_i][c_j];
                    matriz[c_i][c_j]=old;
                }
            }
        }
    }
}