
package ejemploenumeraciones;

/**
 *
 * @author danteNovoa
 */
public enum Continentes {
    AMERICA(34),
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    OCEANIA(14);
    
    private final int paises;
    
    Continentes(int paises){
    
        this.paises= paises;
    }
    
    public int getPaises(){
    
        return paises;
    }    
}