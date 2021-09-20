package dev.drf.maven.plugin.open.api;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "converter")
public class ConverterMojo extends AbstractMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("OpenApi to Java plugin working");
    }
}
