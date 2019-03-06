package nl.nazeem.service.add;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
public class AddController {

    @GetMapping(value = "/add/{numbers}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Long getMessage(@PathVariable List<BigInteger> numbers) {
        return numbers.stream().reduce(BigInteger.ZERO, BigInteger::add).longValue();
    }
}
