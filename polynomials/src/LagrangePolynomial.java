import java.util.ArrayList;

public class LagrangePolynomial {
    //拉格朗日插值法
    public double Lagrange(double xIndex, ArrayList<Double> xList, ArrayList<Double> yList){
        double result = 0.0;
        int xcount = -1;
        double product = 1.0;
        for (double y:yList){
            xcount++;
            for (double x:xList){
                if(x != xList.get(xcount)){
                    product = product * (xIndex - x) / (xList.get(xcount) - x);
                }
            }
            result = result + product * y;
            product = 1.0;
        }
        return result;
    }
}
