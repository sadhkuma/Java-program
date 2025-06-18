package instanceOf;

class program {
}

class Program2 extends program {//Program2 inherits program

    public static void main(String args[]) {
        Program2 d = new Program2();
        System.out.println(d instanceof program);//true
    }
}
