package gb.RickAndMortiApi.service;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@AllArgsConstructor
@ConfigurationProperties(prefix = "url")
public class PropertiesUrlRequest {

    private final String CHARACTER_API;
}
