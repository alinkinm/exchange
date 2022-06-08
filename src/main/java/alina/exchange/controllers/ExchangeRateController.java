package alina.exchange.controllers;

import alina.exchange.services.impl.CurrencyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class ExchangeRateController {

    private final CurrencyServiceImpl currencyService;

    @GetMapping(value = "{currencyCode}")
    public ResponseEntity<String> checkRate (@PathVariable String currencyCode) {
        return ResponseEntity.ok(currencyService.checkCurrencyToUsd(currencyCode));
    }

}
