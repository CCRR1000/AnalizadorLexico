
package funcionalidad;

import java.util.ArrayList;
import elementos.*;

public class Analizador {
    
    private ArrayList<Token> listaTokens = new ArrayList<Token>();
    private ArrayList<ErrorLexico> listaErrores = new ArrayList<ErrorLexico>();
    private static String transiciones;

    public void Analizar(String texto) {

        listaTokens.clear();
        listaErrores.clear();
        transiciones = ("\n  TRANSICIONES EN EL AUTOMATA:\n  ---------------------------\n\n");    
        String cadena = "";
        int estadoActual = 0, fila = 1, columna = 1, filaCadena, colCadena;
        
        for (int i = 0; i < texto.length(); i++) {

            
            
            if ((texto.charAt(i) != ' ') && (texto.charAt(i) != '\n')) {
                
                this.addTransicion("  S" + estadoActual + "  ->");
                estadoActual = Automata.nuevoEstado(texto.charAt(i), estadoActual);
                cadena += texto.charAt(i);
                this.addTransicion("  " + texto.charAt(i) + "  ->  S" + estadoActual + "\n");

                if (estadoActual == -1) {
                    
                    ErrorLexico erl = new ErrorLexico(cadena, fila, columna, "Error léxico");
                    listaErrores.add(erl);
                    estadoActual = 0;
                    cadena = "";
                } else if (estadoActual == -5) {
                    
                    listaErrores.add(new ErrorLexico(cadena, fila, columna, "Símbolo no admitido"));
                    estadoActual = 0;
                    cadena = "";
                }

            } else {

                if (!cadena.isEmpty()) {

                    for (TipoToken tk : TipoToken.values()) {
                        if (tk.getEstadoAcept() == estadoActual) {
                            int columnaToken = columna - cadena.length();
                            Token nuevoToken = new Token(cadena, tk, fila, columnaToken);
                            listaTokens.add(nuevoToken);

                            this.addTransicion("  Token: " + nuevoToken.getTipoToken().name() + ",   Lexema: " 
                                    + nuevoToken.getLexema() + "\n\n");

                            estadoActual = 0;
                            cadena = "";
                        }
                    }

                }
            }
            
            if (texto.charAt(i) == '\n') {
                fila++;
                columna = 0;
            }

            columna++;
        }

    }
        
    public void addTransicion(String transiciones) {       
        this.transiciones = this.transiciones + transiciones;
    }
    
    public String getTransiciones() {
        return transiciones;
    }
    
    public ArrayList<Token> getListaTokens() {
        return listaTokens;
    }

    public void setListaTokens(ArrayList<Token> listaTokens) {
        this.listaTokens = listaTokens;
    }

    public ArrayList<ErrorLexico> getListaErrores() {
        return listaErrores;
    }

    public void setListaErrores(ArrayList<ErrorLexico> listaErrores) {
        this.listaErrores = listaErrores;
    }

}
