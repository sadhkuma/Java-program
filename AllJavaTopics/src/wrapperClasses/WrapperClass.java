package wrapperClasses;

class WrapperClass
{
    public static void main(String args[])
    {
        byte x = 2;

        Byte byteobj = new Byte(x);

        int y = 20;

        Integer intobj = new Integer(y);

        float z = 28.6f;

        Float floatobj = new Float(z);

        double d = 258.5;

        Double doubleobj = new Double(d);

        char e='a';

        Character charobj=e;

        System.out.println("The values of Wrapper objects are");
        System.out.println("Byte object byteobj: " + byteobj);
        System.out.println("Integer object intobj: " + intobj);
        System.out.println("Float object floatobj: " + floatobj);
        System.out.println("Double object doubleobj: " + doubleobj);
        System.out.println("Character object charobj: " + charobj);

        byte bytev = byteobj;
        int intv = intobj;
        float floatv = floatobj;
        double doublev = doubleobj;
        char charv= charobj;

        System.out.println("The unwrapped values are");
        System.out.println("byte value: " + bytev);
        System.out.println("int value: " + intv);
        System.out.println("float value: " + floatv);
        System.out.println("double value: " + doublev);
        System.out.println("char value: " + charv);
    }
}
