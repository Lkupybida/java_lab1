package service;

import com.examplee.lab6L.GasLight;
import com.examplee.lab6L.GasLightRepository;
import org.springframework.stereotype.Service;

import javax.ws.rs.NotFoundException;
import java.util.List;

@Service
public class GasLightServicelmpl implements GasLightService {

    private final GasLightRepository gasLightRepository;

    public GasLightServicelmpl(GasLightRepository gasLightRepository) {
        this.gasLightRepository = gasLightRepository;
    }

    @Override
    public List<GasLight> getAllGasLights() {
        return gasLightRepository.findAll();
    }
    @Override
    public GasLight getGasLightById(Long id) {
        return gasLightRepository.findById(id).orElseThrow(() -> new NotFoundException("GasLight not found with id " + id));
    }

    @Override
    public GasLight createNewGasLight(GasLight gasLight) {
        gasLightRepository.save(gasLight);
        return gasLight;
    }

    @Override
    public GasLight updateGasLightById(Long id, GasLight updatedGasLight) {
        GasLight gasLight = getGasLightById(id);
        gasLight.setWorkTimeInMinutes(updatedGasLight.getWorkTimeInMinutes());
        gasLight.setId(updatedGasLight.getId());
        gasLight.setManufacturer(updatedGasLight.getManufacturer());
        gasLight.setName(updatedGasLight.getName());
        gasLight.setModel(updatedGasLight.getModel());
        gasLight.setRange(updatedGasLight.getRange());
        gasLight.setSeats(updatedGasLight.getSeats());
        gasLight.setYear(updatedGasLight.getYear());
        gasLightRepository.save(gasLight);
        return gasLight;
    }
    @Override
    public void deleteGasLightById(Long id) {
        GasLight gasLight = getGasLightById(id);
        gasLightRepository.delete(gasLight);
    }
}
