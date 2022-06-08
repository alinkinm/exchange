package alina.exchange.services.impl;

import alina.exchange.client.GiphyClient;
import alina.exchange.client.OpenExchangeClient;
import alina.exchange.exceptions.NoSuchCurrencyException;
import alina.exchange.services.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyService {

    private final OpenExchangeClient openExchangeClient;
    private final GiphyClient giphyClient;

    @Override
    public String checkCurrencyToUsd(String currencyCode) {
        double todaysRate = 0.0;
        double yesterdaysRate = 0.0;
        Map<String, Double> rates = openExchangeClient.getCurrencies().getRates();
        Map<String, Double> pastRates = openExchangeClient
                .getPastCurrencies(LocalDate.now().minusDays(1).toString()).getRates();
        for (Map.Entry<String, Double> entry : rates.entrySet()) {
            if (entry.getKey().equals(currencyCode)) {
                todaysRate = entry.getValue();
            }
        }
        for (Map.Entry<String, Double> entry : pastRates.entrySet()) {
            if (entry.getKey().equals(currencyCode)) {
                yesterdaysRate = entry.getValue();
            }
        }

        if (todaysRate==0.0) {
            throw new NoSuchCurrencyException(currencyCode);
        }

        if (todaysRate > yesterdaysRate) {
            return giphyClient.getGiphy("rich", "KlIXGg0eCbUFB5nXKLOjBJEzTnDtQmYg").getData()
                    .getImages().getPreview().getMp4();
        }
        return giphyClient.getGiphy("broke", "KlIXGg0eCbUFB5nXKLOjBJEzTnDtQmYg").getData()
                .getImages().getPreview().getMp4();
    }

}
