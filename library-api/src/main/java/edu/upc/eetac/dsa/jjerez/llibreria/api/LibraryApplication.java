package edu.upc.eetac.dsa.jjerez.llibreria.api;

import org.glassfish.jersey.linking.DeclarativeLinkingFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class LibraryApplication extends ResourceConfig{
	public LibraryApplication() {
		super();
		register(DeclarativeLinkingFeature.class);
	}
}
