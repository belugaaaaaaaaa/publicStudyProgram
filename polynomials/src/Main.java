import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        HermitePolynomial hermite = new HermitePolynomial();
        ArrayList<Double> xlist = new ArrayList<>();
        ArrayList<Double> ylist = new ArrayList<>();
        ArrayList<Double> y2list = new ArrayList<>();
        xlist.add(1.0);xlist.add(3.0);xlist.add(-8.0);xlist.add(6.0);xlist.add(-4.0);//在此处设置自变量的值
        ylist.add(1.0);ylist.add(9.0);ylist.add(64.0);ylist.add(36.0);ylist.add(16.0);//在此处设置因变量的值
        y2list.add(2.0);y2list.add(6.0);y2list.add(-16.0);y2list.add(12.0);y2list.add(-8.0);//此处设置导数值
        double xIndex=2.4;
        System.out.println("the answer is:" + hermite.Hermite(xIndex,xlist,ylist,y2list));
    }
}