package com.vik.plugin.demo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "TestGoal")
public class SayHello extends AbstractMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("Inisde Test Goal Execute ");
    }

}
