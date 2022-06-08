package alina.exchange.services;

import java.io.IOException;


public interface CurrencyService {
    String checkCurrencyToUsd(String currencyCode) throws IOException;
}
