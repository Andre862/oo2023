package ee.andre.primitiivid;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kurss")
public class KursiController {

    @GetMapping("/dollar/{amount}")
    public String convertToUSD(@PathVariable int amount) {
        double exchangeRate = 1.1;
        int result = (int) (amount * exchangeRate);
        return amount + " eurot on " + result + " dollarit";
    }

    @GetMapping("/nael/{amount}")
    public String convertToGBP(@PathVariable int amount) {
        double exchangeRate = 0.88;
        int result = (int) (amount * exchangeRate);
        return amount + " eurot on " + result + " naela";
    }

    @GetMapping("/kroon/{amount}")
    public String convertToKroon(@PathVariable int amount) {
        double exchangeRate = 15.6466;
        double result = amount * exchangeRate;
        return amount + " eurot on " + String.format("%.2f", result) + " krooni";
    }
}