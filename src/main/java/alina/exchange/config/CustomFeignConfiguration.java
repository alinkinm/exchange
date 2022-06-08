package alina.exchange.config;

import org.springframework.context.annotation.Bean;
import feign.okhttp.OkHttpClient;

public class CustomFeignConfiguration {
    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }
}
