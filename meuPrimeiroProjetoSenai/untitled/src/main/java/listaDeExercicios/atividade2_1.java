// 2.1 Comparação de dois números
class Main2_1 {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;

        boolean maior = A > B;

        System.out.println("A MAIOR QUE B? " + maior);
        System.out.println("A MENOR QUE B? " + (A < B));
        System.out.println("A MAIOR OU IGUAL A B? " + (A >= B));
        System.out.println("A MENOR OU IGUAL QUE B? " + (A <= B));
        System.out.println("A IGUAL B? " + (A == B));
        System.out.println("A DIFERENTE DE B? " + (A != B));
    }
}