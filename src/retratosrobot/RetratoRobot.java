package retratosrobot;

import java.util.ArrayList;

public class RetratoRobot {

    private ArrayList<String> pelo;
    private ArrayList<String> ojos;
    private ArrayList<String> orejasNariz;
    private ArrayList<String> boca;
    private ArrayList<String> barbilla;

    private int peloSel;
    private int ojosSel;
    private int orejasNarizSel;
    private int bocaSel;
    private int barbillaSel;

    private void inicializarRasgos() {
        pelo = new ArrayList<>();
        ojos = new ArrayList<>();
        orejasNariz = new ArrayList<>();
        boca = new ArrayList<>();
        barbilla = new ArrayList<>();

        pelo.add("wwwwwwww");
        pelo.add("|||||||");
        pelo.add("\\\\\\//////");
        pelo.add("|||||||||");

        ojos.add("| o   o |");
        ojos.add("| - ( * * ) - |");
        ojos.add("| - (o o) - |");
        ojos.add("| \\     /  |");

        orejasNariz.add("@   J   @");
        orejasNariz.add("[   j   ]");
        orejasNariz.add("<   -   >");

        boca.add("  ---  ");
        boca.add("  ___  ");
        boca.add("  ===  ");
        boca.add("   -   ");
        
        barbilla.add("\\_______/");
        barbilla.add("\\'''''''/");

    }

	public ArrayList<String> getPelo() {
		return pelo;
	}

	public void setPelo(ArrayList<String> pelo) {
		this.pelo = pelo;
	}

	public ArrayList<String> getOjos() {
		return ojos;
	}

	public void setOjos(ArrayList<String> ojos) {
		this.ojos = ojos;
	}

	public ArrayList<String> getOrejasNariz() {
		return orejasNariz;
	}

	public void setOrejasNariz(ArrayList<String> orejasNariz) {
		this.orejasNariz = orejasNariz;
	}

	public ArrayList<String> getBoca() {
		return boca;
	}

	public void setBoca(ArrayList<String> boca) {
		this.boca = boca;
	}

	public ArrayList<String> getBarbilla() {
		return barbilla;
	}

	public void setBarbilla(ArrayList<String> barbilla) {
		this.barbilla = barbilla;
	}

	public int getPeloSel() {
		return peloSel;
	}

	public void setPeloSel(int peloSel) {
		this.peloSel = peloSel;
	}

	public int getOjosSel() {
		return ojosSel;
	}

	public void setOjosSel(int ojosSel) {
		this.ojosSel = ojosSel;
	}

	public int getOrejasNarizSel() {
		return orejasNarizSel;
	}

	public void setOrejasNarizSel(int orejasNarizSel) {
		this.orejasNarizSel = orejasNarizSel;
	}

	public int getBocaSel() {
		return bocaSel;
	}

	public void setBocaSel(int bocaSel) {
		this.bocaSel = bocaSel;
	}

	public int getBarbillaSel() {
		return barbillaSel;
	}

	public void setBarbillaSel(int barbillaSel) {
		this.barbillaSel = barbillaSel;
	}
}