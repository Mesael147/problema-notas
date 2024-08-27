public class cortes {
    public static double calcularCorte(double tareas, double quiz, double parcial, int numeroCorte) {
        double porcTareas = 0.25;
        double porcQuiz = 0.25;
        double porcParcial = (numeroCorte == 3) ? 0.40 : 0.50;
        double notaCorte = (tareas * porcTareas) + (quiz * porcQuiz) + (parcial * porcParcial);
        return notaCorte;

    }
}