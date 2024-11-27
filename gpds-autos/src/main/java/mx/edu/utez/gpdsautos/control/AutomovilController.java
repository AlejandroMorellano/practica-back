package mx.edu.utez.gpdsautos.control;

import mx.edu.utez.gpdsautos.model.Automovil;
import mx.edu.utez.gpdsautos.service.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/automoviles/cambia")
public class AutomovilController {

    public ResponseEntity<String> someMethod() {
        return ResponseEntity.ok("Funcionando");
    }
}
