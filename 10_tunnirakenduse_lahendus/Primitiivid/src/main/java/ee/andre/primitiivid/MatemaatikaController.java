package ee.andre.primitiivid;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/matemaatika")
public class MatemaatikaController {

    @GetMapping("/ruutjuur/{number}")
    public double calculateSquareRoot(@PathVariable Double number) {
        return Math.sqrt(number);
    }

    @GetMapping("/random/{num1}/{num2}")
    public int getRandomNumber(@PathVariable int num1, @PathVariable int num2) {
        Random rand = new Random();
        int randomNum = num1 + rand.nextInt(num2 - num1 + 1);
        return randomNum;
    }

    @GetMapping("/suurem/{num1}/{num2}")
    public String getHigherNumber(@PathVariable Double num1, @PathVariable Double num2) {
        if (num1 > num2) {
            return num1 + " on suurem kui " + num2;
        } else if (num1 < num2) {
            return num2 + " on suurem kui " + num1;
        } else {
            return " Mõlemad numbrid on võrdsed ";
        }
    }

}