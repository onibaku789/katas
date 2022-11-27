package org.example;

import org.apache.jena.rdf.model.Model;

public interface Transformer {

    Model transform(Model model);
}
