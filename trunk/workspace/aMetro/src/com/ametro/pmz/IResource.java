package com.ametro.pmz;

public interface IResource {
	void beginInitialize(FilePackage owner);
	void doneInitialize();
	void parseLine(String line); 
}