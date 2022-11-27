package org.example;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.sparql.vocabulary.FOAF;

public class TransformerImpl implements Transformer {

    @Override
    public Model transform(Model model) {
        return model;
    }
}
