public class op_matriz {
    static void llenar_M(int[][] matriz){
        int i=0,j=0,c=0,p=0,rn=0;   
        int a[]=new int[10];
        while(p<10){
            rn=(int) (Math.random()*10);   
            if(! g_random(a,rn,p)){ 
                a[p]=rn;
                p++;
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                matriz[i][j]=a[c];
                c++;
                }
        }
    }
    public static boolean g_random(int[] n,int rn,int i){
        for(int j=0;j<i;j++){
            if(rn==n[j]){
                return true;
            }
        }
        return false;
    }
    void mostrar_M(int[][] matriz){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                //matriz[i][j];
                System.out.print("-"+matriz[i][j]+"-");
            }
            System.out.println("");
        }
    }
    
    static int buscar_i (int[][] matriz,int elegido,int resultado){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matriz[i][j]==elegido){
                    
                    resultado=i;
                    
                }
                else{
                    //miau
                }
            }

        }
        return resultado;
    }
    static int buscar_j (int[][] matriz,int elegido,int resultado){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matriz[i][j]==elegido){
                    
                    resultado=j;
                    
                }
                else{
                
                }
            }

        }
        return resultado;
    }
}
