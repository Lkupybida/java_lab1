package service;

import com.examplee.lab6L.GasLight;

import java.util.List;

public interface GasLightService {
    List<GasLight> getAllGasLights();
    GasLight getGasLightById(Long id);
    GasLight createNewGasLight(GasLight gasLight);
    GasLight updateGasLightById(Long id, GasLight updetedGasLight);
    void deleteGasLightById(Long id);
}
