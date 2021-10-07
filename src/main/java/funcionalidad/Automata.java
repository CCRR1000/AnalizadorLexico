
package funcionalidad;

public class Automata {
    
    /**
     * 
     * TABLA DE TRANSICIONES
     * S0 -> letra  -> S1       S0 -> '+' -> S6         S0 -> '(' -> S7         S1 -> letra  -> S1
     * S0 -> dígito -> S2       S0 -> '-' -> S6         S0 -> ')' -> S7         S1 -> dígito -> S1
     * S0 ->  '.'   -> S5       S0 -> '*' -> S6         S0 -> '[' -> S7         S2 -> dígito -> S2
     * S0 ->  ','   -> S5       S0 -> '/' -> S6         S0 -> ']' -> S7         S2 ->  '.'   -> S3
     * S0 ->  ';'   -> S5       S0 -> '%' -> S6         S0 -> '{' -> S7         S3 -> dígito -> S4
     * S0 ->  ':'   -> S5                               S0 -> '}' -> S7         S4 -> dígito -> S4
     * 
     */
    
    // El numero de fila indica el numero que se asignara a los simbolos que se encuentren en dicha fila
    private static char[][] sigma = {
        /* 0 */ { 'L' }, // [a-zA-Z]
        /* 1 */ { 'D' }, // [0-9]
        /* 2 */ { '.' }, 
        /* 3 */ { ',',  ';',  ':' },
        /* 4 */ { '+',  '-',  '*',  '/',  '%' }, 
        /* 5 */ { '(',  '[',  '{',  '}',  ']',  ')' }
    };

    private static int[][] matrizResumida = { // [estado][simbolo]
        //--0----1----2----3----4----5--
        {   1,   2,   5,   5,   6,   7  }, // S0 
        {   1,   1,  -1,  -1,  -1,  -1  }, // S1 
        {  -1,   2,   3,  -1,  -1,  -1  }, // S2
        {  -1,   4,  -1,  -1,  -1,  -1  }, // S3 
        {  -1,   4,  -1,  -1,  -1,  -1  }, // S4 
        {  -1,  -1,  -1,  -1,  -1,  -1  }, // S5
        {  -1,  -1,  -1,  -1,  -1,  -1  }, // S6 
        {  -1,  -1,  -1,  -1,  -1,  -1  }  // S7
        //--0----1----2----3----4----5--
    };
    
    public static int nuevoEstado(char ch, int estadoActual) {
        
        int nSimbol = Automata.getNumSimbolo(ch);
        
        if (nSimbol == -5) {
            return nSimbol;
        } else {
            return Automata.matrizResumida[estadoActual][nSimbol];
        }
    }
    
    public static int getNumSimbolo(char ch) {
        
        if (Character.isLetter(ch)) {
            return 0;  // 0 = letras

        } else if (Character.isDigit(ch)) {
            return 1; // 1 = números 

        } else {

            for (int i = 2; i < sigma.length; i++) {
                
                for (int j = 0; j < sigma[i].length; j++) {
                    
                    if (ch == sigma[i][j]) {
                        return i;  // retorna el numero de fila en que se encuentra el símbolo en la matriz sigma 
                    } // fin if
                    
                } // fin for-j
                
            } // fin for-i
            
        } // fin if-else

        return -5; // El caracter no pertenece al alfabeto del autómata
    }
    
    
    
//    public static int nuevoEstado2(char ch, int estadoActual) {
//
//        int SiguienteEstado = -1;
//        
//        if ((ch == ' ') | (ch == '\n')) {        
//            SiguienteEstado = 0;
//        
//        } else {
//                            
//            switch (estadoActual) {
//                /**
//                 * 
//                 * TABLA DE TRANSICIONES
//                 * S0 -> letra  -> S1       S0 -> '+' -> S6         S0 -> '(' -> S7         S1 -> letra  -> S1
//                 * S0 -> dígito -> S2       S0 -> '-' -> S6         S0 -> ')' -> S7         S1 -> dígito -> S1
//                 * S0 ->  '.'   -> S5       S0 -> '*' -> S6         S0 -> '[' -> S7         S2 -> dígito -> S2
//                 * S0 ->  ','   -> S5       S0 -> '/' -> S6         S0 -> ']' -> S7         S2 ->  '.'   -> S3
//                 * S0 ->  ';'   -> S5       S0 -> '%' -> S6         S0 -> '{' -> S7         S3 -> dígito -> S4
//                 * S0 ->  ':'   -> S5                               S0 -> '}' -> S7         S4 -> dígito -> S4
//                 * 
//                 */
//                case 0:
//                
//                    if (Character.isLetter(ch)) { // S0 -> letra  -> S1 
//                        SiguienteEstado = 1;
//                    } else if (Character.isDigit(ch)) { // S0 -> dígito -> S2 
//                        SiguienteEstado = 2;
//                    } else if ( (ch == '.') || (ch == ',') || (ch == ':') || (ch == ';') ) { // S0 -> ( . | , | ; | : ) -> S5 
//                        SiguienteEstado = 5;
//                    } else if ( (ch == '+') || (ch == '-') || (ch == '*') || (ch == '/') || (ch == '%') ) { // S0 -> ( + | - | / | * | % ) -> S6 
//                        SiguienteEstado = 6;
//                    } else if ( (ch == '(') || (ch == ')') || (ch == '[') || (ch == ']') || (ch == '{') || (ch == '}') ) { // S0 -> ( '(' | ')' | '[' | ']' | '{' | '}' ) -> S7 
//                        SiguienteEstado = 7;
//                    } else { // No pertenece al alfabeto
//                        SiguienteEstado = -5;
//                    }
//                    break;
//
//                case 1:
//                    if (Character.isLetterOrDigit(ch)) { // S1 -> ( letra | dígito ) -> S1
//                        SiguienteEstado = 1;
//                    }
//                    break;
//
//                case 2:
//                    if (Character.isDigit(ch)) { // S2 -> dígito -> S2
//                        SiguienteEstado = 2;
//                    } else if (ch == '.') { // S2 ->  '.'   -> S3
//                        SiguienteEstado = 3;
//                    }
//                    break;
//
//                case 3:
//                    if (Character.isDigit(ch)) { // S3 -> dígito -> S4
//                        SiguienteEstado = 4;
//                    }
//                    break;
//
//                case 4:
//                    if (Character.isDigit(ch)) { // S4 -> dígito -> S4
//                        SiguienteEstado = 4;
//                    }
//                    break;
//            }
//
//        }
//            return SiguienteEstado;
//            
//    }
}
