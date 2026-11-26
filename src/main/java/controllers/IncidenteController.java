package controllers;

import java.util.List;
import models.Incidente;
import java.util.Comparator;

public class IncidenteController {
    public List<Incidente> sort(List<Incidente> incidentes) {
        
        incidentes.sort(null);
        return incidentes;
    }

    public int busquedaBinaria(List<Incidente> incidentes, Incidente objetivo) {
    int bajo = 0;
    int alto = incidentes.size() - 1;

    while (bajo <= alto) {
        int mid = bajo + (alto - bajo) / 2;
        int com = incidentes.get(mid).compareTo(objetivo);

        if (com == 0) {
            return mid;
        }
        if (com < 0) {
            bajo = mid + 1;
        } else { 
            alto = mid - 1;
        }
    }
    return -1;
}

}
