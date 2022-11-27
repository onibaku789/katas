package org.example;

import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;

public class ExampleVocabulary {
    public static final String NAMESPACE = "<http://example.com/>";
    public static final Resource NAME = ResourceFactory.createResource(NAMESPACE + "name");
    public static final Resource MAILBOX = ResourceFactory.createResource(NAMESPACE + "mailbox");
    public static final Resource NICKNAME = ResourceFactory.createResource(NAMESPACE + "nickname");
    public static final Resource KNOWS = ResourceFactory.createResource(NAMESPACE + "knows");

}
