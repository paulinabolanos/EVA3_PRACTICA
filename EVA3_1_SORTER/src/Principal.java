

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SELECTION SORT");
        int[] iArreglos = new int [1000000];
        for (int i = 0; i < iArreglos.length; i++) {
        iArreglos[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicios = System.nanoTime();
        insertionSort(iArreglos);
        long tiempoFins = System.nanoTime();
        long outputs = tiempoFins - tiempoInicios;
        System.out.println("Tiempo en nanosegundos: " + outputs);
        
        int[] iArreglos2 = new int [1000000];
        for (int i = 0; i < iArreglos2.length; i++) {
        iArreglos2[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicios2 = System.nanoTime();
        insertionSort(iArreglos2);
        long tiempoFins2 = System.nanoTime();
        long outputs2 = tiempoFins2 - tiempoInicios2;
        System.out.println("Tiempo en nanosegundos: " + outputs2);
        
        int[] iArreglos3 = new int [1000000];
        for (int i = 0; i < iArreglos3.length; i++) {
        iArreglos3[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicios3 = System.nanoTime();
        insertionSort(iArreglos3);
        long tiempoFins3 = System.nanoTime();
        long outputs3 = tiempoFins3 - tiempoInicios3;
        System.out.println("Tiempo en nanosegundos: " + outputs3);
        
        int[] iArreglos4 = new int [1000000];
        for (int i = 0; i < iArreglos4.length; i++) {
        iArreglos4[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicios4 = System.nanoTime();
        insertionSort(iArreglos4);
        long tiempoFins4 = System.nanoTime();
        long outputs4 = tiempoFins4 - tiempoInicios4;
        System.out.println("Tiempo en nanosegundos: " + outputs4);
        
        int[] iArreglos5 = new int [1000000];
        for (int i = 0; i < iArreglos5.length; i++) {
        iArreglos5[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicios5 = System.nanoTime();
        insertionSort(iArreglos5);
        long tiempoFins5 = System.nanoTime();
        long outputs5 = tiempoFins5 - tiempoInicios5;
        System.out.println("Tiempo en nanosegundos: " + outputs5);
        
        int[] iArreglos6 = new int [1000000];
        for (int i = 0; i < iArreglos6.length; i++) {
        iArreglos6[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicios6 = System.nanoTime();
        insertionSort(iArreglos6);
        long tiempoFins6 = System.nanoTime();
        long outputs6 = tiempoFins6 - tiempoInicios6;
        System.out.println("Tiempo en nanosegundos: " + outputs6);
        
        int[] iArreglos7 = new int [1000000];
        for (int i = 0; i < iArreglos7.length; i++) {
        iArreglos7[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicios7 = System.nanoTime();
        insertionSort(iArreglos7);
        long tiempoFins7 = System.nanoTime();
        long outputs7 = tiempoFins7 - tiempoInicios7;
        System.out.println("Tiempo en nanosegundos: " + outputs7);
        
        int[] iArreglos8 = new int [1000000];
        for (int i = 0; i < iArreglos8.length; i++) {
        iArreglos8[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicios8 = System.nanoTime();
        insertionSort(iArreglos8);
        long tiempoFins8 = System.nanoTime();
        long outputs8 = tiempoFins8 - tiempoInicios8;
        System.out.println("Tiempo en nanosegundos: " + outputs8);
        
        int[] iArreglos9 = new int [1000000];
        for (int i = 0; i < iArreglos9.length; i++) {
        iArreglos9[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicios9 = System.nanoTime();
        insertionSort(iArreglos9);
        long tiempoFins9 = System.nanoTime();
        long outputs9 = tiempoFins9 - tiempoInicios9;
        System.out.println("Tiempo en nanosegundos: " + outputs9);
        
        int[] iArreglos10 = new int [1000000];
        for (int i = 0; i < iArreglos10.length; i++) {
        iArreglos10[i] = (int)(Math.random() * 1000000000);
        }
        
        long tiempoInicios10 = System.nanoTime();
        insertionSort(iArreglos10);
        long tiempoFins10 = System.nanoTime();
        long outputs10 = tiempoFins10 - tiempoInicios10;
        System.out.println("Tiempo en nanosegundos: " + outputs10);
        
        System.out.println("");
        System.out.println("INSERTION SORT");
        int[] iArregloi = new int [1000000];
        for (int i = 0; i < iArregloi.length; i++) {
        iArregloi[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioi = System.nanoTime();
        insertionSort(iArregloi);
        long tiempoFini = System.nanoTime();
        long outputi = tiempoFini - tiempoInicioi;
        System.out.println("Tiempo en nanosegundos: " + outputi);
        
        int[] iArregloi2 = new int [1000000];
        for (int i = 0; i < iArregloi2.length; i++) {
        iArregloi2[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioi2 = System.nanoTime();
        insertionSort(iArregloi2);
        long tiempoFini2 = System.nanoTime();
        long outputi2 = tiempoFini2 - tiempoInicioi2;
        //imprimirArreglo(iArreglo);
        System.out.println("Tiempo en nanosegundos: " + outputi2);
        
        int[] iArregloi3 = new int [1000000];
        for (int i = 0; i < iArregloi3.length; i++) {
        iArregloi3[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioi3 = System.nanoTime();
        insertionSort(iArregloi3);
        long tiempoFini3 = System.nanoTime();
        long outputi3 = tiempoFini3 - tiempoInicioi3;
        System.out.println("Tiempo en nanosegundos: " + outputi3);
        
        int[] iArregloi4 = new int [1000000];
        for (int i = 0; i < iArregloi4.length; i++) {
        iArregloi4[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioi4 = System.nanoTime();
        insertionSort(iArregloi4);
        long tiempoFini4 = System.nanoTime();
        long outputi4 = tiempoFini4 - tiempoInicioi4;
        System.out.println("Tiempo en nanosegundos: " + outputi4);
        
        int[] iArregloi5 = new int [1000000];
        for (int i = 0; i < iArregloi5.length; i++) {
        iArregloi5[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioi5 = System.nanoTime();
        insertionSort(iArregloi5);
        long tiempoFini5 = System.nanoTime();
        long outputi5 = tiempoFini5 - tiempoInicioi5;
        System.out.println("Tiempo en nanosegundos: " + outputi5);
        
        int[] iArregloi6 = new int [1000000];
        for (int i = 0; i < iArregloi6.length; i++) {
        iArregloi6[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioi6 = System.nanoTime();
        insertionSort(iArregloi6);
        long tiempoFini6 = System.nanoTime();
        long outputi6 = tiempoFini6 - tiempoInicioi6;
        System.out.println("Tiempo en nanosegundos: " + outputi6);
        
        int[] iArregloi7 = new int [1000000];
        for (int i = 0; i < iArregloi7.length; i++) {
        iArregloi7[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioi7 = System.nanoTime();
        insertionSort(iArregloi7);
        long tiempoFini7 = System.nanoTime();
        long outputi7 = tiempoFini7 - tiempoInicioi7;
        System.out.println("Tiempo en nanosegundos: " + outputi7);
        
        int[] iArregloi8 = new int [1000000];
        for (int i = 0; i < iArregloi8.length; i++) {
        iArregloi8[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioi8 = System.nanoTime();
        insertionSort(iArregloi8);
        long tiempoFini8 = System.nanoTime();
        long outputi8 = tiempoFini8 - tiempoInicioi8;
        System.out.println("Tiempo en nanosegundos: " + outputi8);
        
        int[] iArregloi9 = new int [1000000];
        for (int i = 0; i < iArregloi9.length; i++) {
        iArregloi9[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioi9 = System.nanoTime();
        insertionSort(iArregloi9);
        long tiempoFini9 = System.nanoTime();
        long outputi9 = tiempoFini9 - tiempoInicioi9;
        System.out.println("Tiempo en nanosegundos: " + outputi9);
        
        int[] iArregloi10 = new int [1000000];
        for (int i = 0; i < iArregloi10.length; i++) {
        iArregloi10[i] = (int)(Math.random() * 1000000000);
        }
        
        long tiempoInicioi10 = System.nanoTime();
        insertionSort(iArregloi10);
        long tiempoFini10 = System.nanoTime();
        long outputi10 = tiempoFini10 - tiempoInicioi10;
        System.out.println("Tiempo en nanosegundos: " + outputi10);
        
        System.out.println("");
        System.out.println("BUBBLE SORT");
        
        int[] iArreglob = new int [1000000];
        for (int i = 0; i < iArreglob.length; i++) {
        iArreglob[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoIniciob = System.nanoTime();
        bubbleSort(iArreglob);
        long tiempoFinb = System.nanoTime();
        long outputb = tiempoFinb - tiempoIniciob;
        System.out.println("Tiempo en nanosegundos: " + outputb);
        
        int[] iArreglob2 = new int [1000000];
        for (int i = 0; i < iArreglob2.length; i++) {
        iArreglob2[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoIniciob2 = System.nanoTime();
        bubbleSort(iArreglob2);
        long tiempoFinb2 = System.nanoTime();
        long outputb2 = tiempoFinb2 - tiempoIniciob2;
        System.out.println("Tiempo en nanosegundos: " + outputb2);
        
        int[] iArreglob3 = new int [1000000];
        for (int i = 0; i < iArreglob3.length; i++) {
        iArreglob3[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoIniciob3 = System.nanoTime();
        bubbleSort(iArreglob3);
        long tiempoFinb3 = System.nanoTime();
        long outputb3 = tiempoFinb3 - tiempoIniciob3;
        System.out.println("Tiempo en nanosegundos: " + outputb3);
        
        int[] iArreglob4 = new int [1000000];
        for (int i = 0; i < iArreglob4.length; i++) {
        iArreglob4[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoIniciob4 = System.nanoTime();
        bubbleSort(iArreglob4);
        long tiempoFinb4 = System.nanoTime();
        long outputb4 = tiempoFinb4 - tiempoIniciob4;
        System.out.println("Tiempo en nanosegundos: " + outputb4);
        
        int[] iArreglob5 = new int [1000000];
        for (int i = 0; i < iArreglob5.length; i++) {
        iArreglob5[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoIniciob5 = System.nanoTime();
        bubbleSort(iArreglob5);
        long tiempoFinb5 = System.nanoTime();
        long outputb5 = tiempoFinb5 - tiempoIniciob5;
        System.out.println("Tiempo en nanosegundos: " + outputb5);
        
        int[] iArreglob6 = new int [1000000];
        for (int i = 0; i < iArreglob6.length; i++) {
        iArreglob6[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoIniciob6 = System.nanoTime();
        bubbleSort(iArreglob6);
        long tiempoFinb6 = System.nanoTime();
        long outputb6 = tiempoFinb6 - tiempoIniciob6;
        System.out.println("Tiempo en nanosegundos: " + outputb6);
        
        int[] iArreglob7 = new int [1000000];
        for (int i = 0; i < iArreglob7.length; i++) {
        iArreglob7[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoIniciob7 = System.nanoTime();
        bubbleSort(iArreglob7);
        long tiempoFinb7 = System.nanoTime();
        long outputb7 = tiempoFinb7 - tiempoIniciob7;
        System.out.println("Tiempo en nanosegundos: " + outputb7);
        
        int[] iArreglob8 = new int [1000000];
        for (int i = 0; i < iArreglob8.length; i++) {
        iArreglob8[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoIniciob8 = System.nanoTime();
        bubbleSort(iArreglob8);
        long tiempoFinb8 = System.nanoTime();
        long outputb8 = tiempoFinb8 - tiempoIniciob8;
        System.out.println("Tiempo en nanosegundos: " + outputb8);
        
        int[] iArreglob9 = new int [1000000];
        for (int i = 0; i < iArreglob9.length; i++) {
        iArreglob9[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoIniciob9 = System.nanoTime();
        bubbleSort(iArreglob9);
        long tiempoFinb9 = System.nanoTime();
        long outputb9 = tiempoFinb9 - tiempoIniciob9;
        System.out.println("Tiempo en nanosegundos: " + outputb9);
        
        int[] iArreglob10 = new int [1000000];
        for (int i = 0; i < iArreglob10.length; i++) {
        iArreglob10[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoIniciob10 = System.nanoTime();
        bubbleSort(iArreglob10);
        long tiempoFinb10 = System.nanoTime();
        long outputb10 = tiempoFinb10 - tiempoIniciob10;
        System.out.println("Tiempo en nanosegundos: " + outputb10);
        
        System.out.println("");
        System.out.println("QUICK SORT");
        
        int[] iArregloq = new int [1000000];
        for (int i = 0; i < iArregloq.length; i++) {
        iArregloq[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioq = System.nanoTime();
        quickSort(iArregloq,1,100);
        long tiempoFinq = System.nanoTime();
        long outputq = tiempoFinq - tiempoInicioq;
        System.out.println("Tiempo en nanosegundos: " + outputq);
        
        int[] iArregloq2 = new int [1000000];
        for (int i = 0; i < iArregloq2.length; i++) {
        iArregloq2[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioq2 = System.nanoTime();
        quickSort(iArregloq2,1,100);
        long tiempoFinq2 = System.nanoTime();
        long outputq2 = tiempoFinq2 - tiempoInicioq2;
        System.out.println("Tiempo en nanosegundos: " + outputq2);
        
        int[] iArregloq3 = new int [1000000];
        for (int i = 0; i < iArregloq3.length; i++) {
        iArregloq3[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioq3 = System.nanoTime();
        quickSort(iArregloq3,1 ,100);
        long tiempoFinq3 = System.nanoTime();
        long outputq3 = tiempoFinq3 - tiempoInicioq3;
        System.out.println("Tiempo en nanosegundos: " + outputq3);
        
        int[] iArregloq4 = new int [1000000];
        for (int i = 0; i < iArregloq4.length; i++) {
        iArregloq4[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioq4 = System.nanoTime();
        quickSort(iArregloq4,1,100);
        long tiempoFinq4 = System.nanoTime();
        long outputq4 = tiempoFinq4 - tiempoInicioq4;
        System.out.println("Tiempo en nanosegundos: " + outputq4);
        
        int[] iArregloq5 = new int [1000000];
        for (int i = 0; i < iArregloq5.length; i++) {
        iArregloq5[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioq5 = System.nanoTime();
        quickSort(iArregloq5,1,100);
        long tiempoFinq5 = System.nanoTime();
        long outputq5 = tiempoFinq5 - tiempoInicioq5;
        System.out.println("Tiempo en nanosegundos: " + outputq5);
        
        int[] iArregloq6 = new int [1000000];
        for (int i = 0; i < iArregloq6.length; i++) {
        iArregloq6[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioq6 = System.nanoTime();
        quickSort(iArregloq6,1,100);
        long tiempoFinq6 = System.nanoTime();
        long outputq6 = tiempoFinq6 - tiempoInicioq6;
        System.out.println("Tiempo en nanosegundos: " + outputq6);
        
        int[] iArregloq7 = new int [1000000];
        for (int i = 0; i < iArregloq7.length; i++) {
        iArregloq7[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioq7 = System.nanoTime();
        quickSort(iArregloq7,1,100);
        long tiempoFinq7 = System.nanoTime();
        long outputq7 = tiempoFinq7 - tiempoInicioq7;
        System.out.println("Tiempo en nanosegundos: " + outputq7);
        
        int[] iArregloq8 = new int [1000000];
        for (int i = 0; i < iArregloq8.length; i++) {
        iArregloq8[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioq8 = System.nanoTime();
        quickSort(iArregloq8,1,100);
        long tiempoFinq8 = System.nanoTime();
        long outputq8 = tiempoFinq8 - tiempoInicioq8;
        System.out.println("Tiempo en nanosegundos: " + outputq8);
        
        int[] iArregloq9 = new int [1000000];
        for (int i = 0; i < iArregloq9.length; i++) {
        iArregloq9[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioq9 = System.nanoTime();
        quickSort(iArregloq9,1,100);
        long tiempoFinq9 = System.nanoTime();
        long outputq9 = tiempoFinq9 - tiempoInicioq9;
        System.out.println("Tiempo en nanosegundos: " + outputq9);
        
        int[] iArregloq10 = new int [1000000];
        for (int i = 0; i < iArregloq10.length; i++) {
        iArregloq10[i] = (int)(Math.random() * 1000000000);
        }
        long tiempoInicioq10 = System.nanoTime();
        quickSort(iArregloq10,1 ,100);
        long tiempoFinq10 = System.nanoTime();
        long outputq10 = tiempoFinq10 - tiempoInicioq10;
        System.out.println("Tiempo en nanosegundos: " + outputq10);
        
        int[] iArreglo = new int [10];
        for (int i = 0; i < iArreglo.length; i++) {
        iArreglo[i] = (int)(Math.random() * 100);
        }
        imprimirArreglo(iArreglo);
        mergeSort(iArreglo);
        imprimirArreglo(iArreglo);
        

    }
    
    public static void imprimirArreglo(int[] iArre){
        for (int i = 0; i < iArre.length ; i++) {
            System.out.print("[" + iArre[i] + "]");
        }
        System.out.println("");
    }
    
    public static void selectionSort(int[] iArre){
        int iComp = 0; 
        int iSwap = 0;
        for (int i = 0; i < iArre.length; i++) {
            int iMin = i;
            for (int j = i + 1; j < iArre.length; j++) { //BUSCAN EL MENOR
                if(iArre[j] < iArre[iMin]){
                    iMin = j;//GUARDAN LA POSICIÓN DEL MÁS PEQUEÑO
                }
                iComp++;
            }//TERMINAMOS DE BUSCAR
            //INTERCAMBIAR
            int iTemp = iArre[iMin];
            iArre[iMin] = iArre[i];
            iArre[i] = iTemp;
            iSwap = 0;
        }
        System.out.println(iComp);
        System.out.println(iSwap);
    }
    
    public static void insertionSort(int[] iArre){
        for (int i = 1; i < iArre.length; i++) {
            int Temp = iArre[i];
            int j = i;
            
            while((j > 0) && (Temp < iArre[j - 1])){
                iArre[j] = iArre[j - 1];
                j--;
            }
            iArre[j] = Temp;
        }
    }
    
    public static void bubbleSort(int[] iArre){
        for (int i = 0; i < iArre.length - 1; i++) {
            for (int j = 0; j < iArre.length - i - 1; j++) {
                if(iArre[j] > iArre[j + 1]){
                    //SWAP
                    int Temp = iArre[j];
                    iArre[j] = iArre[j + 1];
                    iArre[j + 1] = Temp;
                }
            }
        }
    }
 
    public static void quickSort(int[] iArre, int iLo, int iHi){
        int pivot = iArre[iLo];
        int i = iLo - 1;
        int j = iHi + 1;
        int Temp;
        
        while(i < j){            
            while(iArre[i]<= pivot && i < j){
                i++;
            } 
            while(iArre[j]> pivot){
                j--;
            }         
            if (i < j) {                                          
                Temp = iArre[i];                  
                iArre[i] = iArre[j];
                iArre[j] = Temp;
            }
        }
        iArre[iLo]= iArre[j]; 
        iArre[j] = pivot; 
        if(iLo < j-1){
            quickSort(iArre,iLo,j-1); 
        }
        if(j+1 < iHi){
            quickSort(iArre,j+1,iHi);
        }
    }
    
    
    public static void mergeSort(int[] iArre) {
        int n = iArre.length;
        if (n < 2)
            return;
        int mid = n / 2;
        int leftSize = mid;
        int rightSize = n - mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        for (int i = 0; i < mid; i++) {
            left[i] = iArre[i];

        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = iArre[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, iArre);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < leftSize) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < leftSize) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    
    public static int binarySearch(int[] arreglo, int iValorBuscar){
        return binSearchRec(arreglo, iValorBuscar, 0, arreglo.length - 1);
    }
    
    private static int binSearchRec(int[] arreglo, int iValorBuscar, int iLo, int iHi){
        int iPos = - 1;
        int iMid = iLo + ((iHi - iLo) / 2);
        if(iLo <= iHi){
            if(iValorBuscar == arreglo[iMid]){//TARAN, LO ENCONTRAMOS!!
                iPos = iMid;
            }else if(iValorBuscar < arreglo[iMid]){//BUSCAR EN LA PARTE INFERIOR
                iPos = binSearchRec(arreglo, iValorBuscar, iLo, iMid - 1);
            }else if(iValorBuscar > arreglo[iMid]){//IMPRIMIR EN LA PARTE SUPERIOR
                iPos = binSearchRec(arreglo, iValorBuscar, iMid + 1, iHi);
            }
        }
        return iPos;
    }
    
    private static void busquedaSecuencial(int[] iArray, int iValorBuscar){
        int iPos = -1;
        for (int i = 0; i < iArray.length; i++) {
            if(iArray[i] == iValorBuscar){
                iPos = i;
            }
        }
        System.out.println(iPos);
    }
}


