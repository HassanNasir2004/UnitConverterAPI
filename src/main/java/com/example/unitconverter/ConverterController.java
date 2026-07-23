package com.example.unitconverter;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/convert")
public class ConverterController {

    @GetMapping("/temperature")
    public double convertTemperature(@RequestParam double value, @RequestParam String direction) {
        return direction.equalsIgnoreCase("C_TO_F") ?
            TemperatureConverter.celsiusToFahrenheit(value) :
            TemperatureConverter.fahrenheitToCelsius(value);
    }

    @GetMapping("/weight")
    public double convertWeight(@RequestParam double value, @RequestParam String direction) {
        return direction.equalsIgnoreCase("KG_TO_LBS") ?
            WeightConverter.kgToPounds(value) :
            WeightConverter.poundsToKg(value);
    }

    @GetMapping("/length")
    public double convertLength(@RequestParam double value, @RequestParam String direction) {
        return direction.equalsIgnoreCase("M_TO_FT") ?
            LengthConverter.metersToFeet(value) :
            LengthConverter.feetToMeters(value);
    }
}