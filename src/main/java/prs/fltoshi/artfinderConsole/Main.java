package prs.fltoshi.artfinderConsole;

import prs.fltoshi.artfinderConsole.control.ArtifactHunting;
import prs.fltoshi.artfinderConsole.control.LocationCreate;

public class Main {
    public static void main(String[] args) {
        ArtifactHunting artifactHunting = new ArtifactHunting();
        artifactHunting.mainProcess();
    }
}