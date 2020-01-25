package com.magmik.example.service;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.mock.HttpMethod;
import feign.mock.MockClient;
import feign.mock.MockTarget;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class QuotesServiceTest {


    private DataService dataService;
    private MockClient mockClient;

    @Before
    public void setup() throws IOException {
        mockClient = new MockClient()
                .noContent(HttpMethod.PATCH, "/repos/velo/feign-mock/contributors");

        dataService = Feign.builder()
                .decoder(new GsonDecoder())
                .client(mockClient)
                .target(new MockTarget<>(DataService.class));
    }

    @Test
    public void missHttpMethod() {
//        List<Contributor> result = dataService.patchContributors("velo", "feign-mock");
//        assertThat(result, nullValue());
//        mockClient.verifyOne(HttpMethod.PATCH, "/repos/velo/feign-mock/contributors");
    }
}