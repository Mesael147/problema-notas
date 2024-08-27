
public class Main {
    private static double tareas= 3.5;
    private static double quiz= 3.0;
    private static double parcial= 4.0;
    static double corte1 = cortes.calcularCorte(tareas, quiz, parcial, 1);
    static double corte2 = cortes.calcularCorte(tareas, quiz, parcial, 2);
    static double corte3 = cortes.calcularCorte(tareas, quiz, parcial, 3);
    static double notaDefinitiva = notaTotal.calcularNotaDefinitiva(corte1, corte2, corte3);
    static String resultado = notaTotal.determinarResultado(notaDefinitiva);
    public static void main(String[] args) {
        System.out.println("sus notas en las tareas hechas es de"+tareas);
        System.out.println("sus notas en los quiz hechos es de"+quiz);
        System.out.println("sus notas en los parciales hechos es de"+ parcial);
        System.out.println("la primera nota del primer corte es"+ corte1 );
        System.out.println("la nota del segundo corte es"+ corte2);
        System.out.println("la nota del tercer corte es"+ corte3);
        System.out.println( "su nota definitiva es de"+notaDefinitiva);
        System.out.println("con todo lo visto su resultado de este semestre fue"+ resultado);

    }




}
