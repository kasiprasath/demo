package com;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="app")
@ViewScoped

public class Application implements Serializable{

	private static final long serialVersionUID = 1L;
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
