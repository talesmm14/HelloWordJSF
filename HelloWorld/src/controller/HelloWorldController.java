package controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorldController implements Serializable {
	private static final long serialVersionUID = 4585283208089720699L;

}