public class notaTotal {
        public static double calcularNotaDefinitiva(double corte1, double corte2, double corte3) {
            double porcCorte1 = 0.35;
            double porcCorte2 = 0.35;
            double porcCorte3 = 0.30;
            double notaDefinitiva = (corte1 * porcCorte1) + (corte2 * porcCorte2) + (corte3 * porcCorte3);
            return notaDefinitiva;
        }
        public static String determinarResultado(double notaDefinitiva) {
            if (notaDefinitiva >= 3.0 && notaDefinitiva <= 5.0) {
                return "Aprobado";
            } else if (notaDefinitiva >= 1.9 && notaDefinitiva < 3.0) {
                return "Habilita";
            } else if (notaDefinitiva >= 0 && notaDefinitiva < 1.9) {
                return "Reprueba";
            } else {
                return "Error en las notas ingresadas";
            }
        }
    }


