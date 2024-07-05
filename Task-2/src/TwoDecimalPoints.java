import java.math.BigDecimal;
import java.math.RoundingMode;

public class TwoDecimalPoints {
    public static void main(String[] args){
        double value = 7.50;

        //using BigDecimal Class.
        BigDecimal bigDecimal=new BigDecimal(value).setScale(2, RoundingMode.HALF_UP);
        System.out.println(bigDecimal);

        //using format(%.2f,value)
        System.out.format("%.2f",value);
    }
}