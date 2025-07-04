package services.GestionAnimal;

import entities.GestionAnimal.Suivi;
import java.util.List;

public interface ISuiviService {
    void addSuivi(Suivi suivi);
    void updateSuivi(Suivi suivi);
    void deleteSuivi(int id);
    List<Suivi> getAllSuivis();
    Suivi getSuiviById(int id);
}