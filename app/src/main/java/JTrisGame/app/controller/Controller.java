package JTrisGame.app.controller;

import JTrisGame.app.model.Tris;
public class Controller {

    private final Tris tris;

    public Controller(Tris game){
        this.tris = game;
    }

    public void trisSetCasella(int i, int j){
        this.tris.setCasella(i,j);
    }

    public void trisRestart(){
        this.tris.restart();
    }
}
