package ma.ac.uir.gestionStage.DTO;

public class NiveauDto {

    private int idNiveau;

    private String nomFiliere,niveau;

    public NiveauDto() {
    }

    public NiveauDto(int idNiveau, String nomFiliere, String niveau) {
        this.idNiveau = idNiveau;
        this.nomFiliere = nomFiliere;
        this.niveau = niveau;
    }

    public int getIdNiveau() {
        return idNiveau;
    }

    public void setIdNiveau(int idNiveau) {
        this.idNiveau = idNiveau;
    }

    public String getNomFiliere() {
        return nomFiliere;
    }

    public void setNomFiliere(String nomFiliere) {
        this.nomFiliere = nomFiliere;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "NiveauDto{" +
                "idNiveau=" + idNiveau +
                ", nomFiliere='" + nomFiliere + '\'' +
                ", niveau='" + niveau + '\'' +
                '}';
    }
}
