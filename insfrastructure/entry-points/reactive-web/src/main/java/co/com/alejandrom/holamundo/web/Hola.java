package co.com.alejandrom.holamundo.web;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Hola {
    private String nombre;
}