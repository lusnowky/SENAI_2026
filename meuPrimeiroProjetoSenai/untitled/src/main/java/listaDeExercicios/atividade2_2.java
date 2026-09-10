// 2.2 Operadores lógicos
class Main2_2 {
    public static void main(String[] args) {
        boolean nota = true;
        boolean freq = true;
        boolean matar = true;

        boolean resultado = nota && freq && !matar;
        System.out.println("Resultado: " + resultado);
    }
}