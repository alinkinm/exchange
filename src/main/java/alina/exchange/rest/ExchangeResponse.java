package alina.exchange.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.Map;

@Getter
@Data
public class ExchangeResponse {
    private String disclaimer;
    private String license;
    private String timestamp;
    private String base;
    private Map<String, Double> rates;

    public String getDisclaimer() {
        return disclaimer;
    }

    public String getLicense() {
        return license;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getBase() {
        return base;
    }

    public Map<String, Double> getRates() {
        return rates;
    }
}
