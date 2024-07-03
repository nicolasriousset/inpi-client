package fr.neolegal.inpi.v2.client;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import fr.neolegal.inpi.v2.dto.Companies;

public class InpiClientTest {

    ObjectMapper mapper = configureMapper();

    @Test
    void findBySiren() throws IOException {
        String json = getResourceFileAsString("companies-response.json");
        Companies actual = mapper.readValue(json, Companies.class);
        assertEquals(1, actual.size());
    }

    static String getResourceFileAsString(String fileName) throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try (InputStream is = classLoader.getResourceAsStream(fileName)) {
            if (is == null)
                return null;
            try (InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader reader = new BufferedReader(isr)) {
                return reader.lines().collect(Collectors.joining());
            }
        }
    }

    private ObjectMapper configureMapper() {
        JavaTimeModule module = new JavaTimeModule();
        return new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .registerModule(module);
    }

}
