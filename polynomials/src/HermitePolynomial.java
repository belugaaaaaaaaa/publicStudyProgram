import java.util.ArrayList;
public class HermitePolynomial {
    public double Hermite(double xIndex, ArrayList<Double> xList, ArrayList<Double> yList,ArrayList<Double> y2List){
        double result = 0;
        for (int j = 0;j<xList.size();j++){
            result = result + yList.get(j) * alpha(xIndex,j,xList) + y2List.get(j) * beta(xIndex,j,xList);
        }
        return result;
    }
    public double alpha(double xIndex,int j,ArrayList<Double> xList){
        double result = 1;
        double mid = 0;
        for (int k = 0;k< xList.size();k++){
            if (k != j){
                result = result * (xIndex - xList.get(k)) / (xList.get(j) - xList.get(k));
                mid = mid + 1 / (xList.get(j) - xList.get(k));
            }
        }
        result = result * result * (1 + 2 * (xList.get(j) - xIndex) * mid);
        return result;
    }
    public double beta(double xIndex,int j,ArrayList<Double> xList){
        double result = 1;
        for (int k = 0;k< xList.size();k++) {
            if (k != j) {
                result = result * (xIndex - xList.get(k)) / (xList.get(j) - xList.get(k));
            }
        }
        result = result * result * (xIndex - xList.get(j));
        return result;
    }
}