package alina.exchange.client;

import alina.exchange.config.CustomFeignConfiguration;
import alina.exchange.rest.GiphyResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "giphyClient",
        url = "${app.feign.config.url}",
        configuration = CustomFeignConfiguration.class
)
public interface GiphyClient {

    @RequestMapping(method = RequestMethod.GET, value = "")
    GiphyResponse getGiphy(@RequestParam("tag") String tag, @RequestParam("api_key") String apiKey);

}
