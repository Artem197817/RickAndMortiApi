package gb.RickAndMortiApi.service;

import gb.RickAndMortiApi.domain.Characters;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceApiImpl implements ServiceApi {

    @Autowired
    private RestTemplate template;
    @Autowired
    private HttpHeaders headers;

    private final PropertiesUrlRequest propertiesUrlRequest;
    @Override
    public Characters getAllCharacters() {
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<Characters> responce = template.exchange(propertiesUrlRequest.getCHARACTER_API(), HttpMethod.GET,entity, Characters.class);
        return responce.getBody();
    }
}
