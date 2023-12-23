package begin.variable;

    class v{
    static int a = 10;

    void code() {
        int b = 10;
        System.out.println(a + " " + b);
        ++a;/*VALUE INCRESED*/
        ++b;
    }

    public static void main(String[] args) {
        v n = new v();
        n.code();
        n.code();
    }
}
