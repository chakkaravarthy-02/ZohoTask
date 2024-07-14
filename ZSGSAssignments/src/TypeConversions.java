public class TypeConversions {
    public static void main(String[] args){
        //byte-short
        byte b0=23;
        short s=b0;
        System.out.println(s);
        //short-byte
        byte b1=(byte)s;
        System.out.println(b1);
        //byte-int
        byte b=127;
        int i=b+2;
        System.out.println(i);
        //int-byte
        byte b2=(byte)i;
        System.out.println(b2);
        //byte-float
        float f=b2+1;
        System.out.println(f);
        //float-byte
        byte b3=(byte)f;
        System.out.println(b3);
        //byte-long
        long l=b3+1000000;
        System.out.println(l);
        //long-byte
        byte b4=(byte)l;
        System.out.println(b4);
        //byte-double
        double d=b4+ 10000000000L;
        System.out.println(d);
        //double - byte
        byte b5=(byte)d;
        System.out.println(b5);

        //short-int
        short s1=87;
        int i1=s1;
        System.out.println(i1);
        //int-short
        short s2=(short)i1;
        System.out.println(s2);
        //short-long
        long l2=s1;
        System.out.println(l2);
        //long-short
        short s4=(short)l2;
        System.out.println(s4);
        //short-float
        float f1=s1+1;
        System.out.println(f1);
        //float-short
        short s3= (short) f1;
        System.out.println(s3);
        //short-double
        double d1=s1;
        System.out.println(d1);
        //double-short
        short s5=(short)d1;
        System.out.println(s5);

        //int-float
        float f2=39;
        System.out.println(f2);
        //float-int
        int i2=(int)f2;
        System.out.println(i2);
        //int-double
        double d2=i2+2;
        System.out.println(d2);
        //double-int
        int i3=(int)d2;
        System.out.println(i3);
        //int-long
        long l3=876;
        System.out.println(l3);
        //long-int
        int i5=(int)l3;
        System.out.println(i5);

        //long-float
        float f4=1002939303L;
        System.out.println(f4);
        //float-long
        long l4=(long)f4;
        System.out.println(l4);
        //long-double
        double d3=l4+22;
        System.out.println(d3);
        //double-long
        long l5=(long)d3;
        System.out.println(l5);
        //float-double
        double d6=55.99;
        System.out.println(d6);
        //double-float
        float f6=(float)d6;
        System.out.println(f6);
    }
}


