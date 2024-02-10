package Org.umg.clase;


import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class TablaPronostico {

    public void calculos(){
    double [] demanda = {133,292,283,302,400,505,608,667,783,785,799};
    double [] periodo = {1,2,3,4,5,6,7,8,9,10,11,12};
    double [] Pronostico = caculorPronostico(demanda,periodo,10);
    for (int x=0;x<periodo.length;x++){
        pronostico = calularPronostico(demanda,periodo,x);
        System.out.println(+".pronostico="+ pronostico);
    }
    //creamos un Stream del arreglo
        DoubleStream StreamPeriodo = DoubleStream.of(periodo);
    //iterar en cada elemento
    StreamPeriodo.forEach(mes )->{
        System.out.println("mes"+mes+"Pronostico:"+Math.round(calcularPronostico(demanda,periodo,mes)));
        });

    System.out.println("Pronostico mes 10:"+ pronostico);

    }
    private double[] caculorPronostico (double [] y, double [] x, double valorX){
        double n= 0;
        double sumXy =0;
        double sumX = Arrays.stream(x).sum();
        double sumY = Arrays.stream(y).sum();
        double sumX2 = Arrays.stream(x).map(xi -> xi * xi).sum();

        for (int i = 0; i< n; i++){
            sumXY += x[i] * y[i];
        }

        return y;
    }
}
