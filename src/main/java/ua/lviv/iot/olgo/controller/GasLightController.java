package ua.lviv.iot.olgo.controller;

import com.examplee.lab6L.GasLight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.GasLightService;
import org.springframework.http.HttpStatus;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/gasLight")
public class GasLightController {

    private final GasLightService gasLightService;

    @Autowired
    public GasLightController(GasLightService gasLightService) {
        this.gasLightService = gasLightService;
    }
    @GetMapping("")
    public List<GasLight> getAllGasLights() {
        return gasLightService.getAllGasLights();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GasLight> getGasLightById(@PathVariable Long id) {
        GasLight gasLight = gasLightService.getGasLightById(id);
        return ResponseEntity.ok(gasLight);
    }

    @PostMapping("")
    public ResponseEntity<GasLight> createNewGasLight(@Valid @RequestBody GasLight gasLight) {
        GasLight createdGasLight = gasLightService.createNewGasLight(gasLight);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdGasLight);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GasLight> updateGasLightById(@PathVariable Long id, @Valid @RequestBody GasLight gasLight) {
        GasLight updatedGasLight = gasLightService.updateGasLightById(id, gasLight);
        return ResponseEntity.ok(updatedGasLight);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteGasLightById(@PathVariable Long id) {
        gasLightService.deleteGasLightById(id);
        return ResponseEntity.noContent().build();
    }
}
