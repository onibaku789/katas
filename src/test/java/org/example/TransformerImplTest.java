package org.example;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFParser;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Optional;

class TransformerImplTest {

    private TransformerImpl transformer;

    @BeforeEach
    void setUp() {
        transformer = new TransformerImpl();
    }

    @Test
    @Order(1)
    void transformShouldProduceIsomorphicGraph() {
        Model inputModel = loadModel("example.ttl");
        Model expectedModel = loadModel("result.ttl");
        Assertions.assertThat(transformer.transform(inputModel))
                .satisfies(model -> model.isIsomorphicWith(expectedModel));
    }

    private Model loadModel(String pathToResource) {
        return RDFParser.create()
                .lang(Lang.TTL)
                .source(getResource(pathToResource))
                .toModel();
    }

    private Path getResource(String fileName) {
        return Optional.ofNullable(TransformerImplTest.class.getClassLoader().getResource(fileName))
                .map(this::convertToPath)
                .orElseThrow(() -> new IllegalArgumentException("Could not find resource: %s".formatted(fileName)));
    }

    private Path convertToPath(URL url) {
        try {
            return Path.of(url.toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}