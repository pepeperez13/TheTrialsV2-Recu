package business.typeTrials;

/**
 * Representa una de las pruebas (en este caso siempre artículos) que pueden incluir las ediciones
 * @author Abraham Cedeño
 * @author José Pérez
 */
public class MasterStudies {
    private String name;
    private String nom;
    private int numberCredits;
    private int probability;
    private boolean inUse;

    /**
     * Método constructor que crea un nuevo artículo, teniendo en cuenta si está en uso
     * @param name Nombre de la prueba
     * @param nom Nombre del master a estudiar
     * @param numberCredits Número de créditos del master
     * @param probability Probabilidad de aprobar el master
     * @param inUse Nos permitirá saber si la prueba se usa en alguna edición
     */
    public MasterStudies(String name, String nom, int numberCredits, int probability, boolean inUse) {
        this.name = name;
        this.nom = nom;
        this.numberCredits = numberCredits;
        this.probability = probability;
        this.inUse = inUse;
    }

    /**
     * Método que nos permite saber el nombre de la prueba
     * @return El nombre de la prueba
     */
    public String getName() {
        return name;
    }

    /**
     * Método que nos permite saber el nombre del master
     * @return El nombre del master
     */
    public String getNom() {
        return nom;
    }

    /**
     * Método que nos permite saber si la prueba esta en uso
     * @return true si está en uso, false si no lo está
     */
    public boolean isInUse() {
        return inUse;
    }

    /**
     * Método que nos permite saber el número de créditos del master
     * @return El numero de créditos del master
     */
    public int getNumberCredits() {
        return numberCredits;
    }

    /**
     * Método que nos retorna la probabilidad de aprobar el master
     * @return La probabilidad de aprobar
     */
    public int getProbability() {
        return probability;
    }
}
