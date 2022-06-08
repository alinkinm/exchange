package alina.exchange.controllerTests;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import alina.exchange.exceptions.NoSuchCurrencyException;
import alina.exchange.services.impl.CurrencyServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ExchangeRateControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CurrencyServiceImpl currencyService;

    @Test
    public void check_right_rate_test() throws Exception {
        when(currencyService.checkCurrencyToUsd("RUB")).thenReturn("gif's link");
        mockMvc.perform(get("/{currencyCode}", "RUB"))
                .andExpect(status().isOk());
    }

    @Test
    public void check_wrong_rate_test() throws Exception {
        when(currencyService.checkCurrencyToUsd("QWER")).thenThrow(new NoSuchCurrencyException("QWER"));
        mockMvc.perform(get("/{currencyCode}", "QWER"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void check_empty_request() throws Exception {
        mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

}
