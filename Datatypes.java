class Datatypes {
    public static void main(String args[]){
        //integral numbers
        //byte
        //short
        //int
        //long
        byte a = 10;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        short b = 100;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        int c = 1000;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        long d = 1000000l;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //Decimal Numbers
        //float
        //double
        float salary = 12.12f;
        double salary2 = 122.12233;
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        //character
        char shu = 'a';
        System.out.println((int) shu);
        char shu2 ='2';
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);

        System.out.println((char) 10084);
        char hindiChar = 2309;
        System.out.println(hindiChar);

        //hexadecimal number or unicode representation
        char heart = '\u2764';
        System.out.println(heart);

        //Boolean true, false
        boolean Shubham = true;
        System.out.println(Shubham);

        //implicit conversion, widning conversion, automatic
        byte bytevalue = 10;
        short shortvalue = bytevalue;
        int intvalue = shortvalue;
        long longvalue = intvalue;
        float floatvalue = longvalue; //it acepts long due to float stores big number in the power format
        double doublevalue = floatvalue;

        System.out.println(bytevalue);
        System.out.println(shortvalue);
        System.out.println(intvalue);
        System.out.println(longvalue);
        System.out.println(floatvalue);
        System.out.println(doublevalue);

        char charvalue = 'a';
        int intvalue1 = charvalue;
        float floatvalue1 = charvalue;

        System.out.println(charvalue);
        System.out.println(intvalue1);
        System.out.println(floatvalue1);

    }
}
