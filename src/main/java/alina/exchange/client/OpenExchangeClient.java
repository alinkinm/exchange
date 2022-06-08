package alina.exchange.client;

import alina.exchange.config.CustomFeignConfiguration;
import alina.exchange.rest.ExchangeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "openExchangeClient",
        url = "${app.feign.config.exchange_url}",
        configuration = CustomFeignConfiguration.class
)
public interface OpenExchangeClient {

    @RequestMapping(method = RequestMethod.GET, value = "${app.feign.config.exchange_latest}")
    ExchangeResponse getCurrencies();

    @RequestMapping(method = RequestMethod.GET, value="${app.feign.config.exchange_past}")
    ExchangeResponse getPastCurrencies(@PathVariable(value = "date") String date);
}
