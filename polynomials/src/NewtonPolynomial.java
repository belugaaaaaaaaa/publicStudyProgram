import java.util.ArrayList;

public class NewtonPolynomial {
    //牛顿插值法
    public double Newton(double xIndex, ArrayList<Double> xList, ArrayList<Double> yList) {
        double result = yList.get(0);
        int counter;
        int firstIndex = 0;
        int lastIndex;
        for (counter = 2; counter <= xList.size(); counter++) {
            double product = 1;
            lastIndex = counter - 1;
            for (int i = 0; i < lastIndex; i++) {
                product = product * (xIndex - xList.get(i));
            }
            result = result + product * poorQuotient(firstIndex, lastIndex, xList, yList);
        }
        return result;
    }

    //求差商
    public double poorQuotient(int firstIndex, int lastIndex, ArrayList<Double> xList, ArrayList<Double> yList) {
        if (lastIndex - firstIndex > 1) {
            return (poorQuotient(firstIndex + 1, lastIndex, xList, yList) - poorQuotient(firstIndex, lastIndex - 1, xList, yList)) / (xList.get(lastIndex) - xList.get(firstIndex));
        } else if (lastIndex - firstIndex == 1) {
            return (yList.get(lastIndex) - yList.get(firstIndex)) / (xList.get(lastIndex) - xList.get(firstIndex));
        } else {
            return 1;//此为不可到达语句
        }
    }
}
